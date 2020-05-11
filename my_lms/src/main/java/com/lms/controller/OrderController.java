package com.lms.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.controlller.BaseController;
import com.lms.domain.Order;
import com.lms.domain.Vehicle;
import com.lms.domain.coding.CodePrefix;
import com.lms.domain.state.OrderState;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.OrderService;
import com.lms.utils.CodeWorker;
import com.lms.utils.DownloadUtils;
import com.lms.utils.IdWorker;
import com.sun.deploy.ref.CodeRef;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/business")
@CrossOrigin
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private IdWorker idWorker;

    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/order/page",method = RequestMethod.GET)
    public PageResult<Order> findPage(@RequestParam Map<String,Object> param){
        System.out.println(param);
        //分页查询
        IPage<Order> pageOrders = orderService.page(new Page<Order>(
            Long.parseLong(param.get("pagenum").toString()),
            Long.parseLong(param.get("pagesize").toString())),
            new QueryWrapper<Order>()
            .like(!StringUtils.isEmpty(param.get("orderCode").toString()),"order_code", param.get("orderCode").toString())
            .eq(!StringUtils.isEmpty(param.get("status").toString()),"status",param.get("status").toString())
            .like(!StringUtils.isEmpty(param.get("senderMobile").toString()),"sender_mobile",param.get("senderMobile").toString())
            .like(!StringUtils.isEmpty(param.get("receiverMobile").toString()),"receiver_mobile",param.get("receiverMobile").toString())
            .between(!StringUtils.isEmpty(param.get("beginTime").toString()),
                    "create_time",param.get("beginTime").toString(),param.get("endTime").toString())
        );
        //返回数据
        return new PageResult(pageOrders.getTotal(),pageOrders.getRecords());
    }

    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(ResultCode.SUCCESS,orderService.list());
    }

    /**
     * 根据状态查询订单
     * @param status
     * @return
     */
    @RequestMapping(value = "/order/ords/{status}",method = RequestMethod.GET)
    public Result findByStatus(@PathVariable("status") String status){
        return new Result(ResultCode.SUCCESS,
                orderService.list(
                 new QueryWrapper<Order>().eq("status",status)
                )
        );
    }

    /**
     * 取消订单 修改状态
     * @param
     * @return
     */
    @RequestMapping(value = "/order/cancelOrder/{id}",method = RequestMethod.GET)
    public Result cancelOrder(@PathVariable("id") String id){
        Order order = orderService.getById(id);
        order.setStatus(OrderState.VOIDED);
        orderService.updateById(order);
        return new Result(ResultCode.SUCCESS);
    }



    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/order/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,orderService.getById(id));
    }

    /**
     * 添加
     * @param order
     * @return
     */
    @RequiresPermissions("api-order-add")
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public Result save(@RequestBody Order order){
        order.setId(idWorker.nextId()+"");
        order.setOrderCode(CodeWorker.codeGenerate(CodePrefix.ORDER_PREFIX));
        order.setCreateTime(new Date());
        order.setStatus("0"); //待分配状态
        orderService.save(order);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param order
     * @return
     */
    @RequiresPermissions("api-order-edit")
    @RequestMapping(value = "/order/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Order order){
        orderService.updateById(order);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/order/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        orderService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 查询订单分配信息(信息的回显)
     * @param
     * @return
     */
    @RequestMapping(value = "/order/allocate/{id}",method = RequestMethod.GET)
    public Result findAllocateInfo(@PathVariable("id") String id){
        Order order = orderService.getById(id);
        Map<String,Object>  resultMap = new HashMap<>();
        //查询订单分配信息
        resultMap.put("allocateVehs",order.getEmployVehId() !=null? JSON.parseArray
                (order.getEmployVehId(),String.class):new ArrayList<>(0));
        resultMap.put("allocateEmps",order.getEmployEmpId() !=null?JSON.parseArray
                (order.getEmployEmpId(),String.class):new ArrayList<>(0));
        resultMap.put("allocateWhos",order.getEmployWhId() !=null?JSON.parseArray
                (order.getEmployWhId(),String.class):new ArrayList<>(0));
        return new Result(ResultCode.SUCCESS,resultMap);
    }

    /**
     * 分配订单
     */
    @RequiresPermissions("api-order-allocate")
    @RequestMapping(value = "/order/allocate",method = RequestMethod.POST)
    public Result allocateOrder(@RequestBody Map<String,Object> map ){
            orderService.allocateOrder(map);
            return new Result(ResultCode.SUCCESS);
    }

    /**
     * 分配订单
     */
    @RequestMapping(value = "/findtest",method = RequestMethod.GET)
    public List<Vehicle> findtest(){
        return orderService.findtest();
    }


    /**
     * 订单报表
     */
    @RequestMapping(value = "/order/export",method = RequestMethod.GET)
    public void export() throws IOException {
          //构造列表数据
        List<Order> list = orderService.list(
                new QueryWrapper<Order>()
                 .ne("status",OrderState.VOIDED)
                 .orderByDesc("create_time")

        );

        //创建工作簿
        XSSFWorkbook workbook = new XSSFWorkbook();
        //3.构造sheet
        String[] titles = {"编号", "订单来源", "客户","货物名称", "货物类型", "数量", "重量(kg)",
        "支付方式", "总收入(元)","下达时间","完成时间"};

        //创建Sheet表
        XSSFSheet sheet = workbook.createSheet();

        Row row = sheet.createRow(0);
        //构造标题
        AtomicInteger headersAi = new AtomicInteger();
        for (String title : titles) {
            Cell cell = row.createCell(headersAi.getAndIncrement());
            cell.setCellValue(title);
        }
        //构造数据
        AtomicInteger datasAi = new AtomicInteger(1);

        //时间转换器
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Cell cell = null;
        for (Order report : list) {
            Row dataRow = sheet.createRow(datasAi.getAndIncrement());
            //编号
            cell = dataRow.createCell(0);
            cell.setCellValue(report.getOrderCode());
            //订单来源
            cell = dataRow.createCell(1);
            cell.setCellValue(report.getOrderSource());
//            {"编号", "订单来源", "客户","货物名称", "货物类型", "数量", "重量","支付方式", "总收入","下达时间","完成时间"};
            //客户
            cell = dataRow.createCell(2);
            cell.setCellValue(report.getCustomer());
            //货物名称
            cell = dataRow.createCell(3);
            cell.setCellValue(report.getGoodsName());
            //货物类型
            cell = dataRow.createCell(4);
            cell.setCellValue(report.getGoodsType());
            //数量
            cell = dataRow.createCell(5);
            cell.setCellValue(report.getGoodsCount());
            //重量
            cell = dataRow.createCell(6);
            cell.setCellValue(report.getGoodsWeight());
            //支付方式
            cell = dataRow.createCell(7);
            cell.setCellValue(report.getSettlementType());
            //总收入
            cell = dataRow.createCell(8);
            cell.setCellValue(report.getTotalCost());
            //下达时间
            cell = dataRow.createCell(9);
            cell.setCellValue(formatter.format(report.getCreateTime()));
            //完成时间
            cell = dataRow.createCell(10);
            cell.setCellValue(
                    report.getCompleteTime()!=null?formatter.format(report.getCompleteTime()):"0"
            );
        }
        //完成下载
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //字节输出流
        workbook.write(bos);
        new DownloadUtils().download(bos,response,"订单报表.xlsx");
    }


}


package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Waybill;
import com.lms.domain.coding.CodePrefix;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.WaybillService;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 运单表信息 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/waybill")
@CrossOrigin
public class WaybillController {
    @Autowired
    private WaybillService waybillService;

    @Autowired
    private IdWorker idWorker;

    /**
     * 查询分页
     * @return
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public PageResult<Waybill> findPage(@RequestParam Map<String,Object> param){
        //分页查询
        IPage<Waybill> pageWaybills = waybillService.page(new Page<Waybill>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<Waybill>()
                .eq(!StringUtils.isEmpty(param.get("waybCode").toString()),"wayb_code", param.get("waybCode").toString())
                .eq(!StringUtils.isEmpty(param.get("outletId").toString()),"outlet_id", param.get("outletId").toString())
                .like(!StringUtils.isEmpty(param.get("sender").toString()),"sender", param.get("sender").toString())
                .like(!StringUtils.isEmpty(param.get("senderMobile").toString()),"sender_mobile", param.get("senderMobile").toString())
                .like(!StringUtils.isEmpty(param.get("receiver").toString()),"receiver", param.get("receiver").toString())
                .like(!StringUtils.isEmpty(param.get("receMobile").toString()),"rece_mobile", param.get("receMobile").toString())
                .between(!StringUtils.isEmpty(param.get("beginTime").toString()),
                        "transport_time",param.get("beginTime").toString(),param.get("endTime").toString())
        );
        //返回数据
        return new PageResult(pageWaybills.getTotal(),pageWaybills.getRecords());
    }


    /**
     * 根据运单编号查询运单
     * @return
     */
    @RequestMapping(value = "/wayb/{waybcode}",method = RequestMethod.GET)
    public Result findByWaybCode(@PathVariable("waybcode")  String waybcode ){
        return new Result(ResultCode.SUCCESS,waybillService
                .getOne(new QueryWrapper<Waybill>().eq("wayb_code",waybcode))
        );
    }
    /**
     * 根据不同条件查询运单
     * @return
     */
    @RequestMapping(value = "/waybs/{status}",method = RequestMethod.GET)
    public Result findByStatus(@PathVariable("status")  String status ){
        return new Result(ResultCode.SUCCESS,waybillService
            .list(new QueryWrapper<Waybill>()
             .eq("status",status)
            ));
    }

    /**
     * 根据传递的条件查询
     * @return
     */
    @RequestMapping(value = "/wayb/{param}/{condition}",method = RequestMethod.GET)
    public Result findByCondition(@PathVariable("param") String param,
         @PathVariable("condition") String condition){
        Result result = new Result(ResultCode.SUCCESS);
        switch (condition){
            case "waybCode":
            result.setData(waybillService.list(
                    new QueryWrapper<Waybill>()
                    .eq("wayb_code",param)
            ));
            break;
            case "senderMobile":
            result.setData(waybillService.list(
                    new QueryWrapper<Waybill>()
                    .eq("sender_mobile",param)
            ));
                break;
            case "sender":
            result.setData(waybillService.list(
                    new QueryWrapper<Waybill>()
                            .eq("sender",param)
            ));
            break;
            case "receMobile":
            result.setData(waybillService.list(
                    new QueryWrapper<Waybill>()
                    .eq("rece_mobile",param)
            ));
            break;
            case "receiver":
            result.setData(waybillService.list(
            new QueryWrapper<Waybill>()
                    .eq("receiver",param)
            ));
            break;
            default:
                result.setData(null);
                break;
        }
        return result;
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,waybillService.getById(id));
    }

    /**
     * 添加
     * @param waybill
     * @return
     */
    @RequiresPermissions("api-waybill-add")
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Result save(@RequestBody Waybill waybill){
        waybill.setWaybId(idWorker.nextId()+"");
        waybill.setWaybCode(CodeWorker.codeGenerate(CodePrefix.WAYBILL_PREFIX));
        waybill.setTransportTime(new Date());
        waybill.setStatus("1"); //待发运状态
        waybill.setSignforStatus("0");//未签收
        waybillService.save(waybill);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param waybill
     * @return
     */
    @RequiresPermissions("api-waybill-edit")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Waybill waybill){
        waybillService.updateById(waybill);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        waybillService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

}


package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Warehouse;
import com.lms.domain.coding.CodePrefix;
import com.lms.domain.info.response.WareStatics;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.WarehouseService;
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
 * 仓库表信息 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/capacity")
@CrossOrigin
public class WarehouseController {


    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/warehouse/page",method = RequestMethod.GET)
    public PageResult<Warehouse> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Warehouse> pageWarehouses = warehouseService.page(new Page<Warehouse>(
                        Long.parseLong(param.get("pagenum").toString()),
                        Long.parseLong(param.get("pagesize").toString())),
                new QueryWrapper<Warehouse>()
                        .eq(!StringUtils.isEmpty(param.get("whCode").toString()),"wh_code", param.get("whCode").toString())
                        .like(!StringUtils.isEmpty(param.get("whName").toString()),"wh_name", param.get("whName").toString())
                        .eq(!StringUtils.isEmpty(param.get("whOutletId").toString()),"wh_outlet_id", param.get("whOutletId").toString())
        );
        //返回数据
        return new PageResult(pageWarehouses.getTotal(),pageWarehouses.getRecords());
    }

    /**
     * 查询所有仓库
     * @return
     */
    @RequestMapping(value = "/warehouse/list",method = RequestMethod.GET)
    public Result findAll(){
         return new Result(ResultCode.SUCCESS, warehouseService.list());
    }

    /**
     * 查询可分配的仓库
     * @param outletid
     * @return
     */
    @RequestMapping(value = "/warehouse/wares/{outletid}",method = RequestMethod.GET)
    public Result findByOutletIdAndStatus(@PathVariable(value = "outletid") String outletid){
        return new Result(ResultCode.SUCCESS,
                warehouseService.list(new QueryWrapper<Warehouse>()
                        .eq("status","1")
                        .eq("wh_outlet_id",outletid)));
    }

    /**
     * 查询仓库的详情
     * @param
     * @return
     */
    @RequiresPermissions("api-warehouse-info")
    @RequestMapping(value = "/warehouse/info/{outletid}/{whid}",method = RequestMethod.GET)
    public Result findWarehouseInfo(@PathVariable("outletid") String outletid,@PathVariable("whid") String whid ){
       return new Result(ResultCode.SUCCESS,warehouseService.findWarehouseInfo(outletid,whid));
    }

    /**
     * 运力资源统计
     * @param
     * @return
     */
    @RequestMapping(value = "/warehouse/capacityInfo",method = RequestMethod.GET)
    public Result findCapacityInfo(){
        return new Result(ResultCode.SUCCESS,warehouseService.findCapacityInfo());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/warehouse/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,warehouseService.getById(id));
    }

    /**
     * 添加
     * @param warehouse
     * @return
     */
    @RequiresPermissions("api-warehouse-add")
    @RequestMapping(value = "/warehouse",method = RequestMethod.POST)
    public Result save(@RequestBody Warehouse warehouse){
        warehouse.setId(idWorker.nextId()+"");
        warehouse.setWhCode(CodeWorker.codeGenerate(CodePrefix.WAREHOUSE_PREFIX));
        warehouse.setCreateTime(new Date());
        warehouse.setStatus("1"); //启用状态
        warehouse.setOccupation(0f); //初始化占用量
        warehouseService.save(warehouse);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param warehouse
     * @return
     */
    @RequiresPermissions("api-warehouse-edit")
    @RequestMapping(value = "/warehouse/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Warehouse warehouse){
        warehouseService.updateById(warehouse);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-warehouse-del")
    @RequestMapping(value = "/warehouse/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        warehouseService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据容量统计仓库数据
     * @param
     * @return
     */
    @RequestMapping(value = "/warehouse/wareStatics",method = RequestMethod.GET)
    public Result wareStatics(){
        WareStatics wareStatics = warehouseService.wareStatics();
        return new Result(ResultCode.SUCCESS,wareStatics);
    }
}


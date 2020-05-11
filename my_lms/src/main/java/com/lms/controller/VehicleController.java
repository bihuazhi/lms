package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Vehicle;
import com.lms.domain.coding.CodePrefix;
import com.lms.domain.state.VehicleState;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.VehicleService;
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
 * 车辆信息表 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/capacity")
@CrossOrigin
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/vehicle/page",method = RequestMethod.GET)
    public PageResult<Vehicle> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Vehicle> pageVehicles = vehicleService.page(new Page<Vehicle>(
                        Long.parseLong(param.get("pagenum").toString()),
                        Long.parseLong(param.get("pagesize").toString())),
                new QueryWrapper<Vehicle>()
               .like(!StringUtils.isEmpty(param.get("license").toString()),"license", param.get("license").toString())
               .eq(!StringUtils.isEmpty(param.get("vhCode").toString()),"driver", param.get("vhCode").toString())
               .eq(!StringUtils.isEmpty(param.get("vhOutletId").toString()),"vh_outlet_id", param.get("vhOutletId").toString())
            );
        //返回数据
        return new PageResult(pageVehicles.getTotal(),pageVehicles.getRecords());
    }

    /**
     * 查询可分配的车辆(根据网点id和状态查询)
     * @return
     */

    @RequestMapping(value = "/vehicle/vehs/{outletid}",method = RequestMethod.GET)
    public Result findByOutletIdAndStatus(@PathVariable("outletid") String outletid){
        return new Result(ResultCode.SUCCESS,vehicleService.list(
                new QueryWrapper<Vehicle>()
                .eq("status","1") //状态空闲
                .eq("vh_outlet_id",outletid) //网点id
        ));
    }

    /**
     * 车辆返回
     * @return
     */

    @RequestMapping(value = "/vehicle/return/{id}",method = RequestMethod.GET)
    public Result vehReturn(@PathVariable("id") String id){
        Vehicle vehicle = vehicleService.getById(id);
        vehicle.setStatus(VehicleState.ENABLED_USE);
        vehicleService.updateById(vehicle); //修改状态
        return new Result(ResultCode.SUCCESS);
    }

    //查询所有车辆
    @RequestMapping(value = "/vehicle/list",method = RequestMethod.GET)
    public Result findAll(@PathVariable("id") String id){
       return new Result(ResultCode.SUCCESS,vehicleService.list());
    }



    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/vehicle/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,vehicleService.getById(id));
    }

    /**
     * 添加
     * @param vehicle
     * @return
     */
    @RequiresPermissions("api-vehicle-add")
    @RequestMapping(value = "/vehicle",method = RequestMethod.POST)
    public Result save(@RequestBody Vehicle vehicle){
        vehicle.setId(idWorker.nextId()+"");
        vehicle.setVhCode(CodeWorker.codeGenerate(CodePrefix.VEHICLE_PREFIX));
        vehicle.setCreateTime(new Date());
        vehicle.setStatus("1"); //空闲状态
        vehicleService.save(vehicle);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param vehicle
     * @return
     */
    @RequiresPermissions("api-vehicle-edit")
    @RequestMapping(value = "/vehicle/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Vehicle vehicle){
        vehicleService.updateById(vehicle);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-vehicle-del")
    @RequestMapping(value = "/vehicle/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        Vehicle vehicle = vehicleService.getById(id);
        if(!vehicle.getStatus().equals(VehicleState.ENABLED_USE)){
            return new Result(ResultCode.FAIL); //如果状态不是空闲无法删除
        }
        vehicleService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


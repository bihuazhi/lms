package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.InterWarehouse;
import com.lms.domain.coding.CodePrefix;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.InterWarehouseService;
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
 * 入库记录表信息 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/capacity")
@CrossOrigin
public class InterWarehouseController {


    @Autowired
    private InterWarehouseService interWarehouseService;

    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/interWarehouse/page",method = RequestMethod.GET)
    public PageResult<InterWarehouse> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<InterWarehouse> pageInterWarehouses = interWarehouseService.page(new Page<InterWarehouse>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<InterWarehouse>()
        .eq(!StringUtils.isEmpty(param.get("interCode").toString()),"inter_code", param.get("interCode").toString())
        .like(!StringUtils.isEmpty(param.get("goodsName").toString()),"goods_name", param.get("goodsName").toString())
        .eq(!StringUtils.isEmpty(param.get("interWhId").toString()),"inter_wh_id", param.get("interWhId").toString())
        );
        //返回数据
        return new PageResult(pageInterWarehouses.getTotal(),pageInterWarehouses.getRecords());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/interWarehouse/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,interWarehouseService.getById(id));
    }

    /**
     * 添加
     * @param
     * @return
     */
    @RequiresPermissions("api-interwarehouse-add")
    @RequestMapping(value = "/interWarehouse",method = RequestMethod.POST)
    public Result save(@RequestBody Map<String,Object> map){
        interWarehouseService.goodsInterWarehouse(map);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param interWarehouse
     * @return
     */
    @RequestMapping(value = "/interWarehouse/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody InterWarehouse interWarehouse){
        interWarehouseService.updateById(interWarehouse);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/interWarehouse/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        interWarehouseService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


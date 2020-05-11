package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.OuterWarehouse;
import com.lms.domain.coding.CodePrefix;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.OuterWarehouseService;
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
 * 出库信息表 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/capacity")
@CrossOrigin
public class OuterWarehouseController {
    @Autowired
    private OuterWarehouseService outerWarehouseService;
    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/outerWarehouse/page",method = RequestMethod.GET)
    public PageResult<OuterWarehouse> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<OuterWarehouse> pageOuterWarehouses = outerWarehouseService.page(new Page<OuterWarehouse>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<OuterWarehouse>()
        .eq(!StringUtils.isEmpty(param.get("outerCode").toString()),"outer_code", param.get("outerCode").toString())
        .like(!StringUtils.isEmpty(param.get("goodsName").toString()),"goods_name", param.get("goodsName").toString())
        .like(!StringUtils.isEmpty(param.get("outerWhId").toString()),"outer_wh_id", param.get("outerWhId").toString())
        );
        //返回数据
        return new PageResult(pageOuterWarehouses.getTotal(),pageOuterWarehouses.getRecords());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/outerWarehouse/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,outerWarehouseService.getById(id));
    }

    /**
     * 添加
     * @param
     * @return
     */
    @RequiresPermissions("api-outerwarehouse-add")
    @RequestMapping(value = "/outerWarehouse",method = RequestMethod.POST)
    public Result save(@RequestBody Map<String,Object> map){
        /*outerWarehouse.setId(idWorker.nextId()+"");
        outerWarehouse.setOuterCode(CodeWorker.codeGenerate(CodePrefix.OUTERWAREHOUSE_PREFIX));
        outerWarehouse.setCreateTime(new Date());*/
        outerWarehouseService.goodsOuterWarehouse(map);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param outerWarehouse
     * @return
     */
    @RequestMapping(value = "/outerWarehouse/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody OuterWarehouse outerWarehouse){
        outerWarehouseService.updateById(outerWarehouse);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/outerWarehouse/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        outerWarehouseService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Outlet;
import com.lms.domain.coding.CodePrefix;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.OutletService;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 网点表信息 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/info")
@CrossOrigin
public class OutletsController {
    @Autowired
    private OutletService outletService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
            */
    @RequestMapping(value = "/outlet/page",method = RequestMethod.GET)
    public PageResult<Outlet> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Outlet> pageOutlets = outletService.page(new Page<Outlet>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
                new QueryWrapper<Outlet>()
                        .eq(!StringUtils.isEmpty(param.get("outletCode").toString()),"outlet_code", param.get("outletCode").toString())
                        .like(!StringUtils.isEmpty(param.get("outletName").toString()),"outlet_name", param.get("outletName").toString())
        );
        //返回数据
        return new PageResult(pageOutlets.getTotal(),pageOutlets.getRecords());
    }

    /**
     * 查询网点和仓库信息
     * @return
     */
    @RequestMapping(value = "/outlet/outs/wares",method = RequestMethod.GET)
    public Result findOutletAndWarehouse(){
        return new Result(ResultCode.SUCCESS,outletService.findOutletAndWarehouse());
    }

    /**
     * 查询所有网点
     * @param
     * @return
     */
    @RequestMapping(value = "/outlet/list",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(ResultCode.SUCCESS,outletService.list());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/outlet/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,outletService.getById(id));
    }



    /**
     * 添加
     * @param outlet
     * @return
     */
    @RequiresPermissions("api-outlet-add")
    @RequestMapping(value = "/outlet",method = RequestMethod.POST)
    public Result save(@RequestBody Outlet outlet){
        outlet.setId(idWorker.nextId()+"");
        outlet.setOutletCode(CodeWorker.codeGenerate(CodePrefix.OUTLET_PREFIX));
        outlet.setStatus("1"); //运行状态
        outlet.setCreateTime(new Date());
        outletService.save(outlet);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param outlet
     * @return
     */
    @RequiresPermissions("api-outlet-edit")
    @RequestMapping(value = "/outlet/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Outlet outlet){
        outletService.updateById(outlet);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-outlet-del")
    @RequestMapping(value = "/outlet/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        outletService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


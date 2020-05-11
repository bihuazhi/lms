package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Permission;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.PermissionService;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/sys")
@CrossOrigin
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @Autowired
    private IdWorker idWorker;

    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/permission/page",method = RequestMethod.GET)
    public PageResult<Permission> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Permission> pagePermissions = permissionService.page(new Page<Permission>(
                        Long.parseLong(param.get("pagenum").toString()),
                        Long.parseLong(param.get("pagesize").toString()))
         );
        //返回数据
        return new PageResult(pagePermissions.getTotal(),pagePermissions.getRecords());
    }


    /**
     * 查询所有权限信息
     * @return
     */
    @RequestMapping(value = "/permission/list",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(ResultCode.SUCCESS,permissionService.list());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/permission/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,permissionService.getById(id));
    }

    /**
     * 添加
     * @param permission
     * @return
     */
    @RequiresPermissions("api-permission-add")
    @RequestMapping(value = "/permission",method = RequestMethod.POST)
    public Result save(@RequestBody Permission permission){
        permission.setId(idWorker.nextId()+"");
        permissionService.save(permission);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param permission
     * @return
     */
    @RequiresPermissions("api-permission-edit")
    @RequestMapping(value = "/permission/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Permission permission){
        permissionService.updateById(permission);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-permission-del")
    @RequestMapping(value = "/permission/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        permissionService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 查询角色下的权限
     * @return
     */
    @RequestMapping(value = "/permission/perms/roleid",method = RequestMethod.GET)
    public Result findByRoleId(@RequestParam("roleid") String roleid){
        return new Result(ResultCode.SUCCESS,permissionService.findPermsByRoleId(roleid));
    }


}




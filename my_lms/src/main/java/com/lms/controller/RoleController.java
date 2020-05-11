package com.lms.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Role;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.RoleService;
import com.lms.service.UserRoleService;
import com.lms.service.UserService;
import com.lms.utils.IdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
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
public class RoleController {
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/role/page",method = RequestMethod.GET)
    public PageResult<Role> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Role> pageRoles = roleService.page(new Page<Role>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<Role>()
        .like(!StringUtils.isEmpty(param.get("name").toString()),"name", param.get("name").toString()));
        //返回数据
        return new PageResult(pageRoles.getTotal(),pageRoles.getRecords());
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/role/list",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(ResultCode.SUCCESS,roleService.list());
    }

    /**
     * 查询当前用户的下角色
     */
    @RequestMapping(value = "/role/roles/userid",method = RequestMethod.GET)
    public Result findByUserId(@RequestParam("userid") String userid){
        return new Result(ResultCode.SUCCESS,userService.findRolesByUserId(userid));
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/role/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,roleService.getById(id));
    }

    /**
     * 添加
     * @param role
     * @return
     */
    @RequiresPermissions("api-role-add")
    @RequestMapping(value = "/role",method = RequestMethod.POST)
    public Result save(@RequestBody Role role){
        role.setId(idWorker.nextId()+"");
        roleService.save(role);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param role
     * @return
     */
    @RequiresPermissions("api-role-edit")
    @RequestMapping(value = "/role/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Role role){
        roleService.updateById(role);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-role-del")
    @RequestMapping(value = "/role/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        roleService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //分配权限
    @RequiresPermissions("api-permission-allocate")
    @RequestMapping(value = "/role/disPerms",method = RequestMethod.POST)
    public Result disPermission(@RequestBody Map<String,Object> map){
        System.out.println(map);
        try{
            //把权限id转化成数组
            List<String> disPerms =  JSON.parseArray(map.get("disPerms").toString(),String.class);
            roleService.disPermission(disPerms,map.get("roleid").toString());
            return new Result(ResultCode.SUCCESS);
        }catch(Exception e){
            e.printStackTrace();
            return new Result(ResultCode.FAIL);
        }
    }
}


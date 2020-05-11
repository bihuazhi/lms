package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Employee;
import com.lms.domain.coding.CodePrefix;
import com.lms.domain.state.EmployeeState;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.EmployeeService;
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
 * 员工表信息 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/info")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/employee/page",method = RequestMethod.GET)
    public PageResult<Employee> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Employee> pageEmployees = employeeService.page(new Page<Employee>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<Employee>()
        .like(!StringUtils.isEmpty(param.get("empName").toString()),"emp_name", param.get("empName").toString())
        .like(!StringUtils.isEmpty(param.get("empMobile").toString()),"emp_mobile", param.get("empMobile").toString())
        .eq(!StringUtils.isEmpty(param.get("outletId").toString()),"outlet_id", param.get("outletId").toString())
        );
        //返回数据
        return new PageResult(pageEmployees.getTotal(),pageEmployees.getRecords());
    }

    /**
     * 查询可分配的员工(根据网点和状态查询)
     * @return
     */
    @RequestMapping(value = "/employee/emps/{outletid}",method = RequestMethod.GET)
    public Result findByOutletIdAndStatus(@PathVariable("outletid") String outletid){
        return new Result(ResultCode.SUCCESS,employeeService.list(
                new QueryWrapper<Employee>()
                .eq("status","1")
                .eq("outlet_id",outletid)));
    }

    /**
     * 员工返回
     * @return
     */
    @RequestMapping(value = "/employee/return/{id}",method = RequestMethod.GET)
    public Result empReturn(@PathVariable("id") String id){
        Employee employee = employeeService.getById(id);
        employee.setStatus(EmployeeState.ON_DUTY);
        employeeService.updateById(employee);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据是否绑定账户的员工查询员工列表
     * @return
     */
    @RequestMapping(value = "/employee/emps/isbinduser",method = RequestMethod.GET)
    public Result findByisBindUser(@RequestParam("isbinduser") String isbinduser){
        return new Result(ResultCode.SUCCESS,employeeService.list(
        new QueryWrapper<Employee>()
        .eq("bind_user",isbinduser)));
    }

    /**
     * 查询所有员工
     * @return
     */
    @RequestMapping(value = "/employee/list",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(ResultCode.SUCCESS,employeeService.list());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,employeeService.getById(id));
    }

    /**
     * 添加
     * @param employee
     * @return
     */
    @RequiresPermissions("api-employee-add")
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public Result save(@RequestBody Employee employee){
        employee.setId(idWorker.nextId()+"");
        employee.setEmpCode(CodeWorker.codeGenerate(CodePrefix.EMPLOYEE_PREFIX));
        employee.setCreateTime(new Date());
        employeeService.save(employee);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param employee
     * @return
     */
    @RequiresPermissions("api-employee-edit")
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Employee employee){
        employeeService.updateById(employee);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-employee-del")
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        employeeService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


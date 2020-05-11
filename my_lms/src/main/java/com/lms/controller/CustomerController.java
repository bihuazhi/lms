package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Customer;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.CustomerService;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 客户表信息 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/business")
@CrossOrigin //允许跨域
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/customer/page",method = RequestMethod.GET)
    public PageResult<Customer> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Customer> pageCustomers = customerService.page(new Page<Customer>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<Customer>().like("name", param.get("name").toString()));
        //返回数据
        return new PageResult(pageCustomers.getTotal(),pageCustomers.getRecords());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/customer/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
       return new Result(ResultCode.SUCCESS,customerService.getById(id));
    }

    /**
     * 添加
     * @param customer
     * @return
     */
    @RequiresPermissions("api-customer-add")
    @RequestMapping(value = "/customer",method = RequestMethod.POST)
    public Result save(@RequestBody Customer customer){
        customer.setId(idWorker.nextId()+"");
        customer.setCustomerCode(CodeWorker.codeGenerate("J"));
        customer.setCreateTime(new Date());
        customer.setCooperationTimes(1);//合作次数
        customerService.save(customer);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param customer
     * @return
     */
    @RequiresPermissions("api-customer-edit")
    @RequestMapping(value = "/customer/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Customer customer){
        customerService.updateById(customer);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequiresPermissions("api-customer-del")
    @RequestMapping(value = "/customer/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        customerService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

}


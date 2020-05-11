package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.controlller.BaseController;
import com.lms.domain.Scanning;
import com.lms.domain.coding.CodePrefix;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.ScanningService;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.apache.poi.util.StringUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 扫描信息表 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/scanning")
@CrossOrigin
public class ScanningController extends BaseController {
    @Autowired
    private ScanningService scanningService;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public PageResult<Scanning> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Scanning> pageScannings = scanningService.page(new Page<Scanning>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<Scanning>()
        .eq(!StringUtils.isEmpty(param.get("waybCode").toString()),"wayb_code", param.get("waybCode").toString())
        .eq(!StringUtils.isEmpty(param.get("empId").toString()),"emp_id", param.get("empId").toString())
        .eq(!StringUtils.isEmpty(param.get("scanType").toString()),"scan_type", param.get("scanType").toString())
        );
        //返回数据
        return new PageResult(pageScannings.getTotal(),pageScannings.getRecords());
    }

    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,scanningService.getById(id));
    }


    /**
     * 根据运单编码查询扫描物流信息
     * @param
     * @return
     */
    @RequestMapping(value = "/scans/olet/emp/{waybcode}",method = RequestMethod.GET)
    public Result findScansOutlsAndEmpsByWaybCode(@PathVariable(value = "waybcode") String waybcode){
        return new Result(ResultCode.SUCCESS,scanningService.findScansOutlsAndEmpsByWaybCode(waybcode));
    }

    /**
     * 根据运单编码查询货物跟踪信息
     * @param
     * @return
     */
    @RequestMapping(value = "/scans/olet/{waybcode}",method = RequestMethod.GET)
    public Result findScansOutlsByWaybCode(@PathVariable(value = "waybcode") String waybcode){
        return new Result(ResultCode.SUCCESS,scanningService.findScansOutlsByWaybCode(waybcode));
    }

    /**
     * 添加
     * @param scanning
     * @return
     */
    @RequiresPermissions("api-scanning-add")
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Result save(@RequestBody Scanning scanning){
        System.out.println(empId);
        scanning.setEmpId(empId);
        scanningService.addScanning(scanning); //添加扫描
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param scanning
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Scanning scanning){
        scanningService.updateById(scanning);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        scanningService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


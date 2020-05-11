package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.ProblemLog;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.ProblemLogService;
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
 * 问题日志表 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/problem")
@CrossOrigin
public class ProblemLogController {

    @Autowired
    private ProblemLogService problemLogService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public PageResult<ProblemLog> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<ProblemLog> pageProblemLogs = problemLogService.page(new Page<ProblemLog>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<ProblemLog>()
        .eq(!StringUtils.isEmpty(param.get("proOutletId").toString()),"pro_outlet_id", param.get("proOutletId").toString())
        .like(!StringUtils.isEmpty(param.get("proReason").toString()),"pro_reason", param.get("proReason").toString())
        .like(!StringUtils.isEmpty(param.get("callMobile").toString()),"call_mobile", param.get("callMobile").toString())
        );
        //返回数据
        return new PageResult(pageProblemLogs.getTotal(),pageProblemLogs.getRecords());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,problemLogService.getById(id));
    }

    /**
     * 添加处理备注
     * @param
     * @return
     */
    @RequiresPermissions("api-problem-remark")
    @RequestMapping(value = "/dealremark",method = RequestMethod.POST)
    public Result addRemark(@RequestBody Map<String,Object> map  ){
        ProblemLog problem = problemLogService.getById(map.get("id").toString());
        problem.setDealRemark(map.get("remark").toString());
        problem.setIsDeal("1");
        problemLogService.updateById(problem);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 添加
     * @param problemLog
     * @return
     */
    @RequiresPermissions("api-problem-add")
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Result save(@RequestBody ProblemLog problemLog){
        problemLog.setId(idWorker.nextId()+"");
        problemLog.setCreateTime(new Date());
        problemLog.setIsDeal("0"); //未处理
        problemLogService.save(problemLog);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param problemLog
     * @return
     */
    @RequiresPermissions("api-problem-edit")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody ProblemLog problemLog){
        problemLogService.updateById(problemLog);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        problemLogService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


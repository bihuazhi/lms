package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Announce;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.AnnounceService;
import com.lms.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-05-06
 */
@RestController
@RequestMapping("/announce")
public class AnnounceController {

    @Autowired
    private AnnounceService announceService;

    @Autowired
    private IdWorker idWorker;
    /**
     *  查询新的五条公告
     * @return
     */
    @RequestMapping(value = "/newlist",method = RequestMethod.GET)
    public Result findNewList(@RequestParam("count") Integer count){
        List<Announce> list = announceService.findNewList(count);
        //返回数据
        return new Result(ResultCode.SUCCESS,list);
    }

    /**
     * 添加公告
     * @param
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Result insert(@RequestBody Announce announce){
        announce.setId(idWorker.nextId()+"");
        announce.setCreateTime(new Date());
        announceService.save(announce);
        return new Result(ResultCode.SUCCESS);
    }

}


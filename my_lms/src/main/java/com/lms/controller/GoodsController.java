package com.lms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.domain.Goods;
import com.lms.domain.coding.CodePrefix;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.GoodsService;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 货物信息表 前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/capacity")
@CrossOrigin
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private IdWorker idWorker;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/goods/page",method = RequestMethod.GET)
    public PageResult<Goods> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<Goods> pageGoodss = goodsService.page(new Page<Goods>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<Goods>()
         .like(!StringUtils.isEmpty(param.get("goodsName").toString()),"goods_name", param.get("goodsName").toString())
         .like(!StringUtils.isEmpty(param.get("goodsType").toString()),"goods_type", param.get("goodsType").toString())
         .eq(!StringUtils.isEmpty(param.get("goodsWhId").toString()),"goods_wh_id", param.get("goodsWhId").toString())
        );
        //返回数据
        return new PageResult(pageGoodss.getTotal(),pageGoodss.getRecords());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,goodsService.getById(id));
    }

    /**
     * 添加
     * @param goods
     * @return
     */
    @RequestMapping(value = "/goods",method = RequestMethod.POST)
    public Result save(@RequestBody Goods goods){
        goods.setId(idWorker.nextId()+"");
        goods.setGoodsCode(CodeWorker.codeGenerate(CodePrefix.GOODS_PREFIX));
        goods.setCreateTime(new Date());
        goodsService.save(goods);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param goods
     * @return
     */
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody Goods goods){
        goodsService.updateById(goods);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        goodsService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }
}


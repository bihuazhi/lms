package com.lms.service.impl;

import com.lms.domain.Goods;
import com.lms.domain.InterWarehouse;
import com.lms.domain.Warehouse;
import com.lms.domain.coding.CodePrefix;
import com.lms.mapper.GoodsMapper;
import com.lms.mapper.InterWarehouseMapper;
import com.lms.mapper.WarehouseMapper;
import com.lms.service.InterWarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.utils.CodeWorker;
import com.lms.utils.DateConverter;
import com.lms.utils.IdWorker;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 入库记录表信息 服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class InterWarehouseServiceImpl extends ServiceImpl<InterWarehouseMapper, InterWarehouse> implements InterWarehouseService {

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private InterWarehouseMapper interWarehouseMapper;

    @Autowired
    private IdWorker idWorker;

    /**
     * 货物入库
     * @param map
     */
    @Transactional
    public void goodsInterWarehouse(Map<String,Object> map) {
        //注册日期转换器
        DateConverter.RegisterConvert();
        InterWarehouse interWarehouse = new InterWarehouse();
        Goods goods = new Goods();
        try {
            //添加入库记录
            BeanUtils.populate(interWarehouse,map);
            interWarehouse.setId(idWorker.nextId()+"");
            interWarehouse.setInterCode(CodeWorker.codeGenerate(CodePrefix.INTERWAREHOUSE_PREFIX));
            interWarehouse.setCreateTime(new Date());
            interWarehouseMapper.insert(interWarehouse);
            //添加货物信息
            BeanUtils.populate(goods,map);
            //从入库记录获取货物信息
            goods.setId(idWorker.nextId()+"");
            goods.setGoodsCode(CodeWorker.codeGenerate(CodePrefix.GOODS_PREFIX));
            goods.setGoodsType(interWarehouse.getGoodsType());
            goods.setGoodsCount(interWarehouse.getGoodsCount());
            goods.setGoodsName(interWarehouse.getGoodsName());
            goods.setGoodsWeight(interWarehouse.getGoodsTotalWeight());
            goods.setGoodsVolume(interWarehouse.getGoodsTotalVolume());
            goods.setGoodsPrice(interWarehouse.getGoodsTotalPrice());
            goods.setGoodsWhId(interWarehouse.getInterWhId()); //入库仓库
            goods.setCreateTime(new Date());
            //保存货物
            goodsMapper.insert(goods);
            //改变库存和占用量
            Warehouse warehouse = warehouseMapper.selectById(interWarehouse.getInterWhId());
            //减少库存
            warehouse.setWhInventory(
            warehouse.getWhInventory()-interWarehouse.getGoodsTotalVolume());
            //增加占用量
            warehouse.setOccupation(
            warehouse.getOccupation()+interWarehouse.getGoodsTotalVolume());
            warehouseMapper.updateById(warehouse); //修改
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

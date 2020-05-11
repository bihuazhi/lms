package com.lms.service.impl;

import com.lms.domain.Goods;
import com.lms.domain.OuterWarehouse;
import com.lms.domain.Warehouse;
import com.lms.domain.coding.CodePrefix;
import com.lms.mapper.GoodsMapper;
import com.lms.mapper.OuterWarehouseMapper;
import com.lms.mapper.WarehouseMapper;
import com.lms.service.OuterWarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 出库信息表 服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class OuterWarehouseServiceImpl extends ServiceImpl<OuterWarehouseMapper, OuterWarehouse> implements OuterWarehouseService {

    @Autowired
    private OuterWarehouseMapper outerWarehouseMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Autowired
    private IdWorker idWorker;

    @Override
    @Transactional
    public void goodsOuterWarehouse(Map<String, Object> map) {
        Goods goods = goodsMapper.selectById(map.get("goodsId").toString());
        Integer goodsOuterCount = Integer.parseInt(map.get("goodsCount").toString()); //出库数量
        //设置出库信息
        OuterWarehouse outerWarehouse = new OuterWarehouse();
        outerWarehouse.setId(idWorker.nextId()+"");
        outerWarehouse.setOuterCode(CodeWorker.codeGenerate(CodePrefix.OUTERWAREHOUSE_PREFIX));
        outerWarehouse.setGoodsName(goods.getGoodsName());
        outerWarehouse.setGoodsType(goods.getGoodsType());
        outerWarehouse.setGoodsCount(goodsOuterCount);
        outerWarehouse.setCreateTime(new Date());
        outerWarehouse.setOuterWhId(goods.getGoodsWhId()); //出库仓库
        //根据出库的数量 计算货物重量、体积、价格信息
        Map<String, Float> goodsResult = ComputeOuterGoods(goodsOuterCount, goods.getGoodsCount(),
                goods.getGoodsVolume(), goods.getGoodsWeight(), goods.getGoodsPrice());
        //设置出库的货物信息
        outerWarehouse.setGoodsTotalWeight(goodsResult.get("outerWeight"));
        outerWarehouse.setGoodsTotalVolume(goodsResult.get("outerVolume"));
        outerWarehouse.setGoodsTotalPrice(goodsResult.get("outerPrice"));
        if( goods.getGoodsCount() - goodsOuterCount == 0){ //如果数量相等 删除货物
      /*      outerWarehouse.setGoodsTotalPrice(goods.getGoodsPrice());
            outerWarehouse.setGoodsTotalVolume(goods.getGoodsVolume());
            outerWarehouse.setGoodsTotalWeight(goods.getGoodsWeight());*/
            //删除货物
           goodsMapper.deleteById(map.get("goodsId").toString());
        }
        else {  //如果数量不相等 减少货物数量 改变体积、重量、价格信息
            //修改货物信息
            goods.setGoodsCount(goods.getGoodsCount()-goodsOuterCount);
            goods.setGoodsVolume(goodsResult.get("remainVolume"));
            goods.setGoodsWeight(goodsResult.get("remainWeight"));
            goods.setGoodsPrice(goodsResult.get("remainPrice"));
            goodsMapper.updateById(goods);
        }
        //添加出库记录
        outerWarehouseMapper.insert(outerWarehouse);

        //修改库存
        Warehouse warehouse = warehouseMapper.selectById(goods.getGoodsWhId());
        warehouse.setWhInventory(warehouse.getWhInventory()+goodsResult.get("outerVolume"));
        warehouse.setOccupation(warehouse.getOccupation()-goodsResult.get("outerVolume"));
        warehouseMapper.updateById(warehouse);
    }

    //计算货物的信息
    public Map<String,Float> ComputeOuterGoods(int outerCount,int goodsCount,float volume,float weight,float price){
        Map<String,Float> map = new HashMap<>();
        map.put("outerVolume",volume/goodsCount*outerCount);//出库体积
        map.put("remainVolume",volume-volume/goodsCount*outerCount);//剩余体积
        map.put("outerWeight",weight/goodsCount*outerCount);//出库重量
        map.put("remainWeight",weight-weight/goodsCount*outerCount);//剩余重量
        map.put("outerPrice",price/goodsCount*outerCount);//出库价格
        map.put("remainPrice",price-price/goodsCount*outerCount);//剩余价格
        return map;
    }

}

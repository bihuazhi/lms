package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Warehouse;
import com.lms.domain.info.response.WareStatics;


/**
 * <p>
 * 仓库表信息 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface WarehouseMapper extends BaseMapper<Warehouse> {
    //查询所有仓库的占用量
    public float findOccupationSum();

    //查询所有仓库的库存
    public float findInventorySum();

    WareStatics wareStatics();
}

package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.InterWarehouse;


/**
 * <p>
 * 入库记录表信息 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface InterWarehouseMapper extends BaseMapper<InterWarehouse> {

    //今日入库
    public int findTodayInterWarehouse(String whid);

    //查询最近入库
    public InterWarehouse findRecentInterWarehouse();
}

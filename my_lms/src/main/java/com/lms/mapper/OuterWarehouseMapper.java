package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.OuterWarehouse;


/**
 * <p>
 * 出库信息表 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface OuterWarehouseMapper extends BaseMapper<OuterWarehouse> {

    //查询今日出库数
    public int findTodayOuterWarehouse(String whid);

    //查询最近出库
    public OuterWarehouse findRecentOuterWarehouse();
}

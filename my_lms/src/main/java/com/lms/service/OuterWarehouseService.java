package com.lms.service;

import com.lms.domain.OuterWarehouse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 出库信息表 服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface OuterWarehouseService extends IService<OuterWarehouse> {

    /**
     * 货物出库
     * @param map
     */
    public void goodsOuterWarehouse(Map<String, Object> map);
}

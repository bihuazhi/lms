package com.lms.service;

import com.lms.domain.InterWarehouse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 入库记录表信息 服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface InterWarehouseService extends IService<InterWarehouse> {

    //货物入库
    public void goodsInterWarehouse(Map<String,Object> map);
}

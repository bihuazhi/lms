package com.lms.service;

import com.lms.domain.Warehouse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lms.domain.info.response.WareStatics;

import java.util.Map;

/**
 * <p>
 * 仓库表信息 服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface WarehouseService extends IService<Warehouse> {

    //查询仓库资源
    public Map<String,Object> findWarehouseInfo(String outletid, String whid);

    //查询运力资源
    public Map<String,Object> findCapacityInfo();

    public WareStatics wareStatics();
}

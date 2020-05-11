package com.lms.service;

import com.lms.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lms.domain.Vehicle;
import com.lms.domain.info.response.DataStatstics;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface OrderService extends IService<Order> {
    //分配订单
    public void allocateOrder(Map<String,Object> map);

    public List<Vehicle> findtest();

    //统计首页数据
    public DataStatstics statistics(int i);

    //统计收入
    public List incomeStatics(String status);
}

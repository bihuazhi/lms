package com.lms.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lms.domain.Order;
import com.lms.domain.Vehicle;
import com.lms.domain.info.response.DataStatstics;
import com.lms.mapper.EmployeeMapper;
import com.lms.mapper.OrderMapper;
import com.lms.mapper.VehicleMapper;
import com.lms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private VehicleMapper vehicleMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    @Transactional
    public void allocateOrder(Map<String, Object> map) {
        //设置分配的网点id
        Order order = orderMapper.selectById(map.get("orderId").toString());
        order.setEmployOutletId(map.get("employOutletId").toString());
        //修改员工和车辆的状态为：已分配状态
        vehicleMapper.updateByStatusByIds("2",JSON.parseArray(map.get("employVehId").toString(), String.class));
        employeeMapper.updateByStatusByIds("2",JSON.parseArray(map.get("employEmpId").toString(), String.class));
        //修改订单的分配状态
        order.setEmployVehId(map.get("employVehId").toString()); //分配车辆
        order.setEmployEmpId(map.get("employEmpId").toString()); //分配员工
        order.setEmployWhId(map.get("employWhId").toString()); //分配仓库
        order.setStatus("1"); //订单状态修改为待发货状态
        orderMapper.updateById(order);
    }

    public List<Vehicle> findtest(){
        return vehicleMapper.findtest();
    }

    @Override
    public DataStatstics statistics(int i) {
        return  orderMapper.statistics(i);
    }

    @Override
    public List incomeStatics(String status) {
        return orderMapper.incomeStatics(status);
    }
}

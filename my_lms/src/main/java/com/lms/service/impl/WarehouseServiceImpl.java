package com.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lms.domain.*;
import com.lms.domain.info.response.WareStatics;
import com.lms.domain.state.EmployeeState;
import com.lms.domain.state.OrderState;
import com.lms.domain.state.VehicleState;
import com.lms.mapper.*;
import com.lms.service.OuterWarehouseService;
import com.lms.service.WarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 仓库表信息 服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements WarehouseService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private VehicleMapper vehicleMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private InterWarehouseMapper interWarehouseMapper;

    @Autowired
    private OuterWarehouseMapper outerWarehouseMapper;

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Autowired
    private OrderMapper orderMapper;

    //查询仓库资源面板
    public Map<String, Object> findWarehouseInfo(String outletid, String whid) {
        HashMap<String,Object> map = new HashMap<>();
        //在职员工
        map.put("onDutyEmpCount",employeeMapper.selectCount(
                new QueryWrapper<Employee>()
                .eq("status", EmployeeState.ON_DUTY)
                .eq("outlet_id", outletid)));
        //总员工
        map.put("empCount",employeeMapper.selectCount(
                new QueryWrapper<Employee>()
                .eq("outlet_id", outletid)));
        //可用车辆
        map.put("enabledVehCount",vehicleMapper.selectCount(
                new QueryWrapper<Vehicle>()
                .eq("status", VehicleState.ENABLED_USE)
                .eq("vh_outlet_id",outletid)
        ));
        //总车辆数
        map.put("vehCount",vehicleMapper.selectCount(
                new QueryWrapper<Vehicle>()
                .eq("vh_outlet_id",outletid)
        ));
        //今日入库数
        map.put("todayInterCount",interWarehouseMapper.findTodayInterWarehouse(whid));
        //进入出库数
        map.put("todayOuterCount",outerWarehouseMapper.findTodayOuterWarehouse(whid));
        //查询仓库的库存和占用量
        Warehouse warehouse = warehouseMapper.selectById(whid);
        map.put("inventory",warehouse!=null?warehouse.getWhInventory():0);
        map.put("occupation",warehouse!=null?warehouse.getOccupation():0);
        //查询货物的数量
        map.put("goodsCount",goodsMapper.selectCount(
                new QueryWrapper<Goods>()
                .eq("goods_wh_id",whid)
        ));
        return map;
    }

    //统计运力资源
    @Override
    public Map<String, Object> findCapacityInfo() {
        HashMap<String,Object> map = new HashMap<>();
        //所有仓库占用量和库存量
        map.put("allOccupation",warehouseMapper.findOccupationSum());
        map.put("allInventory",warehouseMapper.findInventorySum());
        //总车辆和已出车辆
        map.put("vehsCount",vehicleMapper.selectCount(null));
        map.put("vehsBusyCount",vehicleMapper.selectCount(
                new QueryWrapper<Vehicle>()
                        .ne("status",VehicleState.ENABLED_USE)
        ));
        //总员工和已派出员工
        map.put("empsCount",employeeMapper.selectCount(null));
        map.put("empsBusyCount",employeeMapper.selectCount(
                new QueryWrapper<Employee>()
                .ne("status",EmployeeState.ON_DUTY)
        ));
        //总入库数和今日入库数
        map.put("allInters",interWarehouseMapper.selectCount(null));
        map.put("todayInters",interWarehouseMapper.findTodayInterWarehouse(null));
        //总出库数和今日出库数
        map.put("allOuters",outerWarehouseMapper.selectCount(null));
        map.put("todayOuters",outerWarehouseMapper.findTodayOuterWarehouse(null));
        //货物数量
        map.put("goodsCount",goodsMapper.selectCount(null));
        //订单数量
        map.put("allocateCount",orderMapper.selectCount(
                new QueryWrapper<Order>().eq("status", OrderState.TO_BE_ALLOCATED)
        ));
        map.put("sendCount",orderMapper.selectCount(
                new QueryWrapper<Order>().eq("status",OrderState.SHIPPED)
        ));
        map.put("completeCount",orderMapper.selectCount(
                new QueryWrapper<Order>().eq("status",OrderState.COMPLETED)
        ));
        //最近入库
        map.put("recentInter",interWarehouseMapper.findRecentInterWarehouse());
        //最近出库
        map.put("recentOuter",outerWarehouseMapper.findRecentOuterWarehouse());
        return map;
    }

    @Override
    public WareStatics wareStatics() {
        return warehouseMapper.wareStatics();
    }
}

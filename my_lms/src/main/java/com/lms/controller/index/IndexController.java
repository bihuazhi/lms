package com.lms.controller.index;

import com.lms.domain.Order;
import com.lms.domain.Waybill;
import com.lms.domain.info.response.DataStatstics;
import com.lms.domain.state.OrderState;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.mapper.InterWarehouseMapper;
import com.lms.mapper.ScanningMapper;
import com.lms.service.OrderService;
import com.lms.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/5/5/005.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private WaybillService waybillService;

    @Autowired
    private ScanningMapper scanningMapper;

    @Autowired
    private InterWarehouseMapper interWarehouseMapper;


    @RequestMapping("/statstics")
    public Result statistics(){
        List<DataStatstics> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            DataStatstics dataStatstics = orderService.statistics(i);
            list.add(dataStatstics);
        }
        return new Result(ResultCode.SUCCESS,list);
    }

    @RequestMapping("/income")
    public Result incomeStatics(){
        List list = orderService.incomeStatics(OrderState.VOIDED);
        return new Result(ResultCode.SUCCESS,list);
    }
}

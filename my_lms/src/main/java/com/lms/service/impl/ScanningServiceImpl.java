package com.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lms.domain.Order;
import com.lms.domain.Scanning;
import com.lms.domain.Waybill;
import com.lms.domain.coding.CodePrefix;
import com.lms.domain.state.OrderState;
import com.lms.domain.state.WaybillState;
import com.lms.mapper.OrderMapper;
import com.lms.mapper.ScanningMapper;
import com.lms.mapper.WaybillMapper;
import com.lms.service.ScanningService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.utils.CodeWorker;
import com.lms.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 扫描信息表 服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class ScanningServiceImpl extends ServiceImpl<ScanningMapper, Scanning> implements ScanningService {

    @Autowired
    private ScanningMapper scanningMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private WaybillMapper waybillMapper;

    @Autowired
    private IdWorker idWorker;

    @Override
    public List<Scanning> findScansOutlsAndEmpsByWaybCode(String waybcode) {
        return scanningMapper.findScansOutlsAndEmpsByWaybCode(waybcode);
    }

    @Override
    public Scanning findScansOutlsByWaybCode(String waybcode) {
        return scanningMapper.findScansOutlsByWaybCode(waybcode);
    }

    @Override
    @Transactional
    public void addScanning(Scanning scanning) {
        scanning.setId(idWorker.nextId()+"");
        scanning.setScanCode(CodeWorker.codeGenerate(CodePrefix.SCANNING_PREFIX));
        scanning.setCreateTime(new Date()); //扫描时间
        if(scanning.getScanType().equals("2") || scanning.getScanType().equals("4") ){
            Waybill waybill = waybillMapper.selectOne(
                    new QueryWrapper<Waybill>().eq("wayb_code", scanning.getWaybCode())
            ); //查询运单信息
            Order order = orderMapper.selectById(waybill.getOrderId()); //查询订单信息
            switch(scanning.getScanType()) {
                case "2": //发货扫描 修改订单和运单的状态为已发货
                    waybill.setStatus(WaybillState.SENDING);//发货中
                    waybillMapper.updateById(waybill); //修改状态
                    order.setStatus(OrderState.SHIPPED); //发货中
                    orderMapper.updateById(order);
                    break;
                case "4": //签收扫描 修改订单和运单的状态为已发货
                    waybill.setStatus(WaybillState.ARRIVALED);//已到达
                    waybill.setSignforStatus("1"); //已经签收
                    waybill.setCompleteTime(new Date());//完成时间
                    waybillMapper.updateById(waybill); //修改状态
                    order.setStatus(OrderState.COMPLETED); //已完成
                    order.setCompleteTime(new Date()); //完成时间
                    orderMapper.updateById(order);
                    scanning.setSignforTime(new Date()); //签收时间
                    break;
                default:
                    throw new RuntimeException("没有相关的扫描状态");
            }
        }
        scanningMapper.insert(scanning); //添加扫描信息
    }
}

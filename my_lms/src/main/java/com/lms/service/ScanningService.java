package com.lms.service;

import com.lms.domain.Scanning;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 扫描信息表 服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface ScanningService extends IService<Scanning> {

    //根据编码查询扫描、网点和操作员工
    public List<Scanning> findScansOutlsAndEmpsByWaybCode(String waybcode);

    //根据编码查询扫描和网点信息(货物定位跟踪)
    public Scanning findScansOutlsByWaybCode(String waybcode);

    //录入扫描信息--并且修改订单和运单的状态
    public void addScanning(Scanning scanning);
}

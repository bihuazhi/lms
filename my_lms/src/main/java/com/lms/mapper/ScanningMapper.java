package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Scanning;

import java.util.List;


/**
 * <p>
 * 扫描信息表 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface ScanningMapper extends BaseMapper<Scanning> {

    //根据运单编码查询扫描网点和员工
    List<Scanning> findScansOutlsAndEmpsByWaybCode(String waybcode);

    //根据运单编码查询网点和扫描(货物跟踪)
    public Scanning findScansOutlsByWaybCode(String waybcode);
}

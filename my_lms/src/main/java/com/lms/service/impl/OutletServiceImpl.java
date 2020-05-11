package com.lms.service.impl;

import com.lms.domain.Outlet;
import com.lms.mapper.OutletMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.service.OutletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 网点表信息 服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class OutletServiceImpl extends ServiceImpl<OutletMapper, Outlet> implements OutletService {

    @Autowired
    private OutletMapper outletMapper;

    @Override
    public List<Outlet> findOutletAndWarehouse() {
            return outletMapper.findOutletAndWarehouse();
    }
}

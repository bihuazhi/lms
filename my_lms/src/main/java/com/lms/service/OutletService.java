package com.lms.service;

import com.lms.domain.Outlet;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 网点表信息 服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface OutletService extends IService<Outlet> {

    //查询网点和仓库
    public List<Outlet> findOutletAndWarehouse();
}

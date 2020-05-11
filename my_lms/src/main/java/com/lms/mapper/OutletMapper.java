package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Outlet;

import java.util.List;


/**
 * <p>
 * 网点表信息 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface OutletMapper extends BaseMapper<Outlet> {

    //查询网点和仓库信息
    public List<Outlet> findOutletAndWarehouse();
}

package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Vehicle;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;


/**
 * <p>
 * 车辆信息表 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface VehicleMapper extends BaseMapper<Vehicle> {

    /**
     * 根据id集合修改状态
     * @param status
     */
    public void updateByStatusByIds(@Param("status") String status,
                                    @Param("ids") List<String> ids);

    public List<Vehicle> findtest();
}

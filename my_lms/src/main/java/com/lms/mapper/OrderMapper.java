package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Order;
import com.lms.domain.info.response.DataStatstics;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface OrderMapper extends BaseMapper<Order> {


    DataStatstics statistics(int i);

    List incomeStatics(String status);
}

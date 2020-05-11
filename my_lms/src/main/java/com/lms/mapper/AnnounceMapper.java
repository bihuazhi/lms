package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Announce;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-05-06
 */
public interface AnnounceMapper extends BaseMapper<Announce> {

    List<Announce> findNewList(Integer count);
}

package com.lms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lms.domain.Announce;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-05-06
 */
public interface AnnounceService extends IService<Announce> {

    //查询最新公告
    List<Announce> findNewList(Integer count);
}

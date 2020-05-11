package com.lms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.domain.Announce;
import com.lms.mapper.AnnounceMapper;
import com.lms.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-05-06
 */
@Service
public class AnnounceServiceImpl extends ServiceImpl<AnnounceMapper, Announce> implements AnnounceService {


    @Autowired
    private AnnounceMapper announceMapper;

    @Override
    public List<Announce> findNewList(Integer count) {
        return announceMapper.findNewList(count);

    }
}

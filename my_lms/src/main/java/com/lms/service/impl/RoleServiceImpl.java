package com.lms.service.impl;

import com.lms.domain.Permission;
import com.lms.domain.Role;
import com.lms.mapper.RoleMapper;
import com.lms.mapper.UserMapper;
import com.lms.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public void disPermission(List<String> disPerms, String roleid) {
        roleMapper.delCurPerms(roleid);
        roleMapper.addCurPerms(disPerms,roleid);
    }

}

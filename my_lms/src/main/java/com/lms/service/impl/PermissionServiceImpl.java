package com.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lms.domain.Permission;
import com.lms.mapper.PermissionMapper;
import com.lms.service.PermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findPermsByRoleId(String roleid) {
        return permissionMapper.findPermsByRoleId(roleid);
    }

    @Override
    public List<Permission> findAll() {
       return permissionMapper.selectList(null);
    }

    @Override
    public List<Permission> findByEnVisible(int i) {
        return permissionMapper.selectList(new QueryWrapper<Permission>()
          .eq("en_visible",1)
        );
    }

    @Override
    public List<Permission> findRolesPermsByRoleId(List<String> roleIds) {
        return permissionMapper.findRolesPermsByRoleId(roleIds);
    }

}

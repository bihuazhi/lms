package com.lms.service;

import com.lms.domain.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface PermissionService extends IService<Permission> {
    //根据角色id查询权限信息
    public List<Permission> findPermsByRoleId(String roleid);

    //查询所有权限
    public List<Permission> findAll();

    //根据权限可见性查询权限
    public List<Permission> findByEnVisible(int i);

    //根据id集合查询权限列表
    public List<Permission> findRolesPermsByRoleId(List<String> roleIds);

}

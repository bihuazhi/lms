package com.lms.service;

import com.lms.domain.Permission;
import com.lms.domain.Role;
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
public interface RoleService extends IService<Role> {
    //分配权限
    public void disPermission( List<String> disPerms,String roleid);

}

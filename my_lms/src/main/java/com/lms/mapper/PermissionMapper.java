package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    //根据角色id查询权限信息
    public List<Permission> findPermsByRoleId(String roleid);

    //根据角色id列表查询用户的所有权限
    public List<Permission> findRolesPermsByRoleId(@Param("roleIds") List<String> roleIds);
}

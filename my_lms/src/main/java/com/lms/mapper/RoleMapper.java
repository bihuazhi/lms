package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Permission;
import com.lms.domain.Role;
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
public interface RoleMapper extends BaseMapper<Role> {
    //根据角色id删除当前权限
    public void delCurPerms(String roleid);

    public void addCurPerms(@Param("disPerms") List<String> disPerms,
                            @Param("roleid") String roleid);


}

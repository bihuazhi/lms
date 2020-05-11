package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Role;
import com.lms.domain.User;
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
public interface UserMapper extends BaseMapper<User> {

        //根据用户id查询该用户的所有角色
        public List<Role> findRolesByUserId(String userid);

        //根据id删除用户和角色关系信息
        public void  delCurRoles(String userid);

        //根据用户id添加用户和角色关系信息
        public void  addCurRoles(@Param("roleIds") List<String> roleIds,
                                 @Param("userid") String userid);

        //校验用户名和密码
        public User findUserByMobile(String mobile);
}

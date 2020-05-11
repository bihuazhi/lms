package com.lms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lms.domain.Role;
import com.lms.domain.User;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface UserService extends IService<User> {

    //添加用户
    public void saveUser(User user);

    //查询当前用户的所有角色信息
    public List<Role> findRolesByUserId(String userid);

    //分配角色
    void distruRoles(String userid, List<String> disRoles);

    public User findUserByMobile(String mobile);
}

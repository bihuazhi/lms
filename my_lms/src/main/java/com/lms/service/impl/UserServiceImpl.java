package com.lms.service.impl;

import com.lms.domain.Employee;
import com.lms.domain.Role;
import com.lms.domain.User;
import com.lms.mapper.EmployeeMapper;
import com.lms.mapper.UserMapper;
import com.lms.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.utils.IdWorker;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    private IdWorker idWorker;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    @Transactional
    public void saveUser(User user) {
        user.setId(idWorker.nextId()+"");
        user.setEnableState("1"); //可用状态
        user.setCreateTime(new Date());
        //密码加密
        user.setPassword(
         new Md5Hash(user.getPassword(),user.getMobile(),2).toString()
        );
        //保存用户
        userMapper.insert(user);
        //设置员工已经绑定员工
        if(!StringUtils.isEmpty(user.getEmpId())){
            Employee employee = employeeMapper.selectById(user.getEmpId());
            employee.setBindUser("1");//已绑定员工
            employeeMapper.updateById(employee);
        }
    }

    @Override
    public List<Role> findRolesByUserId(String userid) {
        return userMapper.findRolesByUserId(userid);
    }

    @Transactional
    public void distruRoles(String userid, List<String> disRoles) {
            userMapper.delCurRoles(userid);
            userMapper.addCurRoles(disRoles,userid);
    }

    @Override
    public User findUserByMobile(String mobile) {
        return userMapper.findUserByMobile(mobile);
    }
}

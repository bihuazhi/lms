package com.lms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lms.domain.Employee;
import com.lms.mapper.EmployeeMapper;
import com.lms.service.EmployeeService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工表信息 服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}

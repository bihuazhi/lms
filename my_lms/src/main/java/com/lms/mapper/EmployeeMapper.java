package com.lms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lms.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * <p>
 * 员工表信息 Mapper 接口
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    /*根据id集合修改状态*/
    public void updateByStatusByIds(@Param("status") String status,
                                    @Param("ids") List<String> ids);
}

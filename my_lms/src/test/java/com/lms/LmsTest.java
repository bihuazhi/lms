package com.lms;

import com.lms.domain.Customer;
import com.lms.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2020/3/25/025.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {LmsTest.class})
@ComponentScan("com.lms")
public class LmsTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void test01(){
        List<Customer> customers = customerService.list();
        System.out.println(customers);
    }
}

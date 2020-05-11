package com.lms;

import com.lms.utils.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 主启动类
 */
@EnableTransactionManagement(proxyTargetClass = true) //启动注解事务
@SpringBootApplication
@MapperScan("com.lms.mapper")
//@ComponentScan("com.lms") //组件扫描
public class MyLmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyLmsApplication.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}

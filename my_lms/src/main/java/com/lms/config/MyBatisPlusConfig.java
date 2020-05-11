package com.lms.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2020/4/16/016.
 */
@Configuration
public class MyBatisPlusConfig {

    /**
     * 配置分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

    /**
     * 执行分析插件
     */
    @Bean
    public SqlExplainInterceptor sqlExplainInterceptor(){

        return new SqlExplainInterceptor();
    }

    /**
     * 性能分析插件
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setFormat(true); //sql的格式化
        return performanceInterceptor;
    }


}

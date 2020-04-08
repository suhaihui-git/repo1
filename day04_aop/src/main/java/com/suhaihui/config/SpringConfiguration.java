package com.suhaihui.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @ClassName SpringConfiguration
 * @Description
 * @Author suhaihui
 * @Date 2020/1/9 10:12
 **/
@ComponentScan(basePackages = "com.suhaihui")
@Configuration//指定这是一个配置类
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbc.properties")
public class SpringConfiguration {

}

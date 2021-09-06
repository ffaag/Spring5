package com.it.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZuYingFang
 * @time 2021-08-03 14:01
 */


@Configuration   // 作为配置类，需要有这个注解，用来代替xml文件
@ComponentScan(basePackages = {"com.it.spring5"})  // 扫描组件
public class SpringConfig {
}

package com.it.spring5.AOP_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ZuYingFang
 * @time 2021-08-07 0:02
 * 完全注解开发，不需要配置文件来扫描
 */

@Configuration
@ComponentScan(basePackages = {"com.it.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}

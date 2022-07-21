package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//标志该类Spring核心配置
//<!--配置组件扫描-->
//<context:component-scan base-package="com.demo"/>
@ComponentScan("com.demo")
//@Import({dataconfiguration.class})
public class SpringCofiguration {





}

package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声明这个类是配置类
@ComponentScan("com.controller")
public class SpringMvcConfig {
}

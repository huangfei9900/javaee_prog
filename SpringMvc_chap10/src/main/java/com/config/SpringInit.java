package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class SpringInit extends AbstractAnnotationConfigDispatcherServletInitializer {

//配置加载springconfig类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
   // 配置加载springmvc config类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    // 配置加载springmvc 拦截
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class springlnit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {return new Class[0];}
    protected Class<?>[] getServletConfigClasses() {return  new Class[]{SpringMvcConfig.class};}
    protected String[] getServletMappings() {return new String[]{"/"};}


}

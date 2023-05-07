package com.dao;

import jdk.nashorn.internal.codegen.ApplySpecialization;
import jdk.nashorn.internal.runtime.logging.DebugLogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


import java.util.Date;
import java.util.logging.Logger;

public class UserLogAspect {
    private static ApplySpecialization LoggerFactory;
    private static final DebugLogger logger = LoggerFactory.getLogger();
    @Pointcut("execution(* com.dao.UserLogAspect.*(..)))")
    public void userControllerPointcut() {}
    @Before("userControllerPointcut()")
    public void beforeUserController(JoinPoint joinPoint) {
        logger.info("调用类 : " + joinPoint.getTarget().getClass().getName());
        logger.info("调用方法 : " + joinPoint.getSignature().getName());
        logger.info("调用时间 : " + new Date());
        logger.info("执行的操作 : " + getOperationType(joinPoint));
    }

    private String getOperationType(JoinPoint joinPoint) {
        return null;
    }


}

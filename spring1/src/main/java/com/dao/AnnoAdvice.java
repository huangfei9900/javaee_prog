package com.dao;

import jdk.nashorn.internal.codegen.ApplySpecialization;
import jdk.nashorn.internal.runtime.logging.DebugLogger;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

@Aspect
public class AnnoAdvice {
   /* private static final Logger logger = Logger.getLogger(String.valueOf(AnnoAdvice.class));

    private static ApplySpecialization LoggerFactory;
    FileHandler fh =new FileHandler("D:/log.txt");
    */

    public AnnoAdvice() throws IOException {
    }


    @Pointcut("execution (* com.dao.UserDaoImpl.*(..))")
    public void pointcut() {

    }


        @Before("pointcut()")
        public void before (JoinPoint joinPoint){
           Log();
            System.out.println("目标类是：" + joinPoint.getTarget());
            System.out.println("被增强的方法是：" + joinPoint.getSignature().getName());


        }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        //System.out.println("这是环绕通知前的部分");
        Object o = point.proceed();
        //System.out.println("这是环绕通知后的部分");
        return o;
    }
        @AfterReturning("pointcut()")
        public void afterReturning( JoinPoint joinPoint) {
            System.out.println("这是返回通知");
            System.out.println("目标方法为："+joinPoint.getSignature().getName());
        }
    @Logger
    public  void Log() {
        try {
            //标准输出流PrintStream，构造方法要传一个OutputStream
            //OutputStream是一个抽象类，没办法new，采用子类FileOutputStream
            PrintStream ps = new PrintStream(new FileOutputStream("D:/log.txt", true));
            //改变PrintStream输出方向，向FileOutputStream里的路径输出
            System.setOut(ps);
            //记录日志的日期，并格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            Date date = new Date();
            //获取当前日期的String
            String logtime = sdf.format(date);
            Object format = sdf.format(date);
            //文字不再向控制台输出，向FileOutputStream里的文件输出
            System.out.println("日志记录时间：" + logtime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void get_endDate() {
        SimpleDateFormat edt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date date = new Date();
        //获取当前日期的String
        String logtime = edt.format(date);
        System.out.println("结束时间："+logtime);
    }

}

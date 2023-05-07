package com.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{

    private UserDao userDao;

    public MyProxy() {
    }

    public Object createProxy(UserDao userDao){
        this.userDao=userDao;
        ClassLoader classLoader=MyProxy.class.getClassLoader();
        Class[] classes=userDao.getClass().getInterfaces();

        return Proxy.newProxyInstance(classLoader,classes, (InvocationHandler) this);
    }
    public Object invoke(Object proxy, Method method,Object[] args)
    throws Throwable
    {
        MyAspect myAspect=new MyAspect();
        myAspect.check_Permissions();
          Object  obj =method.invoke(userDao,args);

        return obj;
    }
}

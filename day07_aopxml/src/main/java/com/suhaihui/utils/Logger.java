package com.suhaihui.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName Logger
 * @Description
 * @Author suhaihui
 * @Date 2020/3/27 14:09
 **/
public class Logger {

    public void pringLog() {
        System.out.println("执行了Logger类中的pringLog方法");
    }

    public void afterMethod(){
        System.out.println("执行了logger类中国的后置通知方法");
    }

    public void after(){
        System.out.println("执行了logger类中国的最终通知方法");
    }

    public void throwMethod(){
        System.out.println("执行了logger类中国的异常通知方法");
    }

    public Object arounfPrintLog(ProceedingJoinPoint pip){
        Object retValue =  null;
        Object[] args = pip.getArgs();
        try {
            Object proceed = pip.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
        }
        return retValue;
    }
}

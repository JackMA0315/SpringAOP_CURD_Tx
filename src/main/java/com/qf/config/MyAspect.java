package com.qf.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* *.*.service.impl.*.*(..))")
    public void pt1(){}
    public void before(){
        System.out.println("执行业务之前,前置通知");
    }
    public void afterreturning(){
        System.out.println("执行业务之后,后置通知");
    }
    @Around("pt1()")
    public Object round(ProceedingJoinPoint joinPoint){
        Object obj = null;
        try {
            before();
            obj = joinPoint.proceed();
            afterreturning();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}

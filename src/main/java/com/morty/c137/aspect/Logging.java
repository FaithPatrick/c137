package com.morty.c137.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {


    // 切面
    // 定义切入点 在这里 将拦截com.morty.c137.controller.*Controller.*的所有方法
    @AfterReturning(pointcut = "execution(* com.morty.c137.controller.*Controller.*(..))",
            returning = "retVal")
    public void afterReturningAdvice(JoinPoint jp, Object retVal){
        System.out.println("[Invoke] Method Signature: "  + jp.getSignature());
    }


}



package org.example.spring.entity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 22:05:35
 */
@Component
@Aspect
public class Broker {

    @Pointcut("execution(* org.example.spring.entity.Landlord.service())")
    public void lService() {
    }

    @Before("lService()")
    public void before() {
        System.out.println("Show tenants property");
        System.out.println("Negotiate price");
    }

    @After("lService()")
    public void after() {
        System.out.println("turnkey");
    }

    @Around("lService()")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("Show tenants property");
        System.out.println("Negotiate price");

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("turnkey");
    }
}

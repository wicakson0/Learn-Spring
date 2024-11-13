package org.example.spring.aspect;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 18:15:13
 */
public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
}
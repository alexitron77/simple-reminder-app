package com.example.simpletodo.common.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class Interceptor {
    @Before("execution(* com.example.simpletodo.reminder.service.*.*(..))")
    public void logServiceAccess(JoinPoint joinPoint){
        log.info("The following method have been called: {}", joinPoint);
    }

    @Around("execution(* com.example.simpletodo.reminder.service.ReminderService.createReminder(..))")
    public Object getTimeToCreateReminder(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
            Object reminder = joinPoint.proceed();
            long end = System.currentTimeMillis() - start;
            log.info("The method {} has taken {} milliseconds", joinPoint, end);
        return reminder;
    }
}

package com.aleksandrphilimonov.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Преступление и наказание";

        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку возвращают книгу");

        System.out.println("aroundReturnBookLog" +
                "gingAdvice: метод returnBook выполнил работу за " + (end-begin) + " миллисекунт");
        return targetMethodResult;
    }
}

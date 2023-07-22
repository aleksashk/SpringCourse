package com.aleksandrphilimonov.spring.aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.aleksandrphilimonov.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
    }

//    @Pointcut("execution(* com.aleksandrphilimonov.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void com.aleksandrphilimonov.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }

//    @Pointcut("execution(* com.aleksandrphilimonov.spring.aop.UniLibrary.get* ())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* com.aleksandrphilimonov.spring.aop.UniLibrary.return* ())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

}

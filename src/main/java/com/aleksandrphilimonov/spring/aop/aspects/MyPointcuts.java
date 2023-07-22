package com.aleksandrphilimonov.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abcadd*(..))")
    public void allAddMethods() {}
}

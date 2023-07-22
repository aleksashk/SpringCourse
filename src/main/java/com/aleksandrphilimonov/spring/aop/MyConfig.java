package com.aleksandrphilimonov.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aleksandrphilimonov.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}

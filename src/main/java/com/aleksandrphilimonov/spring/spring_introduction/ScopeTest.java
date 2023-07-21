package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog = context.getBean("dog", Dog.class);
//        Dog yourDog = context.getBean("dog", Dog.class);
        dog.say();
//        System.out.println("dog==yourDog: " + (dog == yourDog));
        context.close();
    }
}

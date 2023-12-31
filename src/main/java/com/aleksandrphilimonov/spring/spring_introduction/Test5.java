package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
//        dog.destroy();
        dog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}

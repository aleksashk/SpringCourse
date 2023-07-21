package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();

        Pet cat = context.getBean("catBean", Cat.class);
        cat.say();
        context.close();
    }
}
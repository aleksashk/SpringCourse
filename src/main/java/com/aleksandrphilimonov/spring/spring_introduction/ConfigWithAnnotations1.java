package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat catBean = context.getBean("catBean", Cat.class);
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
//        catBean.say();
    }
}

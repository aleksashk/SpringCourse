package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();

//        Pet cat1 = context.getBean("catBean", Cat.class);
//        Pet cat2 = context.getBean("catBean", Cat.class);
//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat1.equals(cat2));
//        Pet pet = context.getBean("catBean", Cat.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person);
//        person.callYourPet();
        context.close();
    }
}

package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    private Pet pet;

    //    @Value("${person.surname}")
    private String surname;

    //    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Person bean is created");

        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class person: setPet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    public Person() {
        System.out.println("Person bean is created");
    }
//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public void callYourPet() {
        System.out.println("Hello my pet!");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

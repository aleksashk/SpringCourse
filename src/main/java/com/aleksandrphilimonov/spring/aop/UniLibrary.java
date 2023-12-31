package com.aleksandrphilimonov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берём книгу из UniLibrary");
        System.out.println("---------------------------------------");
    }

    public String returnBook(){
        int a = 1 / 0;
        System.out.println("Мы возвращаем книгу в UinLibrary");
        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("Мы берём журнал из UniLibrary.");
        System.out.println("---------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в UinLibrary");
        System.out.println("---------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в UinLibrary");
        System.out.println("---------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UinLibrary");
        System.out.println("---------------------------------------");
    }
}

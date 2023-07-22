package com.aleksandrphilimonov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book){
        System.out.println("Мы берём книгу из UniLibrary " + book.getName());
    }
//
//    public String returnBook(){
//        System.out.println("Мы возвращаем книгу в UinLibrary");
//        return "ok";
//    }

    public void getMagazine(){
        System.out.println("Мы берём журнал из UniLibrary.");
    }
}

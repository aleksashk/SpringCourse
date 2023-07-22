package com.aleksandrphilimonov.spring.aop;

import org.springframework.stereotype.Component;

@Component("library")
public class Library {

    public void getBook(){
        System.out.println("Мы берём книгу.");
    }
}

package com.aleksandrphilimonov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Aleksandr Philimonov", 5, 7.3);
        Student st2 = new Student("Evhenij Sidorov", 3, 4.6);
        Student st3 = new Student("Andry Davidov", 1, 6.2);

        students.addAll(Arrays.asList(st1, st2, st3));
    }

    public List<Student> getStudents(){
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}

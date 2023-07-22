package com.aleksandrphilimonov.spring.aop.aspects;

import com.aleksandrphilimonov.spring.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//
//        String fullName = firstStudent.getFullName();
//        fullName = "Mr. " + fullName;
//        firstStudent.setFullName(fullName);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
//    }

    @AfterThrowing ("execution(* getStudents())")
    public void afterThrowingGetStudentsLoggingAdvice(){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения");
    }
}

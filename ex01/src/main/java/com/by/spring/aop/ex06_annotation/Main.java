package com.by.spring.aop.ex06_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ex06AdviceCtx.xml");

        Student student = ctx.getBean("student", Student.class);
        Employee employee = ctx.getBean("employee", Employee.class);

        student.getStudentInfo();
        System.out.println("==========================");
        employee.getEmployeeInfo();
    }
}

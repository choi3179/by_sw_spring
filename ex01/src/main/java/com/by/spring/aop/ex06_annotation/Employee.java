package com.by.spring.aop.ex06_annotation;

import lombok.Setter;

@Setter
public class Employee {

    private String name;
    private int age;
    private String job;

    public void getEmployeeInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("직업 : " + this.job);
    }
}

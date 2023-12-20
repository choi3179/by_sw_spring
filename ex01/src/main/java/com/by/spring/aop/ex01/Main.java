package com.by.spring.aop.ex01;

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();

        System.out.println(c.add(1,2));
        System.out.println(c.add(10,22));
        System.out.println();
        System.out.println(c.mul(3,5));
    }
}

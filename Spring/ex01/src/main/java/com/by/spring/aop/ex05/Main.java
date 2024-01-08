package com.by.spring.aop.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ex05AdviceCtx.xml");

        ICalc proxyCalc = ctx.getBean("proxy",ICalc.class);
        System.out.println(proxyCalc.add(10,20));
        System.out.println();
        System.out.println(proxyCalc.mul(10,20));
        System.out.println();
        System.out.println(proxyCalc.sub(13,1,2));
        System.out.println();
        System.out.println(proxyCalc.sub(5,13,2));

    }
}

package com.by.spring.aop.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ProceedingJoinPointCtx.xml");

        IMessageBean msg = ctx.getBean("messageBeanImpl", IMessageBean.class);

        msg.sayHello();
        System.out.println("=========================");

        msg.engHello();
        System.out.println("=========================");

        IBookBean book = ctx.getBean("bookBeanImpl", IBookBean.class);


        book.testHello("hello");
        System.out.println("=========================");
        System.out.println(book.korHello());

    }
}

package com.by.spring.quiz;

import com.by.spring.ex02.IRecordViewImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("messageCtx.xml");

        IMessageImplKor kor = (IMessageImplKor) context.getBean("messageKor");
        IMessageImplEng eng = (IMessageImplEng) context.getBean("messageEng");

        kor.sayHello();
        System.out.println("kor message : " + kor.getMessage());

        eng.sayHello();
        System.out.println("eng message : " + eng.getMessage());

    }
}

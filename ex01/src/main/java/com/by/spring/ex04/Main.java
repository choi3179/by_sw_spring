package com.by.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("playerCtx.xml");

        PlayerImpl p = context.getBean("player", PlayerImpl.class);

        Soccer s = (Soccer)context.getBean("soccer");

        String[] sportsName = {"축구", "컬링"};
        Object[] className = {context.getBean("soccer"), context.getBean("curling")};

        for(int i=0;i<sportsName.length;i++){
            System.out.println(sportsName[i]);

            p.input();
            p.info();
        }

    }
}

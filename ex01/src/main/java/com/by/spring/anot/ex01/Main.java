package com.by.spring.anot.ex01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

        Cats info = ctx.getBean("catsInfo", Cats.class);
        info.getMyCatsInfo();

        MyCats cats2 = ctx.getBean("cat2", MyCats.class);
        info.setMyCats(cats2);
        info.getMyCatsInfo();;

        ctx.close();
    }
}

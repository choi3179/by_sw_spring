package com.by.spring.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("personCtx.xml");

        StudentPersonImpl s = ctx.getBean("student", StudentPersonImpl.class);
        EmployeePersonImpl e = ctx.getBean("employee", EmployeePersonImpl.class);

        MyInformation info = ctx.getBean("info", MyInformation.class);
        info.setPerson(s);
        //info.setPerson(new StudentPersonImpl());

        info.processMessage(s);
        info.processMessage(e);
        info.processMessage("na",26,"여자");

        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("aa");
        hobbys.add("bbb");
        hobbys.add("cc");
        MyInformation info2 = ctx.getBean("info2", MyInformation.class);
        e.personShow(hobbys);
        info2.processMessage(e);
    }
}

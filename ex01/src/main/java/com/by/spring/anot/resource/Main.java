package com.by.spring.anot.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new GenericXmlApplicationContext("resourceCtx.xml");

        MonitorViewer viewer = ctx.getBean("monitor", MonitorViewer.class);
        viewer.print();
    }
}

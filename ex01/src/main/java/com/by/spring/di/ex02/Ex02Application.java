package com.by.spring.di.ex02;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ex02Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("appCtx.xml");  // 설정 파일 - xml 기반

        IRecordViewImpl view = (IRecordViewImpl) context.getBean("view");
        view.print();

        /*IRecordImpl record = new IRecordImpl();
        IRecordViewImpl view = new IRecordViewImpl();

        view.setRecord(record);
        view.input();
        view.print();*/

        //SpringApplication.run(Ex02Application.class, args);
    }

}

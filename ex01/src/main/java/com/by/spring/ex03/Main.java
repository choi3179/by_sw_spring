package com.by.spring.ex03;

import com.by.spring.ex02.IRecordViewImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("memberCtx.xml");  // 설정 파일 - xml 기반

        MemberDAO dao = (MemberDAO) context.getBean("dao");
        MemberDAO da2 = context.getBean("dao", MemberDAO.class);

        System.out.println(dao);
        dao.insert();
    }
}

package com.by.spring.aop.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * 스프링 제공하는 기능을 이용한 AOP
 * MethodInterceptor 이용 (스프링 제공 cglib도 있지만 aop 제공 인터페이스 사용)
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("invocationCtx.xml");

        // Proxy 객체를 만들어 컨테이너에 넘긴다. -> 필요한 객체 생성은 설정파일 빈으로 완료
        ICalc proxy = ctx.getBean("proxy", ICalc.class);
        System.out.println(proxy.add(20,30));
        System.out.println(proxy.mul(5,7));
    }
}

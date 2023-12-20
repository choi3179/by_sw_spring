package com.by.spring.aop.ex03;

import java.lang.reflect.Proxy;

/**
 * 자바 기반 AOP 학습
 * InvocationHandler 이용
 */
public class Main {
    public static void main(String[] args) {

        ICalc c = new ICalcImpl();

        ICalc proxy = (ICalc) Proxy.newProxyInstance(
                        c.getClass().getClassLoader(),   // loader (클래스)
                        c.getClass().getInterfaces(),    // interface (행위 - 함수)
                        new LogHandlerImpl(c));           // handler (보조 업무 - 인자값)

        System.out.println(proxy.add(1,2));
        System.out.println(proxy.add(10,22));
        System.out.println();
        System.out.println(proxy.mul(3,5));
    }
}

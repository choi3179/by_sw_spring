package com.by.spring.aop.ex04;

public class BookBeanImpl implements IBookBean{
    @Override
    public void testHello(String str) {
        System.out.println("public void testHello(String str) call >> " + str);
    }

    @Override
    public int korHello() {
        System.out.println("public int korHello call ");
        return 0;
    }
}

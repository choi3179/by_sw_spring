package com.by.spring.aop.ex05;

public class ICalcImpl implements ICalc {

    @Override
    public int add(int x, int y) {
        //  보조 관심(cross-cutting-concern)
        int result = x+y;
        //  보조 관심(cross-cutting-concern)
        System.out.println("add 주 관심사");
        return result;
    }

    @Override
    public int sub(int x, int y, int z) {
        if(y>x)
            throw new IllegalArgumentException("y값이 x보다 큽니다");

        int result = x - y -z;
        System.out.println("sub 주 관심사");

        return result;
    }

    @Override
    public int mul(int x, int y) {
        int result = x*y;
        return result;
    }
}

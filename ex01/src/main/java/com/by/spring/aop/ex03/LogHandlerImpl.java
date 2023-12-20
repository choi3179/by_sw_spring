package com.by.spring.aop.ex03;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandlerImpl implements InvocationHandler {

    private Object target;

    public LogHandlerImpl(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("---- invoke method start ----");
        // 보조 업무 구현
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        // main 관심 실행
        int result = (int)method.invoke(target, args);

        sw.stop();
        log.info("타이머 정지");

        log.info("[TimerLog] Method : " + method.getName());
        log.info("[TimerLog] process Time : " + sw.getTotalTimeMillis());

        return result;
    }
}

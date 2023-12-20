package com.by.spring.aop.ex02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogHandlerImpl implements MethodInterceptor {

    private Object target;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("MethodIntercepter interface invoke method -----------");

        // 보조 업무
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        // main 관심 실행
        Object result = invocation.proceed();

        sw.stop();
        log.info("타이머 정지");

        log.info("[TimerLog] Method : " + invocation.getMethod());
        log.info("[TimerLog] process Time : " + sw.getTotalTimeMillis());

        return result;
    }
}

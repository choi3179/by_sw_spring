package com.by.spring.aop.ex05;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("Around Service invoke() start.....");

        // 보조 업무
        Log log = LogFactory.getLog(this.getClass());
        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        // 주관심 코드
        Object obj = invocation.proceed();      // 주 관심사의 함수 호출

        // 보조 업무
        sw.stop();
        log.info("타이머 정지");

        log.info("[TimerLOG] Method : " + invocation.getMethod());
        log.info("[TimerLOG] process Time : " + sw.getTotalTimeMillis());

        return obj;
    }
}

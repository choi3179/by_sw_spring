package com.by.spring.aop.ex01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {

    public int add(int x, int y){
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        int result = x+y;

        sw.stop();
        log.info("타이머 정지");

        log.info("[TimerLog] Method : add ");
        log.info("[TimerLog] process Time : " + sw.getTotalTimeMillis());

        return result;
    }

    public int mul(int x, int y){
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        int result = x*y;

        sw.stop();
        log.info("타이머 정지");

        log.info("[TimerLog] Method : mul ");
        log.info("[TimerLog] process Time : " + sw.getTotalTimeMillis());

        return result;
    }
}

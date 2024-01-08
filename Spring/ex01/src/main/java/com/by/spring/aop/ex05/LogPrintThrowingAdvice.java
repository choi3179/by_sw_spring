package com.by.spring.aop.ex05;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * 에러 정보 throw 관심사에 대한 공통 모듈 처리
 */
public class LogPrintThrowingAdvice implements ThrowsAdvice {
    // ThrowsAdvice는 추상메소드를 가지고 있지 않은 인터페이스임.

    public void afterThrowing(IllegalArgumentException e){
        Log log = LogFactory.getLog(this.getClass());
        log.info("[afterThrowing 예외 발생] : " + e.getMessage());
    }
}

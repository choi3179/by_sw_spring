package com.by.spring.aop.ex04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/**
 * XML 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
 */
public class LoggingAdvice {

    /*
    Around 방식의 사전/사후 처리 AOP around 방식으로 할 때
    인수는 ProceedingJoinPoint, 리턴 - Object
     */
    public Object around(ProceedingJoinPoint point) throws Throwable{

        String methodName = point.getKind();

        System.out.println("[LOG] methodName = " + methodName + " 호출 되기 전");

        StopWatch sw = new StopWatch();
        sw.start();

        Object obj = point.proceed();   // 실제 타겟 대상 메소드

        sw.stop();
        System.out.println("[LOG] " + methodName + "호출 완료");
        System.out.println("[LOG] 실행시간 : " + sw.getTotalTimeMillis() + "초");

        return obj;
    }
}

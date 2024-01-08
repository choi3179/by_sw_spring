package com.by.spring.aop.ex06_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp {       // Advice 클래스로 선언

    // @Pointcut("execution(public void get*(..))")
    // @Pointcut("execution(public void get*(..))") // public void인 모든 get메소드
    // @Pointcut("execution(* com.by.spring.aop.ex06_annotation.*.*())") // com.by.spring.aop.ex06_annotation 패키지에 파라미터가 없는 모든 메소드
    // @Pointcut("execution(* com.by.spring.aop.ex06_annotation.*.*())") // com.by.spring.aop.ex06_annotation 패키지 & com.by.spring.aop.ex06_annotation 하위 패키지에 파라미터가 없는 모든 메소드
    // @Pointcut("execution(* com.by.spring.aop.ex06_annotation.Employee.*())") // kr.edu.kosta.Employee 안의 모든 메소드
    // @Pointcut("within(ex06.aop.annot.*)") // kr.edu.kosa 패키지 안에 있는 모든 메소드
    // @Pointcut("within(ex06.aop.annot..*)") //kr.edu.kosa 패키지 및 하위 패키지 안에 있는 모든 메소드
    // @Pointcut("within(ex06.aop.annot.Worker)") //kr.edu.kosa.Worker 모든 메소드
    // @Pointcut("bean(student)") //student 빈에만 적용
    // @Pointcut("bean(*ker)") //~ker로 끝나는 빈에만 적용
    // @Pointcut("!bean(student)") // student 빈을 제외한것에 적용
    public void pointCutMethod() {}

    @Around("pointCutMethod()")
    public Object loggerApp(ProceedingJoinPoint point) throws Throwable {
        
        String signature = point.getSignature().toLongString();
        System.out.println(signature + " is Start .....");
        System.out.println("around advice...");
        long start = System.currentTimeMillis();
        
        Object obj = point.proceed();
        
        long end = System.currentTimeMillis();
        System.out.println(signature + " is Finished");
        System.out.println(signature + " 경과 시간 : " + (end - start));
        
        return obj;
    }

    @Before("pointCutMethod()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice call");
        System.out.println("입학/입사를 축하합니다.");
    }
}

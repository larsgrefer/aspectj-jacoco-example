package de.larsgrefer.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class NoJoinPoint {

    @Before("execution(* NoJoinPoint.method())")
    public void before() {
        System.out.println("before");
    }

    @After("execution(* NoJoinPoint.method())")
    public void after() {
        System.out.println("after");
    }

    public void method() {
        System.out.println("method");
    }
}

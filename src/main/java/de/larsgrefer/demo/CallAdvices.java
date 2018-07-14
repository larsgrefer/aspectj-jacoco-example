package de.larsgrefer.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class CallAdvices {

    @Around("call(String nop*())")
    public Object aroundCall(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint);
        return joinPoint.proceed();
    }

    public String nop1() {
        return "foo";
    }

    public String nop2() throws IOException {
        throw new IOException();
    }

    public void dummy() throws IOException {
        nop1();
        nop2();
    }

    public void dummy2() throws IOException {
        System.out.println("dummy2");
        nop2();
    }

}

package de.larsgrefer.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class FieldAdvices {

    private String foo = "foo";

    @Around("get(String foo)")
    public String aroundField(ProceedingJoinPoint pjp) throws Throwable {
        return ((String) pjp.proceed()).toUpperCase();
    }

    public String dummy() {
        return foo;
    }
}

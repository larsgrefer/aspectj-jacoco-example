package de.larsgrefer.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspects {

    @Before("execution(* Advised.dummy0(..)) || execution(* Advised.dummy2(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("--> " + joinPoint);
    }

    @AfterReturning("execution(* Advised.dummy1(..)) || execution(* Advised.dummy2(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("<-- " + joinPoint);
    }

    @AfterThrowing(value = "execution(* Advised.dummy3(..))", throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e) {
        System.out.println(joinPoint + " threw " + e.getMessage());
    }
}

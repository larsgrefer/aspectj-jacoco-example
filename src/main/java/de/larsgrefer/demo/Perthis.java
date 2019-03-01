package de.larsgrefer.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect("perthis(execution(* *.myMethod(int)))")
public class Perthis {

    @Before("execution(* *.myMethod(int))")
    public void perthisBefore() {
        System.out.println("perthisBefore");
    }
}

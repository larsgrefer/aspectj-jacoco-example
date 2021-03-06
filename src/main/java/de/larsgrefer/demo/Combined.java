package de.larsgrefer.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * This class contains both an advice and an advised method.
 *
 * This demonstrates the generation of both ajc$preClinit() and ajc$postClinit() in the same class.
 */
@Aspect
public class Combined {

    @Around("execution(* Combined.dummy*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-->");
        Object value = proceedingJoinPoint.proceed();
        System.out.println("<--");
        return value;
    }

    public void dummy1() {

        int i;
        if (System.currentTimeMillis() % 2 >= 2) {
            i = 5;
        } else {
            i = 42;
        }
        System.out.println(i);
    }

    public void dummy2() {

        int i;
        if (System.currentTimeMillis() % 2 >= 3) {
            i = 5;
        } else {
            i = 42;
        }
        System.out.println(i);
    }

    public int dummy3() {

        int i;
        if (System.currentTimeMillis() % 2 >= 4) {
            i = 5;
        } else {
            i = 42;
        }
        System.out.println(i);
        return i;
    }
}

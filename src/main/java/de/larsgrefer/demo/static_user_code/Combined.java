package de.larsgrefer.demo.static_user_code;

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

    @Around("execution(* Combined.dummy(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-->");
        Object value = proceedingJoinPoint.proceed();
        System.out.println("<--");
        return value;
    }

    public void dummy() {
        System.out.println("dummy");
    }

    private static Object object = new Object();
    static {
        int i = 0;
        System.out.println(i++);
    }
}

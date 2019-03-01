package de.larsgrefer.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoJoinPointTest {

    private NoJoinPoint noJoinPoint;

    @Before
    public void setUp() {
        noJoinPoint = new NoJoinPoint();
    }

    @Test
    public void method() {
        noJoinPoint.method();
    }
}
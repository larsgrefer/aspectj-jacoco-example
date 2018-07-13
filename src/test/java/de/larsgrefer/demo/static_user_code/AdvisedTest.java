package de.larsgrefer.demo.static_user_code;

import org.junit.Before;
import org.junit.Test;

public class AdvisedTest {

    private Advised advised;

    @Before
    public void setUp() {
        advised = new Advised();
    }

    @Test
    public void dummy0() {
        advised.dummy0();
    }

    @Test
    public void dummy1() {
        advised.dummy1();
    }

    @Test
    public void dummy2() {
        advised.dummy2();
    }

    @Test
    public void dummy3() {
        advised.dummy3();
    }
}
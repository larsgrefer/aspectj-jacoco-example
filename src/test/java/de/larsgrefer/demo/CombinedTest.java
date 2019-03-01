package de.larsgrefer.demo;

import org.junit.Before;
import org.junit.Test;

public class CombinedTest {

    private Combined combined;

    @Before
    public void setUp() {
        combined = new Combined();
    }

    @Test
    public void dummy() {
        combined.dummy1();
        combined.dummy2();
        combined.dummy3();
    }
}
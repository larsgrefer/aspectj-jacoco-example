package de.larsgrefer.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombinedTest {

    private Combined combined;

    @Before
    public void setUp() {
        combined = new Combined();
    }

    @Test
    public void dummy() {
        combined.dummy();
    }
}
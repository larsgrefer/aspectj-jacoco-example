package de.larsgrefer.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CallAdvicesTest {

    private CallAdvices callAdvices;

    @Before
    public void setUp() {
        callAdvices = new CallAdvices();
    }

    @Test(expected = IOException.class)
    public void dummy() throws IOException {
        callAdvices.dummy();
    }

    @Test(expected = IOException.class)
    public void dummy2() throws IOException {
        callAdvices.dummy2();
    }
}
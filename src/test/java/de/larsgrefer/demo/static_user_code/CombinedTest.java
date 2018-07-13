package de.larsgrefer.demo.static_user_code;

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
        combined.dummy();
    }

}
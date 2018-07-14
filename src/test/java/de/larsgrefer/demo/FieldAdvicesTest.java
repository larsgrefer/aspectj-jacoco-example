package de.larsgrefer.demo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldAdvicesTest {

    private FieldAdvices fieldAdvices;

    @Before
    public void setUp() {
        fieldAdvices = new FieldAdvices();
    }

    @Test
    public void dummy() {
        assertEquals(fieldAdvices.dummy(), "FOO");
    }
}
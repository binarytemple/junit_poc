package net.packetops;

import junit.framework.TestCase;

public class ExampleTest extends TestCase {

    Example x = null;


    public void setUp() throws Exception {
        super.setUp();
        x = new Example();

    }

    public void tearDown() throws Exception {

    }

    public void testOneplus() throws Exception {
        assertEquals(2, x.oneplus(1));


    }
}
package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testMainOutput() {
        App.main(new String[]{});
        assertEquals("Hello World!\n", outContent.toString());
    }

    @Test
    public void testMainOutputIsNotEmpty() {
        App.main(new String[]{});
        assertTrue(outContent.toString().length() > 0);
    }
}

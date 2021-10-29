package by.latushko.training.util;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdGeneratorTest {
    @Test
    public void testGenerateId() {
        long expected = 2L;

        IdGenerator.generateId();
        long actual = IdGenerator.generateId();

        assertEquals(actual, expected);
    }
}
package by.latushko.training.reader.impl;

import by.latushko.training.exception.InputFileReadException;
import by.latushko.training.reader.DataReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class DataReaderImplTest {
    private static final String INPUT_FILE_PATH = "data/input.txt";
    private static final String INPUT_WRONG_FILE_PATH = "dataa/input.txt";
    private DataReader dataReader;

    @BeforeClass
    public void setUp() {
        dataReader = new DataReaderImpl();
    }

    @Test
    public void testReadLines() {
        List<String> expected = List.of("5:6 5.0 10.6", "1:1 2.1 4.3");
        List<String> actual = null;

        try {
            actual = dataReader.readLines(INPUT_FILE_PATH);
        } catch (InputFileReadException e) {
            fail("Failed on data reading: " + INPUT_FILE_PATH, e);
        }

        assertEquals(actual, expected);
    }

    @Test
    public void testReadLinesException() {
        assertThrows(InputFileReadException.class, ()-> dataReader.readLines(INPUT_WRONG_FILE_PATH));
    }
}
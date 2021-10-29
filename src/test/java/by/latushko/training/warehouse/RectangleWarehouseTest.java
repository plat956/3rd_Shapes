package by.latushko.training.warehouse;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleWarehouseTest {

    @BeforeClass
    public void setUp() {
        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        rectangleWarehouse.putProperties(1L, 10.5d, 100.2d);
        rectangleWarehouse.putProperties(2L, 15.33d, 7.12d);
    }

    @Test
    public void testGetProperties() {
        RectangleProperties expected = new RectangleProperties(10.5d, 100.2d);
        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        RectangleProperties actual = rectangleWarehouse.getProperties(1L).orElse(null);

        assertEquals(actual, expected);
    }

    @Test
    public void testUpdatePropertiesSuccess() {
        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        boolean actual = rectangleWarehouse.updateProperties(2L, 15.0d, 17.8d);

        assertTrue(actual);
    }

    @Test
    public void testUpdatePropertiesFail() {
        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        boolean actual = rectangleWarehouse.updateProperties(999L, 1.0d, 2.0d);

        assertFalse(actual);
    }
}
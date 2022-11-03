import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    AverageDoubleArrays average = new AverageDoubleArrays();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCount() {
        //Given, When, Then
        double [] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double expected = 5.0;
        double actual = average.count(array);
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double expected = 15;
        double actual = average.sum(array);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double expected = 3.0;
        double actual = average.average(array);
        assertEquals(expected, actual);
    }
}
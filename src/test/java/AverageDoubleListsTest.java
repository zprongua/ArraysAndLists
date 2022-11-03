import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    AverageDoubleLists adl = new AverageDoubleLists();
    @Test
    void count() {
        ArrayList<Double> al = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        double expectedCount = al.size();
        double actualCount = adl.count(al);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void sum() {
        ArrayList<Double> al = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        double expectedSum = 15.0;
        double actualSum = adl.sum(al);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void average() {
        ArrayList<Double> al = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        double expectedAverage = 3.0;
        double actualAverage = adl.average(al);
        assertEquals(expectedAverage, actualAverage);
    }
}
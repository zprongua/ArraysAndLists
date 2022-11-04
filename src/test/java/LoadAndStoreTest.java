import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    LoadAndStore las = new LoadAndStore();
    @Test
    void TestloadIntArrayFromFile() {
        int[] expected = {4,5,6,11,13,8,9,7,14,18};
        int[] actual = las.loadIntArrayFromFile("/Users/zachary/Projects/ArraysAndLists/testIntegerData1.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,5,6,11,13,8,9,7,14,18));
        ArrayList<Integer> actual = las.loadIntegerArrayListFromFile("/Users/zachary/Projects/ArraysAndLists/testIntegerData1.txt");
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void loadDoubleArrayFromFile() {
        double[] expected = {4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.97060, 7.4532, 14.5, 18.00023132123};
        double[] actual = las.loadDoubleArrayFromFile("/Users/zachary/Projects/ArraysAndLists/testDoubleData2.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.97060, 7.4532, 14.5, 18.00023132123));
        ArrayList<Double> actual = las.loadDoubleArrayListFromFile("/Users/zachary/Projects/ArraysAndLists/testDoubleData2.txt");
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void loadStringArrayFromFile() {
        String[] expected = {"4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space", "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"};
        String[] actual = las.loadStringArrayFromFile("/Users/zachary/Projects/ArraysAndLists/testStringData3.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space", "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"));
        ArrayList<String> actual = las.loadStringArrayListFromFile("/Users/zachary/Projects/ArraysAndLists/testStringData3.txt");
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
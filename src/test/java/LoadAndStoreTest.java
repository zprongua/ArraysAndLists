import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        int[] expected = {4,5,6,11,13,8,9,7,14,18};
        int[] actual = las.loadIntArrayFromFile("/Users/zachary/Projects/ArraysAndLists/testIntegerData1.txt");
        assertEquals(expected, actual);
    }

    @Test
    void loaddoubleArrayFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadDoubleArrayListFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayListFromFile() {
        assertEquals(null, "");
    }
}
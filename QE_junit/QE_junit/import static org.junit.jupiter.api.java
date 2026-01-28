import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Activity1 {

    // Test fixture
    static ArrayList<String> list;

    // Setup method
    @BeforeAll
    static void setUp() {
        // Initialize ArrayList
        list = new ArrayList<String>();

        // Add values
        list.add("alpha"); // index 0
        list.add("beta");  // index 1
    }

    // insertTest()
    @Test
    void insertTest() {
        // Check initial size
        assertEquals(2, list.size(), "Wrong size");

        // Add new element
        list.add("gamma");

        // Check new size
        assertEquals(3, list.size(), "Wrong size");

        // Check individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

    // replaceTest()
    @Test
    void replaceTest() {
        // Replace element at index 1
        list.set(1, "delta");

        // Assert values after replacement
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("delta", list.get(1), "Wrong element");
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {

    ArrayList<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();

        list.add("alpha");
        list.add("beta");
    }

    @Test
    void insertTest() {
        // Check initial size
        assertEquals(2, list.size());

        // Insert new element
        list.add("gamma");

        // Validate size and elements
        assertEquals(3, list.size());
        assertEquals("alpha", list.get(0));
        assertEquals("beta", list.get(1));
        assertEquals("gamma", list.get(2));
    }

    @Test
    void replaceTest() {
        // Replace element at index 1
        list.set(1, "delta");

        // Validate replaced values
        assertEquals("alpha", list.get(0));
        assertEquals("delta", list.get(1));
    }
}

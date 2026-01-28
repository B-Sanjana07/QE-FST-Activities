import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Activity1 {

    static ArrayList<String> list;

    @BeforeAll
    static void setUp() {
        list = new ArrayList<String>();
        list.add("alpha"); 
        list.add("beta");  
    }

    @Test
    void insertTest() {
        assertEquals(2, list.size(), "Wrong size");

        list.add("gamma");

        assertEquals(3, list.size(), "Wrong size");

        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

    @Test
    void replaceTest() {
        list.set(1, "delta");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("delta", list.get(1), "Wrong element");
    }
}


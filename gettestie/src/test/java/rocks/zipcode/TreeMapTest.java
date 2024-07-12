package rocks.zipcode;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TreeMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMapPut() {
        Map<String, Integer> phoneBook = new TreeMap<>();
        phoneBook.put("Stroiden", 1111123121);
        assertFalse(phoneBook.isEmpty()); // false
    }

    @org.junit.Test
    public void testTreeMapAdd(){
        Map<String, Integer> phoneBook = new TreeMap<>();
        phoneBook.put("Spleeb", 120329192);
        Integer actual = phoneBook.get("Spleeb");
        assertEquals(120329192, actual, 0);
    }

    @org.junit.Test
    public void testTreeMapRemove(){
        Map<String, Integer> phoneBook = new TreeMap<>();
        phoneBook.put("Snork", 90202202);
        phoneBook.remove("Snork");
        assertTrue(phoneBook.isEmpty());

    }

    @org.junit.Test
    public void testTreeMapIsEmpty(){
        Map<String, Integer> phoneBook = new TreeMap<>();
        assertTrue(phoneBook.isEmpty());
    }
}

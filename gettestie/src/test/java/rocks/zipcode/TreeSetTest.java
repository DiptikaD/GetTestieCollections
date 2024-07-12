package rocks.zipcode;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class TreeSetTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeSetAdd() {
        Set<Integer> iD = new TreeSet<>();
        iD.add(92);
        assertTrue(iD.contains(92));
    }

    @org.junit.Test
    public void testTreeSetRemove(){
        Set<Integer> iD = new TreeSet<>();
        iD.add(32);
        iD.remove(32);
        assertFalse(iD.contains(32));
    }

    @org.junit.Test
    public void testTreeSetContains(){
        Set<Integer> iD = new TreeSet<>();
        iD.add(23);
        assertTrue(iD.contains(23));

    }

    @org.junit.Test
    public void testTreeSetIsEmpty() {
        Set<Integer> iD = new TreeSet<>();
        assertTrue(iD.isEmpty());
    }
}

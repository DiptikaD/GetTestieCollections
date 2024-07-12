package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */

    @Test
    public void testHashSet(){
        HashSet<Double> hashSetTest = new HashSet<>();
        hashSetTest.add(4.3);
        hashSetTest.remove(4.3);

        Assert.assertFalse(hashSetTest.contains(4.3));
    }

    @Test
    public void testArrayList(){
        ArrayList<Double> arrayListTest = new ArrayList<>();
        arrayListTest.add(4.3);
        arrayListTest.remove(4.3);

        Assert.assertFalse(arrayListTest.contains(4.3));
    }

    @Test
    public void testHashMap(){
        HashMap<String , Double> hashMapTest = new HashMap<>();
        hashMapTest.put("cat", 2.0);
        hashMapTest.remove("cat");

        Assert.assertTrue(hashMapTest.isEmpty());
    }

    @Test
    public void testLinkedList(){
        LinkedList<Double> linkedListTest = new LinkedList<>();
        linkedListTest.add(4.3);
        linkedListTest.remove(4.3);

        Assert.assertFalse(linkedListTest.contains(4.3));
    }
    @Test
    public void testArrayDeque(){
        HashSet<Double> hashSetTest = new HashSet<>();
        ArrayDeque<Double> arrayDequeTest = new ArrayDeque<>();
        arrayDequeTest.add(4.3);
        arrayDequeTest.remove(4.3);

        Assert.assertFalse(arrayDequeTest.contains(4.3));
    }
    @Test
    public void testApp() {
        assertTrue(true);
    }
}

package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertFalse;

public class PriorityQueueTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQAdd() {
        ArrayList<String> iteratorList = new ArrayList<>();
        PriorityQueue<String> littleQ = new PriorityQueue<>();

        littleQ.add("A");
        littleQ.add("B");
        littleQ.add("C");
        littleQ.add("D");

        Assert.assertTrue(littleQ.contains("B"));
    }

    @org.junit.Test
    public void testPriorityQRemove() {
        PriorityQueue<String> littleQ = new PriorityQueue<>();

        littleQ.add("A");
        littleQ.add("B");
        littleQ.add("C");
        littleQ.add("D");
        littleQ.remove("A");


        Assert.assertEquals(3, littleQ.size());
    }

    @org.junit.Test
    public void testPriorityQNext(){
        PriorityQueue<String> littleQ = new PriorityQueue<>();

        littleQ.add("A");
        littleQ.add("B");
        littleQ.add("C");
        littleQ.add("D");

        Assert.assertEquals("A", littleQ.peek());

    }

    @org.junit.Test
    public void testPriorityQEmpty() {
        PriorityQueue<String> littleQ = new PriorityQueue<>();
        Assert.assertTrue(littleQ.isEmpty());
    }
}

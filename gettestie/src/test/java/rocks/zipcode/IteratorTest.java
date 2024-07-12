package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IteratorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIteratorAdd() {
        ArrayList<String> iteratorList = new ArrayList<>();

            iteratorList.add("A");
            iteratorList.add("B");
            iteratorList.add("C");
            iteratorList.add("D");

            Iterator iterator = iteratorList.iterator();

        Assert.assertTrue(iterator.hasNext());
    }

    @org.junit.Test
    public void testIteratorRemove() {
        ArrayList<String> iteratorList = new ArrayList<>();

        iteratorList.add("A");
        iteratorList.add("B");
        iteratorList.add("C");
        iteratorList.add("D");

        Iterator iterator = iteratorList.iterator();
        iterator.next();
        iterator.remove();
    Assert.assertEquals(iteratorList.size(), 3);
    }

    @org.junit.Test
    public void testIteratorNext(){
        ArrayList<String> iteratorList = new ArrayList<>();

        iteratorList.add("A");
        iteratorList.add("B");
        iteratorList.add("C");
        iteratorList.add("D");

        Iterator iterator = iteratorList.iterator();
        Assert.assertEquals("A", iterator.next());

    }

    @org.junit.Test
    public void testIteratorHasNext() {
        ArrayList<String> iteratorList = new ArrayList<>();

        Iterator iterator = iteratorList.iterator();
        assertFalse(iterator.hasNext());
    }

}

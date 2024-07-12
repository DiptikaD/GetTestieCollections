package rocks.zipcode;

import java.util.Stack;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {

        @org.junit.Before
        public void setUp() throws Exception {
        }

        @org.junit.After
        public void tearDown() throws Exception {
        }

        @org.junit.Test
        public void TestVectorAdd() {
            Vector<String> vector = new Vector<>();
            vector.add("Hello world");
            assertEquals(false, vector.isEmpty()); // false
        }

        @org.junit.Test
        public void testVectorRemove(){
            Vector<String> vector = new Vector<>();
            vector.add("goodbye world");
            vector.remove(0);
            assertEquals(true, vector.isEmpty());
        }

        @org.junit.Test
        public void testVectorElementAt(){
            Vector<String> vector = new Vector<>();
            vector.add("lookie at me!");
            assertEquals("lookie at me!", vector.elementAt(0));

        }

        @org.junit.Test
        public void testStackIsEmpty(){
            Vector<String> vector = new Vector<>();
            assertEquals(true, vector.isEmpty());
        }
        // Make a bigger test exercising more Stack methods.....


}

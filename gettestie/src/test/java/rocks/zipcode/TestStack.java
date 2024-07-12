package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void testStackPop(){
        Stack<String> stack = new Stack<>();
        stack.push("goodbye world");
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @org.junit.Test
    public void testStackPeek(){
        Stack<String> stack = new Stack<>();
        stack.push("lookie at me!");
        assertEquals("lookie at me!", stack.peek());

    }

    @org.junit.Test
    public void testStackIsEmpty(){
        Stack<String> stack = new Stack<>();
        assertEquals(true, stack.isEmpty());
    }
    // Make a bigger test exercising more Stack methods.....
}

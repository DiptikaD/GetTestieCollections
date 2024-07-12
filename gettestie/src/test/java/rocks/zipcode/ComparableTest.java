package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ComparableTest{

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testComparable() {
        Person dip = new Person("dip", 1985);
        Person naf = new Person("naf", 1985);

        dip.compareTo(naf);
    }

}

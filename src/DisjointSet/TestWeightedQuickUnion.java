package DisjointSet;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestWeightedQuickUnion {

    @Test
    public void SanityTest() {
        int N = 8;
        WeightedQuickUnion wqu = new WeightedQuickUnion(N);
        wqu.connect(0, 1);
        assertTrue(wqu.isConnected(0, 1));
    }

    @Test
    public void Question3Test() {
        int N = 10;
        WeightedQuickUnion ds = new WeightedQuickUnion(N);
        ds.connect(0, 1);
        ds.connect(2, 3);
        ds.connect(9, 5);
        ds.connect(5, 7);
        assertEquals(ds.size(5), 3);
        ds.connect(7, 1);
        ds.connect(4, 2);
        ds.connect(3, 1);
        assertTrue(ds.isConnected(7, 9));
        assertEquals(ds.size(4), 8);
    }

}

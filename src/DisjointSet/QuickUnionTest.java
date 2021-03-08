package DisjointSet;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuickUnionTest {

    @Test
    public void SanityTest() {
        int N = 8;
        QuickUnion qu = new QuickUnion(N);
        qu.connect(0, 1);
        assertTrue(qu.isConnected(0, 1));
    }

    @Test
    public void Question3Test() {
        int N = 10;
        QuickUnion ds = new QuickUnion(N);
        ds.connect(0, 1);
        ds.connect(2, 3);
        ds.connect(9, 5);
        ds.connect(5, 7);
        ds.connect(7, 1);
        ds.connect(4, 2);
        ds.connect(3, 1);
        assertTrue(ds.isConnected(4, 9));
    }
}

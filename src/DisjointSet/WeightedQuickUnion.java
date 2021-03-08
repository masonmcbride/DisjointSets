package DisjointSet;

import java.util.Arrays;

public class WeightedQuickUnion implements DisjointSet {
    private int[] id;
    private int[] is;

    public WeightedQuickUnion(int N) {
        this.id = new int[N];
        this.is = new int[N];

        for(int i = 0; i < N; i++) {
            this.id[i] = -1;
            this.is[i] = i;
        }
    }

    public void connect(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }

        if (-this.id[i] < -this.id[j]) {
            this.id[j] += this.id[i];
            this.id[i] = j;
        } else {
            this.id[i] += this.id[j];
            this.id[j] = i;
        }
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int idx) {
        if (this.id[idx] < 0) {
            return idx;
        }

        return root(this.id[idx]);
    }

    public int size(int p) {
        int i = this.root(p);
        return -this.id[i];
    }

    public String toString() {
        return Arrays.toString(this.id) + "\n" +
                Arrays.toString(this.is);
    }
}

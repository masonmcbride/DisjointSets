package DisjointSet;
public interface DisjointSet {
    void connect(int p, int q);
    boolean isConnected(int p, int q);
}

package common;

public class Edge {
    private int origin;
    private int destination;
    private int weight;

    public Edge(int destination, int origin) {
        this.destination = destination;
        this.origin = origin;
    }

    public final int getDestination() {
        return this.destination;
    }

    public final int getOrigin() {
        return this.origin;
    }
}

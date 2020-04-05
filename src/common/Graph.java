package common;

import java.util.ArrayList;

public class Graph {
    private int id;
    private ArrayList<Vertex> vertices;

    public Graph() {

    }

    public Vertex GetVertexById(int vertexId) {
        return this.vertices.get(id);
    }
}

package com.vaani.algo.ds.core.graph;

import java.util.*;

public class DirectedGraph {
    private Set<Vertex> vertexSet = new HashSet<Vertex>();
    private Map<Vertex, List<Vertex>> adjacencys = new HashMap<Vertex, List<Vertex>>();

    public Set<Vertex> getVertexSet() {
        return vertexSet;
    }

    public void setVertexSet(Set<Vertex> vertexSet) {
        this.vertexSet = vertexSet;
    }

    public Map<Vertex, List<Vertex>> getAdjacencys() {
        return adjacencys;
    }

    public void setAdjacencys(Map<Vertex, List<Vertex>> adjacencys) {
        this.adjacencys = adjacencys;
    }

}

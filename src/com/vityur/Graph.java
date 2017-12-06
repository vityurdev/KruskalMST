package com.vityur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Graph extends ArrayList<Edge> {
    private HashSet<Integer> verticesSet = new HashSet<>();

    public void addEdge(int v1, int v2, int weight) {
        this.add(new Edge(v1, v2, weight));

        verticesSet.add(v1);
        verticesSet.add(v2);
    }

    public Edge popFirstEdge() {
        Edge edge = this.get(0);
        this.remove(0);
        return edge;
    }

    public void printKruskalMST() {
        Graph graph = (Graph) this.clone();

        // Sorting edges
        Collections.sort(graph, new EdgeWeightComparator());

        // Creating ArrayList of one-element HashSets
        VerticesSetsArray verticesSetsArray = new VerticesSetsArray(); // instance of ArrayList<HashSet<Integer>> subclass

        while (!verticesSet.isEmpty()) {
            HashSet<Integer> oneElementSet = new HashSet<>();
            oneElementSet.add((Integer) Utils.popRandomObject(verticesSet));
            verticesSetsArray.add(oneElementSet);
        }

        // Creating an instance of MST
        ArrayList<Edge> minST = new ArrayList<>();

        while (verticesSetsArray.size() > 1) {
            Edge edge = graph.popFirstEdge();

            if (verticesSetsArray.areInDifferentSets(edge.getV1(), edge.getV2())) {
                verticesSetsArray.mergeSetsWithElements(edge.getV1(), edge.getV2());
                minST.add(edge);
            }
        }

        int totalEdgeWeight = 0;

        for (Edge edge : minST) {
            System.out.print("(" + edge.getV1() + ", " + edge.getV2() + ") ");
            totalEdgeWeight += edge.getWeight();
        }

        System.out.print("\nTotal edge weight is " + totalEdgeWeight + ".");
    }
}

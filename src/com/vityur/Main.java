package com.vityur;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph graph = new Graph();

        graph.addEdge(3,5,3);
        graph.addEdge(5,6,6);
        graph.addEdge(1,3,1);
        graph.addEdge(2,5,1);
        graph.addEdge(3,4,1);
        graph.addEdge(1,2,2);
        graph.addEdge(3,6,2);
        graph.addEdge(1,4,3);

        graph.printKruskalMST();
    }
}

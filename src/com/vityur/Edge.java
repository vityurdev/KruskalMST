package com.vityur;

public class Edge {
    private Integer v1;
    private Integer v2;
    private int weight;

    public Edge(Integer v1, Integer v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public Integer getV1() {
        return v1;
    }

    public Integer getV2() {
        return v2;
    }

    public int getWeight() {
        return weight;
    }

}

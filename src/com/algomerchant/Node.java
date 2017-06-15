package com.algomerchant;

/**
 * Created by karthik on 16/06/17.
 */
public class Node {
    public int x, y, dist;
    public Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }

    public String toString() {
        return Integer.toString(dist);
    }
}

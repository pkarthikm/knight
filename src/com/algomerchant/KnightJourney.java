package com.algomerchant;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by karthik on 16/06/17.
 */
public class KnightJourney {
    private int M;
    private int N;
    private int startX;
    private int startY;
    private Node board[][];
    private int xLegalMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    private int yLegalMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public KnightJourney(int M, int N, int startX, int startY)
    {
        this.M = M;
        this.N = N;
        this.startX = startX;
        this.startY = startY;
        board = new Node[M][N];
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = new Node(i,j,-1);
            }
        }
        board[startX][startY].dist = 0;
    }

    private boolean isOnBoard(int x, int y)
    {
        if (x >= 0 && x < M && y >= 0 && y < N)
            return true;
        return false;
    }

    public void print()
    {
        for (int j = 0; j < N; j++)
        {
            for (int i = 0; i < M; i++)
            {
                System.out.print("  " + board[i][j]);
            }
            System.out.println();
        }
    }

    public void traverse() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(board[startX][startY]);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            for (int i = 0; i < 8; i++) { //traverse all legal moves
                int nextX = node.x + xLegalMove[i];
                int nextY = node.y + yLegalMove[i];
                if (isOnBoard(nextX, nextY) && board[nextX][nextY].dist < 0) { // is on board && not visited
                    board[nextX][nextY].dist = node.dist + 1; //increment level
                    queue.add(board[nextX][nextY]);
                }
            }

        }
    }
}

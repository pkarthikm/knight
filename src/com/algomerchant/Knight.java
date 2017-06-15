package com.algomerchant;

public class Knight {

    public static void main(String[] args) {
        int M = Integer.valueOf(args[0]);
        int N = Integer.valueOf(args[1]);
        int startX = Integer.valueOf(args[2]);
        int startY = Integer.valueOf(args[3]);

        KnightJourney kj = new KnightJourney(M,N,startX,startY);
        kj.traverse();
        kj.print();
    }
}


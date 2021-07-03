package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rls = 0;
        if (x1 + y1 == x2 + y2) {
            rls = Math.abs(y2 - y1);
        }
        return rls;
    }

    public static void main(String[] args) {
        System.out.println(way(5, 2, 2, 5));
    }
}
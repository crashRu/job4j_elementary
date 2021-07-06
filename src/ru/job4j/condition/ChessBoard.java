package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rls = 0;
        if (x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7 || x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7) {
            return rls;
        } else if (x1 + y2 == x2 + y2) {
            rls = Math.abs(y2 - y1);
        }
        return rls;
    }

    public static void main(String[] args) {
        System.out.println(way(5, 2, 2, 5));
    }
}
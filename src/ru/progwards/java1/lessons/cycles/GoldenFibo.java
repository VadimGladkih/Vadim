package ru.progwards.java1.lessons.cycles;

import ru.progwards.java1.lessons.compare.TriangleInfo;

public class GoldenFibo {
    static final double V1 = 1.61703;
    static final double V2 = 1.61903;

    public static int fiboNumber(int n) {
        int sum = 1;
        int n1 = 1;
        int n2 = 1;
        for (int i = 3; i <= n; ++i) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double ac = (double) a / c;
        double ab = (double) a / b;
        double ba = (double) b / a;
        return
                (
                        ((a == b) && (V1 <= ac) && (V2 >= ac))||
                        ((a == c) && (V1 <= ab) && (V2 >= ab))||
                        ((c == b) && (V1 <= ba) && (V2 >= ba))
                );
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(15));
        System.out.println(isGoldenTriangle(34, 34, 55));
    }
}

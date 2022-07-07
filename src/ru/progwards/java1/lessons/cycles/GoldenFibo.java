package ru.progwards.java1.lessons.cycles;


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
            System.out.println(sum);
        }
        return sum;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double ac = (double) a / c;
        double ab = (double) a / b;
        double ba = (double) b / a;
        return
                (
                        ((a == b) && (V1 <= ac) && (V2 >= ac)) ||
                                ((a == c) && (V1 <= ab) && (V2 >= ab)) ||
                                ((c == b) && (V1 <= ba) && (V2 >= ba))
                );
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(15));
        System.out.println(isGoldenTriangle(3, 3, 5));
        String strfibo = "Числа Фибоначчи - ";
        for (int i = 1; i <= 15; i++)
            strfibo = strfibo + fiboNumber(i) + " ";
        System.out.println(strfibo + "\n");

        for (int i = 1; i <= 100; i++)
            for (int j = 1; j <= 100; j++)
                if (GoldenFibo.isGoldenTriangle(j, j, i))
                    System.out.println("основание - " + i + "   рёбра - " + j);
    }
    }


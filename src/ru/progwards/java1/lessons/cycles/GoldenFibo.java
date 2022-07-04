package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
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
        if (a==b&&a!=c||c==b&&c!=a||a==c&&a!=b) {
        } else if (a/c>=1.61703&&a/c<=1.61903||b/c>=1.61703&&b/c<=1.61903||a/b>=1.61703&&a/b<=1.61903) {
            return true;
        }else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(34, 34, 55));
    }
}

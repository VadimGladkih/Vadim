package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int minSide(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxSide(8, 2, 8));
        System.out.println(minSide(8, 3, 3));
        System.out.println(isEquilateralTriangle(2, 2, 3));
    }
}

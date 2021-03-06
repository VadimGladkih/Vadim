package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if (a * a == ((b * b) + (c * c)) || b * b == ((a * a) + (c * c)) || c * c == ((a * a) + (b * b))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(3, 3, 9));
        System.out.println(isRightTriangle(4, 3, 5));
        System.out.println(isIsoscelesTriangle(2, 2, 2));
    }
}

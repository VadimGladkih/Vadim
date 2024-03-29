package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class IntArrays {
    public static String toString(int[] a) {
        String b = "[";
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                b = b + a[i] + "," + " ";
            }
            if (i == a.length - 1) {
                b += a[i] + "]";
            }
        }
        return b;
    }

    public static boolean equals1(int[] a1, int[] a2) {
        if (a1 == a2) {
            return true;
        }
        for (int i =0; i< a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals2(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {

    }
}

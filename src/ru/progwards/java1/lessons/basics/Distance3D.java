package ru.progwards.java1.lessons.basics;

public class Distance3D {
    static double x1;
    static double x2;
    static double y1;
    static double y2;
    static double z1;
    static double z2;

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(((x2 + x1) * (x2 + x1)) + ((y2 + y1) * (y2 + y1)) + ((y2 + y1) * (y2 + y1)));
    }

    public static void main(String[] args) {
        System.out.println("AB = " + distance(1, 2, 3, 4, 5, 6));
    }
}

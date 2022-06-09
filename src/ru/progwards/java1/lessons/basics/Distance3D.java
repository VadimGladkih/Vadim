package ru.progwards.java1.lessons.basics;

public class Distance3D {
    static double x1;
    static double x2;
    static double y1;
    static double y2;
    static double z1;
    static double z2;

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    public static void main(String[] args) {
        System.out.println("AB = " + distance(x1, y1, z1, x2, y2, z2));
    }
}

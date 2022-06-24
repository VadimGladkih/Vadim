package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static final double pi = 3.14d;
    static final double ERATH_RADIUS = 6371.2;
    static final double MERCURY_RADIUS = 2439.7;
    static final double JUPITER_RADIUS = 71492.0;

    public static Double sphereSquare(Double r) {
        return Double.valueOf(4 * pi * Math.pow(r, 2));
    }

    public static Double earthSquare() {
        return sphereSquare(ERATH_RADIUS);
    }

    public static Double mercurySquare() {
        return sphereSquare(MERCURY_RADIUS);
    }

    public static Double jupiterSquare() {
        return sphereSquare(JUPITER_RADIUS);
    }

    public static Double earthVsMercury() {
        return sphereSquare(ERATH_RADIUS) / sphereSquare(MERCURY_RADIUS);
    }

    public static Double earthVsJupiter() {
        return sphereSquare(ERATH_RADIUS) / sphereSquare(JUPITER_RADIUS);
    }

    static int addAsStrings(int n1, int n2) {
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        String str3 = str1 + str2;
        Integer n3 = Integer.valueOf(str3);
        return n3;
    }


    public static void main(String[] args) {
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();
        short i = (short) 256567.789;
        System.out.println(i);
        System.out.println(addAsStrings(1, 2));
    }
}

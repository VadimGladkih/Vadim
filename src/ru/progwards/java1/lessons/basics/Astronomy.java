package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static final double pi = 3.14d;
    static final double ERATH_RADIUS = 6371.2;
    static final double MERCURY_RADIUS = 2439.7;
    static final double JUPITER_RADIUS = 71492.0;
    public static Double sphereSquare(Double r) {
        return Double.valueOf(4 * pi * Math.pow(r,2));
    }
    public static Double earthSquare(){
        System.out.println(sphereSquare(ERATH_RADIUS));
        return null;
    }
    public static Double mercurySquare(){
        System.out.println(sphereSquare(MERCURY_RADIUS));
        return null;
    }
    public static Double jupiterSquare(){
        System.out.println(sphereSquare(JUPITER_RADIUS));
        return null;
    }
    public static Double earthVsMercury(){
        System.out.println(sphereSquare(ERATH_RADIUS)/sphereSquare(MERCURY_RADIUS));
        return null;
    }
    public static Double earthVsJupiter(){
        System.out.println(sphereSquare(ERATH_RADIUS)/sphereSquare(JUPITER_RADIUS));
        return null;
    }


    public static void main(String[] args) {
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();

    }
}

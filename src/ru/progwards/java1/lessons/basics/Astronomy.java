package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static final double pi = 3.14d;

    public static double sphereSquare(double r) {
        System.out.println("S = " + 4 * pi * Math.pow(r,2));
        return r;
    }

    public static Double earthSquare() {
        System.out.println(sphereSquare(6371.2));
        return null;
    }
    public static Double mercurySquare(){
        System.out.println(sphereSquare(2439.7));
        return null;
    }

    public static void main(String[]args){
        earthSquare();
        mercurySquare();
    }
}

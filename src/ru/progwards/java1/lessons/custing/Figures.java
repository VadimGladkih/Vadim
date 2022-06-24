package ru.progwards.java1.lessons.custing;

public class Figures {
    static final double pi = 3.14;
    public static double circle(double d){
        return 4*pi*Math.pow((d/2),2);
    }
    public static double square(double n){
        return n*n;
    }
    public static Double triangle(double k){
        double p = (k+k+k)/2;
        return Math.sqrt(p*(p-k)*(p-k)*(p-k));
    }
    public static double squareVsTraiange(double p){
        return square()/triangle();
    }

    public static void main(String[] args) {
        System.out.println(circle(10));
        System.out.println(square(10));
        System.out.println(triangle(12));
        System.out.println(squareVsTraiange());
    }
}

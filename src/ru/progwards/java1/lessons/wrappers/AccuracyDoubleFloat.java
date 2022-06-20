package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    static final double pi = 3.14;

    public static Double volumeBallDouble(Double radius) {
        Double d1 = radius;
        return Double.valueOf(4 / 3 * pi * Math.pow(radius, 3));
    }

    public static Float volumeBallFloat(Float radius) {
        return Float.valueOf((float) (4 / 3 * pi * Math.pow(radius, 3)));
    }

    public static Double calculateAccuracy(Double radius) {
        return Double.valueOf(volumeBallDouble(radius) - volumeBallFloat((radius.floatValue())));
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat((float) 6371.2));
        System.out.println(calculateAccuracy(6371.2));
    }
}

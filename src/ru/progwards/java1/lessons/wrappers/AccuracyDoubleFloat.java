package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    static final double pi = 3.14;

    public static Double volumeBallDouble(Double radius) {
        Double d1 = radius;
        return Double.valueOf(4.0 / 3.0 * pi * Math.pow(d1, 3));
    }

    public static Float volumeBallFloat(Float radius) {
        //Float f1 = radius;
        return Float.valueOf((float) (4.0 / 3.0 * pi * Math.pow(radius, 3)));
    }

    public static Double calculateAccuracy(Double radius) {
        return Double.valueOf(volumeBallDouble(radius) - volumeBallFloat((radius.floatValue())));
    }

    public static void main(String[] args) {
        volumeBallDouble(6371.2);
        volumeBallFloat( 6371.2f);
        calculateAccuracy(6371.2);
    }
}

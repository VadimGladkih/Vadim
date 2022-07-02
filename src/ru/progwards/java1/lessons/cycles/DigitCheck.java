package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit) {
        String numberToStr = Integer.toString(number);
        String digitToStr = Integer.toString(digit);
        return numberToStr.contains(digitToStr);

    }

    public static void main(String[] args) {
        System.out.println(containsDigit(80, 0));
    }
}

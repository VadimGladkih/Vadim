package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit) {
        for (digit = 0; digit < number; digit++) {
            System.out.println(true);
        }
        return true;
    }

    public static void main(String[] args) {
        containsDigit(123, 2);
    }
}

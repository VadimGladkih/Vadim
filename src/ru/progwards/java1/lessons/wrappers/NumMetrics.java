package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer sumDigits(Integer number) {
        int a = number % 10;
        number = number / 10;
        int b = number % 10;
        number = number / 10;
        int c = number % 10;
        number = number / 10;
        return a + b + c;
    }
    public static Integer mulDigits(Integer number){
        int a = number % 10;
        number = number / 10;
        int b = number % 10;
        number = number / 10;
        int c = number % 10;
        number = number / 10;
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(mulDigits(423));
    }
}

package ru.progwards.java1.lessons.useclasses;

public class CountTest {
    public static void testInc(int count) {
        Count count1 = new Count();
        while (count1.getCount() < count) {
            count1.inc();
            System.out.print(count1.getCount() + " ");
        }
        if (count > 0)
            System.out.println();
        System.out.println("тест inc окончен");
    }

    public static void testDec(int count) {
        Count count1 = new Count(count);
        while (true) {
            boolean result = count1.dec();
            System.out.print(count1.getCount() + " ");
            if (result) {
                if (count > 0) {
                    System.out.println();
                    System.out.print("count равен 0");
                }
                break;
            }
        }
        System.out.println();
        System.out.println("тест dec окончен");
    }




    public static void main(String[] args) {
       testInc(7);
        testInc(0);
        testInc(-1);
        testDec(9);
    }
}
package ru.progwards.java1.lessons.compare;

public class Divisibility {
    public static void check(int num1, int num2) {
        String res = "Частное от деления " + num1 + " на " + num2 + " равно ";
        if (num2 == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " делится нацело на " + num2);
            }else{
                System.out.println("Остаток от деления " + num1 + " на " + num2 + " равен " + num1 / num2);
            }if (num2!=0){
                System.out.println(res += num1 / num2);
            }
        }
    }


        public static void main (String[]args){
            check(10, 5);
        }
    }
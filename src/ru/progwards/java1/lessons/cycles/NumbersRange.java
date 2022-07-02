package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        long sum =0;
        int i = start;
        for (i=start;i<=finish;i++){
            sum+=i;
        }
        return sum;
    }
    public static long sumOdd(int start, int finish){
        long sum = 0;
        int i = start;
        for (i=start;i<=finish;i++){
            if (i%2==0) {
                sum += i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumNumbers(11,0));
        System.out.println(sumOdd(11,18));
    }


}

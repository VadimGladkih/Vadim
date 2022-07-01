package ru.progwards.java1.lessons.custing;

public class AccuracyDoubleFloat {
    public static double calculateAccuracy(){
       double d = 1.0/3.0;
       float f = (float)d;
       return d-f;
    }
    static long factorial(long n){
        long result = 1;
        for (long i = 1l;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy());
        System.out.println(factorial(25));
    }
}

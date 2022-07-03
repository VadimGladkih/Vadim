package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    public static int fiboNumber(int n) {
        int sum =0;
        int n1=1;
        int n2=1;
        for (int i =3;i<=n;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        return sum;
    }
    public static boolean isGoldenTriangle(int a, int b, int c){
        if (a==b&&b==c&&c==a){
        } if (a/b>=1.61703&&a/b<=1.61903&&b/c>=1.61703&&b/c<=1.61903&&a/c>=1.61703&&a/c<=1.61903) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(12,13,12));
    }
}

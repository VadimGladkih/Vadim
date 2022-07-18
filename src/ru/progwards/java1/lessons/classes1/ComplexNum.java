package ru.progwards.java1.lessons.classes1;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        String a = Integer.toString(this.a);
        String b = Integer.toString(this.b);
        return a+"+"+b+"i";
    }
    int c;
    int d;
    public ComplexNum num(int c , int b){
        this.c = c;
        this.b = b;
        return null;
    }
    public ComplexNum add(ComplexNum num){
       // return (a+"+"+b+"i")+(c+"+"+d+"i")=(a+"+"+c)+(b+ "+" + d)+"i";
    return null;
    }


    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(1,56);
        //ComplexNum num2 = new ComplexNum(num(1,36));
        System.out.println(num1.toString());
    }
}

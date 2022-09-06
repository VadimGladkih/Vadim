package ru.progwards.java1.lessons.classes1;

public class ComplexNum {
    private int a;
    private int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String toString() {
        Integer a = Integer.valueOf(Integer.toString(this.a));
        Integer b = Integer.valueOf(Integer.toString(this.b));
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(a + num.getA(), b + num.getB());
    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(a - num.getA(), b - num.getB());
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum(a * num.getA(), b * num.getB());
    }
    public ComplexNum div(ComplexNum num){
        return new ComplexNum(a / num.getA(), b / num.getB());
    }

    public static void main(String[] args) {
        ComplexNum n1 = new ComplexNum(1, 56);
        System.out.println(n1.toString());
    }
}
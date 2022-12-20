package ru.progwards.java1.lessons.useclasses;

public class ComplexNum {
    private final int a;
    private final int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        Integer.toString(a, b);
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(this.a + num.a, this.b + num.b);
    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(this.a - num.a, this.b - num.b);
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum((this.a * num.a) - (this.b * num.b), (this.b * num.a) + (this.a * num.b));
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum((this.a * num.a + this.b * num.b) / (num.a * num.a + num.b * num.b), (this.b * num.a - this.a * num.b) / (num.a * num.a + num.b * num.b));
    }

    public static void main(String[] args) {
        ComplexNum n1 = new ComplexNum(1, 56);
        System.out.println(n1.toString());
        System.out.println(new ComplexNum(1, 2).mul(new ComplexNum(99, 98)).toString());
        System.out.println(new ComplexNum(1000, 1000).div(new ComplexNum(100, 100)).toString());
    }
}
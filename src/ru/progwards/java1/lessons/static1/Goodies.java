package ru.progwards.java1.lessons.static1;

public class Goodies {
    static String goodies;
    static String child;

    public static void printPresent() {
        System.out.println(Goodies.child + " дали " + Goodies.goodies);
    }

    public static void masha() {
        Goodies.child = "Маше";
    }

    public static void cookie() {
        Goodies.goodies = "печеньку";
    }

    public static void setChild(String child) {
        Goodies.masha();
    }

    public static void setGoodies(String goodies) {
        Goodies.cookie();
    }

    public static void printPresents() {
        masha();
        printPresent();
        setGoodies(goodies);
        Goodies.goodies = "леденец";
        printPresent();
        cookie();
        printPresent();
        setChild(child);
        Goodies.child = "Пете";
        printPresent();
    }
    public static void main(String[]args){
        printPresents();
    }
}

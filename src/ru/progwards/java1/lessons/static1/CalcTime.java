package ru.progwards.java1.lessons.static1;

public class CalcTime {
    static double distance;
    static double speed;
    static String cityFrom;
    static String cityTo;

    public static void printTime() {
        System.out.println("Если ехать из " + cityFrom + " в " + cityTo + " со скоростью " + speed + " км/ч, то " + distance + " км проедем за " + distance / speed + " часов.");
    }

    public static void MoscowToPiter() {
        distance = 712d;
        speed = 80d;
        cityFrom = "Москва";
        cityTo = "Питер";
    }

    public static void LissabonToVladivostok() {
        distance = 13090d;
        speed = 75d;
        cityFrom = "Лиссабон";
        cityTo = "Владивосток";
    }

    public static void MurmanskToAlmata() {
        distance = 5413d;
        speed = 60d;
        cityFrom = "Мурманск";
        cityTo = "Алмата";
    }

    public static void printTimes() {
        MoscowToPiter();
        printTime();
        LissabonToVladivostok();
        printTime();
        MurmanskToAlmata();
        printTime();
    }

    public static void main(String[] args) {
        printTimes();
    }
}
class Goodies{
    static String goodies;
    static  String child;
    public static void printPresent(){
        System.out.println(child + " дали " + goodies);
    }
    public static void masha(){
        child = "Маше";
    }
    public static void cookie(){
        goodies = "печеньку";
    }
    public static void setChild(String child) {
        {
            masha();
        }
    }
    public static void setGoodies(String goodies){
        {
           cookie();
        }
    }
    public static void printPresents(){
        masha();
        printPresent();
        setGoodies (goodies);
        goodies = "леденец";
        printPresent();
        cookie();
        printPresent();
        setChild(child);
        child = "Пете";
        printPresent();
    }
    public static void main(String[]args){
        printPresents();
    }
}
class Room{
    static double length1 = 5d;
    static  double width1 = 3d;
    static double length2 = length1 + 1.5d;
    static double width2 = width1 * 1.5d;
    static double square1 = square(length1,width1);
    static double square2 = square(length2,width2);
    public static double square(double length, double width){
        double result = length * width;
        return result;
    }
    public static void printRoom(String name, double square){
        System.out.println("Площадь " + name + " составляет " + square + " м2");
    }
    public static void printFlat(){
        printRoom("кухни",square1);
        printRoom("гостинной",square2);
    }
    public static void main(String[]args){
        printFlat();
    }
}

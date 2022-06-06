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
            child = null;
        }
    }
    public static void setGoodies(String goodies){
        {
            goodies = null;
        }
    }
    public static void printPresents(){
        masha();
        printPresent();
        goodies = "леденец";
        setGoodies (goodies);
        printPresent();
        cookie();
        printPresent();
        child = "Пете";
        setChild(child);
        printPresent();
    }
    public static void main(String[]args){
        printPresents();
    }
}

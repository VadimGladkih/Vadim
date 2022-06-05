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
        printTime();
    }

    public static void LissabonToVladivostok() {
        distance = 13090d;
        speed = 75d;
        cityFrom = "Лиссабон";
        cityTo = "Владивосток";
        printTime();
    }

    public static void MurmanskToAlmata() {
        distance = 5413d;
        speed = 60d;
        cityFrom = "Мурманск";
        cityTo = "Алмата";
        printTime();
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
        MoscowToPiter();
        LissabonToVladivostok();
        MurmanskToAlmata();
        printTimes();
    }
}
class Goodies{

}

package ru.progwards.java1.lessons.classescompare;

public class TimeZone {
    int hours;
    int minutes;

    public TimeZone(int hours){
        this.hours = hours;
        int minutes = 0;
    }
    public TimeZone(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public TimeZone getTimeZone(int hours, int minutes){
        return null;
    }

    public static void main(String[] args) {
        TimeZone zone1 = new TimeZone(-3,15);
        System.out.println(zone1.getTimeZone(zone1.hours, zone1.minutes));
    }
}
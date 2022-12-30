package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }

    //@Override
    public TimeZone getTimeZone() {
        return zone;
    }

    @Override
    public int secondsBetween(Time time) {
        TimeZone k1 = this.getTimeZone();
        TimeZone k2 = this.getTimeZone();
        int sdvigk1, sdvigk2;

        if (k1 == null)
            sdvigk1 = 0;
        else
            sdvigk1 = Math.abs(k1.hours * 60 * 60 + k1.minutes * 60);
        if (k2 == null)
            sdvigk2 = 0;
        else
            sdvigk2 = Math.abs(k2.hours * 60 * 60 + k2.minutes * 60);
        return super.secondsBetween(time) + Math.abs(sdvigk1 - sdvigk2);
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(16, 10, 42, new TimeZone(3));
        ZonedTime zt2 = new ZonedTime(18, 7, 15, new TimeZone(2));
        System.out.println(zt1.secondsBetween(zt2));
        ZonedTime zt3 = new ZonedTime(7, 58, 8, new TimeZone(0, 42));
        System.out.println(zt3.secondsBetween(zt1));
    }
}

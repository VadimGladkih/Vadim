package ru.progwards.java1.lessons.inheritance;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString() {
        String hours = Integer.toString(this.hours);
        String minutes = Integer.toString(this.minutes);
        String seconds = Integer.toString(this.seconds);
        if (this.hours < 10) {
            hours = "0" + this.hours;
        }
        if (this.minutes < 10) {
            minutes = "0" + this.minutes;
        }
        if (this.seconds < 10) {
            seconds = "0" + this.seconds;
        }

        return hours + ":" + minutes + ":" + seconds;
    }

    public int toSeconds() {
        return (this.hours * 60 * 60) + (this.minutes * 60) + this.seconds;
    }

    public int secondsBetween(Time time) {
        return Math.abs(this.hours * 60 * 60 + this.minutes * 60 + this.seconds - time.toSeconds());
    }

    public static void main(String[] args) {
        Time t1 = new Time(3, 35, 6);
        System.out.println(t1);
        Time t2 = new Time(4, 55, 6);
        System.out.println(t1.secondsBetween(t2));
    }
}

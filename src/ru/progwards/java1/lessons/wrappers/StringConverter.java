package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number){
        String b1 = Byte.toString(number);
        System.out.println(b1);
        return b1;
    }
    public static String fromShort(short number){
        String s1 = Short.toString(number);
        System.out.println(s1);
        return s1;
    }
    public static String fromInt(int number){
        String i1 = Integer.toString(number);
        System.out.println(i1);
        return i1;
    }
    public static String fromLong(long number){
        String l1 = Long.toString(number);
        System.out.println(l1);
        return l1;
    }
    public static String fromFloat(float number){
        String f1 = Float.toString(number);
        System.out.println(f1);
        return f1;
    }
    public static String fromDouble(double number){
        String d1 = Double.toString(number);
        System.out.println(d1);
        return d1;
    }

    public static void main(String[] args) {
        fromByte((byte) 8);
        fromShort((short)123);
        fromInt(1215);
        fromLong(13516153135135L);
        fromFloat(2154);
        fromDouble(351.0);
    }

}
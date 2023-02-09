package ru.progwards.java1.lessons.arrays2;

public class IntArrays {
    public static String toString(int []a){
        String b = "[";
        for (int i = 0; i< a.length; i++){
            if (i< a.length -1){
                b = b + a[i] + "," + " ";
            }
        }
        return b;
    }

    public static void main(String[] args) {

    }
}

package Base1;

import java.util.Objects;

public class Base1{
    public static void printJava(){
        String a = "Хорошо идут дела";
        String b = "Изучаю Java я!";
        String c = " ";
        System.out.println(a);
        System.out.println(b);
        System.out.print(a);
        System.out.print(c);
        System.out.println(b);
        System.out.print(b);
        System.out.print(c);
        System.out.println(a);
    }
    public static void printJava(String java1, String java2){
        System.out.println(java1);
        System.out.print(java2);
        System.out.println("!");
        System.out.print(java1);
        System.out.print(", ");
        System.out.print(java2);
        System.out.println("!");
        System.out.print(java2);
        System.out.print(", ");
        System.out.print(java1);
        System.out.println("!");
    }
    public static String plusJava(String message) {
        String result = "Java - " + message + " язык программирования";
        return result;
    }


    public static void main(String[]args){
        printJava();
        printJava("Чтобы Java понимать", "Надо функции писать");
        printJava("Буду,буду программистом", "Код пишу я чисто, чисто");
        String str = plusJava("самый востребованный");
        System.out.println(str);
        String s = plusJava("объектно-ориентированный");
        System.out.println(s);
        System.out.println(plusJava("очень интересный"));

    }
}
package lesson6HW;

public class Variables {
    static int sum = 0;

    public static void increment(int n) {
        sum = sum + n;
    }

    public static void decrement(int n) {
        sum = sum - n;
    }

    public static void printSum() {
        System.out.println("sum = " + sum);
    }

    public static void calculation() {
        increment(12);
        printSum();
        decrement(8);
        printSum();
        increment(-7);
        printSum();
    }
    public static void roomParameters(String room, int length, int width){
            int floor = length*width;
            int perimeter = (length + width)*2;
            int height = 3;
            int walls = height * perimeter;
            System.out.println("Комната "+room+", нужно линолеума "+floor+" м2, обоев  "+walls+" м2, при высоте потолков "+height+" м");
    }
    public static void apartment(){
            roomParameters("гостинная",4,5);
            roomParameters("кухня",3,3);
            roomParameters("спальня",3,4);
            roomParameters("прихожая",2,2);
    }
    public static String getFirst(){
        String result = "Не тот велик, ";
        return result;
    }
    public static String getSecond(){
        String result = "кто никогда не падал, ";
        return result;
    }
    public static String getThird(){
        String result = "а тот велик — ";
        return result;
    }
    public static String getForth(){
        String result = "кто падал и вставал!. ";
        return result;
    }
    public static String getFifth(){
        String result = "Конфуций";
        return result;
    }
    public static void printText(){
        String text;
        text = getFirst();
        System.out.println(text);
        text = text + getSecond();
        System.out.println(text);
        String text2;
        text2 = getThird() + getForth();
        System.out.println(text2);
        System.out.println(getFifth());
        System.out.print(text+text2+getFifth());
    }
    public static void main(String[]args) {
        calculation();
        apartment();
        printText();
    }
}
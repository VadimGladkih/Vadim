package ru.progwards.java1.lessons.classes1;

public class Count {
    static int count = 0;

    public Count(int count) {
        this.count = count;
    }
    public int getCount(){
        System.out.println(count);
        return count;
    }
    public void inc(){
        System.out.println(count++);
    }
    public boolean dec(){
        System.out.println(count--);
        if (count<=0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        return true;
    }
    public static void main(String[] args) {
        Count Count1 = new Count(10);
    }
}
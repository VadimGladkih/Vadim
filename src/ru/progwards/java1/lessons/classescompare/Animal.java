package ru.progwards.java1.lessons.classescompare;

/*public abstract class Animal {
    String name;
    Double weight;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String kind();

    public abstract String say();

    public String toString() {
        return "Это " + kind()+ " " + name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    int compareTo(Animal animal){
        if (this.weight == animal.weight){
            return 0;
        }if (this.weight > animal.weight) {
            return 1;
        }else {
            return -1;
        }

    }
    public boolean equals(Object o) {
        return (this.name.equals(o))&&(this.kind().equals(o))&&(this.weight.equals(o));
    }
    enum FoodKind{
        HAY,
        CORN,
    }
    abstract public FoodKind getFoodKind();
    abstract public double getFoodCoeff();
    public double calculateFoodWeight(){
        return weight * getFoodCoeff();
    }
    public double calculateFoodPrice(){
       // int price;
       if (getFoodKind() ==FoodKind.HAY){
           return calculateFoodWeight() * 2;
       }else{
           return calculateFoodWeight() * 15;
       }
    }

    public static void main(String[] args) {

    }
}*/
public abstract class Animal {
    String name;
    double weight;
    enum FoodKind{
        HAY,
        CORN,
    }
    public Animal(String name){
        this.name = name;
    }

    public Animal() {
        say().toString();
    }

    public abstract String kind();
    public abstract String say();
    public String toString(){
        return "Это " + kind() + " " + name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    int compareTo(Animal animal){
        if(this.weight == animal.weight) {
            return 0;
        }
        if(this.weight > animal.weight){
            return 1;
        }
        else{
            return -1;
        }
    }
    public boolean equals(Animal o){

        return  (this.name.equals(o.name))
                && (this.kind().equals(o.kind()))
                && (this.weight == o.weight);
    }
    abstract public FoodKind getFoodKind();
    abstract public double getFoodCoeff();
    public double calculateFoodWeight(){
        return weight * getFoodCoeff();
    }
    public double calculateFoodPrice(){
        int price;
        if(getFoodKind() == FoodKind.HAY){
            price = 2;
        }
        else {
            price = 15;
        }
        return calculateFoodWeight() * price;
    }
    public static void main(String[] args) {

    }
}

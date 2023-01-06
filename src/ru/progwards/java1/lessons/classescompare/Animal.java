package ru.progwards.java1.lessons.classescompare;

public abstract class Animal {
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
        return this.weight;
    }
    int compareTo(Animal animal){
        return weight.compareTo(weight);
    }
    public boolean equals(Object o){
        name.equals(name);
        kind().equals(kind());
        weight.equals(weight);
        return true;
    }
}
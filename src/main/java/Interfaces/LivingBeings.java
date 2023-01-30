package Interfaces;

public abstract class LivingBeings {
    public int age;
    public int weight;
    public String color;


    public LivingBeings(int age, int weight, String color) {
       this.age = age;
       this.weight = weight;
       this.color = color;
    }

    public String breath() {
        return "Yes, I can breath!";
    }

    public void eatStuff(){}
}

package Interfaces;

public class Dog extends Animals implements CanCommunicate  {
    private double height;
    public Dog(int age, int weight, String color, int numberOfLegs, boolean hasATail, boolean hasFur, double height) {
        super(age, weight, color, numberOfLegs, hasATail, hasFur);   }


    public static void bark() {
        System.out.println("Hi, I am a dog. Gaff!");
    }

    @Override
    public void sing() {

    }

    @Override
    public void buzz() {

    }

    public void getInfo(){
        if (hasFur == true) {
            System.out.println("This dog has fur");
        }
    };

}

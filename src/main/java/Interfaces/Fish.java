package Interfaces;

public class Fish extends Animals implements CanSwim  {
    private double length;

    public Fish(int age, int weight, String color, int numberOfLegs, boolean hasATail, boolean hasFur, double length) {
        super(age, weight, color, numberOfLegs, hasATail, hasFur);   }

    @Override
    public void CanScubadive() {
        System.out.println("Fish can dive");

    }

    @Override
    public void FloatOnTheSurface() {

    }
}

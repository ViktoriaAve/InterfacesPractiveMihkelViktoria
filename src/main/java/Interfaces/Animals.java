package Interfaces;

public class Animals extends LivingBeings {
    public int numberOfLegs;
    private boolean hasATail;
    boolean hasFur;


    public Animals(int age, int weight, String color, int numberOfLegs, boolean hasATail, boolean hasFur) {
        super(age, weight, color);
    }

    public void canMove() {}
}

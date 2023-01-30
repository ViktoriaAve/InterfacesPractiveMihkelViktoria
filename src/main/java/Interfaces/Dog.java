package Interfaces;

public abstract class Crocodile extends Animal implements CanCommunicate, CanSwim, CanWalk  {

public Crocodile(int legs, int wings, boolean breath, String color) {
    super(legs, wings, breath, color);
}

    @Override
    public void bark() {
        System.out.println("GAF GAF!!!!!!!");
    }

    @Override
    public void CanScubadive() {
        System.out.println("Can dive deep into the water");
    }

    @Override
    public void canWalkOnTwoLegs() {
        System.out.println("Can walk fast");

    }
}

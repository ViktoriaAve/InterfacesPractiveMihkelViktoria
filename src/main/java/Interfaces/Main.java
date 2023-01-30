package Interfaces;

public class Main {
    public static void main(String[] args) {
        Dog dog_1 = new Dog(4, 10, "brown", 4, true, true, 0.35);
        Fish fish1 = new Fish(300, 700, "golden", 0, true, false, 50);
        Bird bird1 = new Bird(3, 1, "green", 2, false, false, 2);

        dog_1.breath();
        dog_1.bark();

        fish1.CanScubadive();

        dog_1.eatStuff();

        System.out.println(bird1.canFly());
        dog_1.getInfo();

    }
}

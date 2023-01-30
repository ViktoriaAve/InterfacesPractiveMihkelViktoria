package Interfaces;


public class Bird extends Animals {
    public int numberOfWings;

    public Bird(int age, int weight, String color, int numberOfLegs, boolean hasATail, boolean hasFur, int numberOfWings) {
        super(age, weight, color, numberOfLegs, hasATail, hasFur);

    }

     String canFly() {
        if (numberOfWings == 2) {
          return "This bird can fly";
        } else {
            return "This bird can't fly";
        }
    }
    }


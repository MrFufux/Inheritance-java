package Runner;

import Classes.Bicycle;
import Classes.Subclasses.MountainBicycle;


public class Runner {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();

        System.out.println("Welcome to this software. \n");

        //bicycle
        System.out.println("The brand is: " + myBicycle.getBrand());
        myBicycle.setBrand("Specialized");
        System.out.println("The brand of my bicycle is: " + myBicycle.getBrand());

        System.out.println("Initial velocity: " + myBicycle.getVelocity());

        myBicycle.pedal(5);
        myBicycle.pedal(8);
        System.out.println("Current Velocity: " + myBicycle.getVelocity());

        myBicycle.setColor("Dark Blue");
        System.out.println("The color of my bicycle is: " + myBicycle.getColor());

        myBicycle.brake(15);
        System.out.println("The velocity of my bicycle is: " + myBicycle.getVelocity());

        System.out.println("-------------------------------------------------------------");

        MountainBicycle myMountainBike = new MountainBicycle();
        System.out.println("The brand of my bicycle is: " + myMountainBike.getBrand() +
                " in " + myMountainBike.getColor() + " color" +
                ", with a velocity of " + myMountainBike.getVelocity() +
                " and is in the cambio " + myMountainBike.getCambio());

        System.out.println("-------------------------------------------------------------");

        myMountainBike.setBrand("Corleone");
        myMountainBike.setColor("Red");
        myMountainBike.cambioUp();
        myMountainBike.cambioUp();
        myMountainBike.cambioDown();
        myMountainBike.pedal(5);
        myMountainBike.pedal(5);

        System.out.println("The brand of my bicycle is: " + myMountainBike.getBrand() +
                " in " + myMountainBike.getColor() + " color" +
                ", with a velocity of " + myMountainBike.getVelocity() +
                " and is in the cambio " + myMountainBike.getCambio());


    }
}

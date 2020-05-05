package caveofprogramming.abstractclasses;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Starting the car.");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff in car.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut the car down.");
    }
}

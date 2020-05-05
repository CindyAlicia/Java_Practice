package caveofprogramming.abstractclasses;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Starting the camera.");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff with camera.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut the camera off.");
    }
}

package caveofprogramming.methodparameters;

public class Main {
    public static void main(String[] args) {
        Cyborg noodle = new Cyborg();

        noodle.speak("Hi, I'm Noodle.");
        noodle.jump(7);
        noodle.move("West", 12.2);

        String greeting = "Hello there!";
        noodle.speak(greeting);

        int value = 14;
        noodle.jump(value);
    }
}

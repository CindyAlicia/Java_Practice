package caveofprogramming.staticvariablesandmethods;

public class Thing {
    public final static int LUCKY_NUMBER = 7;

    public String name;

    public static String description;

    public static int count = 0;

    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println("Hello");
        // Won't work: System.out.println(name);
    }
}

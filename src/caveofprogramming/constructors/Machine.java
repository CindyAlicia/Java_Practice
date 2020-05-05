package caveofprogramming.constructors;

public class Machine {
    private String name;
    private int code;

    public Machine() {
        this("Arnie", 1);
        System.out.println("First constructor running!");
    }

    public Machine(String name) {
        this(name, 2);
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running!");
        this.name = name;
        this.code = code;
    }
}

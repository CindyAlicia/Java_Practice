package caveofprogramming.encapsulationandtheapidocs;

class Plant {

    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "Some stuff" + calculateGrowthforecast();
        return data;
    }

    private int calculateGrowthforecast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

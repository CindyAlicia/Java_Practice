package caveofprogramming.gettersandreturnvalues;

public class Main {
    public static void main(String[] args) {
        HumanBeing humanb1 = new HumanBeing();

        humanb1.name = "Louis";
        humanb1.age = 24;

        //humanb1.speak();

        int age = humanb1.getAge();
        String name = humanb1.getName();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        int years = humanb1.calculateYearsTillRetirement();

        System.out.println("Years till retirement " + years + " years");
    }
}

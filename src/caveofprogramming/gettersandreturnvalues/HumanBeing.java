package caveofprogramming.gettersandreturnvalues;

public class HumanBeing {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name + ".");
    }

    int calculateYearsTillRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName(){
        return name;
    }
}

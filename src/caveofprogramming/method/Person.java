package caveofprogramming.method;

public class Person {
    //Instance variables (data or "state")
    String name;
    int age;

    //Classes can contain

    //1. Data
    //2. Subroutines (methods)
    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void sayHello() {
        System.out.println(name + ": " + "Hello there!");
    }
}

package caveofprogramming.equals;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(new Object());

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");
        Person person3 = new Person(8, "Sue");

        System.out.println(person2.equals(person3));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1.equals(value2));

        int number1 = 7;
        int number2 = 7;

        System.out.println(number1 == number2);

        String text1 = "Hello";
        String text2 = "Hellogdr".substring(0, 5);

        System.out.println(text2);

        System.out.println(text1 == text2);
    }
}

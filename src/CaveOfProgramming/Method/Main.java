package CaveOfProgramming.Method;

public class Main {
    public static void main(String[] args) {

        //Create a Human object using the Human class
        Person person1 = new Person();
        person1.name = "Tobias Forge";
        person1.age = 39;
        person1.speak();

        //Create a second Human object
        Person person2 = new Person();
        person2.name = "Boel Forge";
        person2.age = 38;
        person2.speak();

        System.out.println("Hello " + person1.name + " and " + person2.name);

        person1.sayHello();
        person2.sayHello();
    }
}

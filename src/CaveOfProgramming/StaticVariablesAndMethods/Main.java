package CaveOfProgramming.StaticVariablesAndMethods;

public class Main {
    public static void main(String[] args) {

        Thing.description = "I am a thing";

        System.out.println(Thing.description);

        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println("After creating objects, count is: " + Thing.count);

        //System.out.println(thing1.name);
        //System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);
    }
}

package caveofprogramming.settersandthis;

public class Main {
    public static void main(String[] args) {
        Frog frog1 = new Frog();

        //frog1.name = "Bertie";
        //frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(1);
        frog1.setInfo("Bertie", 1);

        System.out.println(frog1.getName() + " " + frog1.getAge());
    }
}

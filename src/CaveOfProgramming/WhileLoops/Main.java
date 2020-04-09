package CaveOfProgramming.WhileLoops;

public class Main {
    public static void main(String[] args) {

        int value = 10;
        boolean check = 4 < 5;
        boolean loop = value < 20;

        System.out.println("Is value: 10 smaller than 20? " + loop + "\n" + "Check if 4 < 5 " + check);

        int valueN = 0;

        while (valueN < 5) {
            System.out.println("Hello " + valueN);

            valueN = valueN + 1;
        }
    }
}

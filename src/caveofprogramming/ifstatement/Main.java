package caveofprogramming.ifstatement;

public class Main {
    public static void main(String[] args) {

        boolean cond = 6 != 9;

        int myInt = 15;

        if (myInt < 10) {
            System.out.println("Yes, it's true!");
        } else if (myInt > 20) {
            System.out.println("Yes, it's true!");
        } else {
            System.out.println("No, it's false!");
        }

        int loop = 0;

        while (true) {
            System.out.println("Looping: " + loop);

            if (loop == 5) {
                break;
            }

            loop++;

            System.out.println("Running");
        }
        System.out.println("Finished");
    }
}

package caveofprogramming.multipleexceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
        */
        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

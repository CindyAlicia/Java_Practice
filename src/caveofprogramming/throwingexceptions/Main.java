package caveofprogramming.throwingexceptions;

import java.io.IOException;
import java.rmi.ServerException;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();

        try {
            test.run();
        } catch (ServerException e) {
            System.out.println(e.getMessage());
        }
    }
}

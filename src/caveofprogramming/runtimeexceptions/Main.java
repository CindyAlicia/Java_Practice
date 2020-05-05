package caveofprogramming.runtimeexceptions;

public class Main {
    public static void main(String[] args) {
        /*

        // Arithmetic exception because of the divide by 0
        int value = 7;

        value = value/0;

        // Null pointer exception
        String text = null;

        System.out.println(text.length());
        */

        // Out of bounds exception
        String[] texts = {"one", "two", "three"};

        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}

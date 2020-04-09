package CaveOfProgramming.ArraysOfStrings;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "kiwi", "pear"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Default value, it works because an int is a primitive type
        //You know it is a primitive type because it got a lower case letter at the start
        int value = 0;

        //String is a non primitive type, it's a class, and the giveaway is the capital letter
        String text = null;

        System.out.println(text);

        String[] texts = new String[2];

        System.out.println(texts[0]);

        texts[0] = "one";

        System.out.println(texts[0]);
    }
}

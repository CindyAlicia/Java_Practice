package caveofprogramming.trywithresources;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Temp temp = new Temp()) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        Temp temp = new Temp();

        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}

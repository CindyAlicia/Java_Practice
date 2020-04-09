package CaveOfProgramming.toString;

public class Cow {
    private String name;
    private int id;

    public Cow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        return String.format("%4d: %s", id, name);
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
        */
    }
}

package caveofprogramming.throwingexceptions;

public class ServerException extends Exception {

    public ServerException() {

    }

    public ServerException(String message) {
        super(message);
    }
}

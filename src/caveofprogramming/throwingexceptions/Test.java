package caveofprogramming.throwingexceptions;

import java.io.IOException;
import java.rmi.ServerException;

public class Test {

    public void run() throws ServerException {

        // Some kind of return value from some complex progress!
        // 0 = success
        // anything else = error code
        int code = 1;

        if(code != 0 ) {
            // Something's wrong!
            // throw new IOException("Could not connect to server.");
            throw new ServerException("Could not connect to server.");
        }

        System.out.println("Running successfully.");
    }
}

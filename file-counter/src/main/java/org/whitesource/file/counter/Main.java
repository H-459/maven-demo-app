package org.whitesource.file.counter;

import java.io.IOException;

/**
 * @author tom.shapira
 */
public class Main {

    public static void main(String[] args) throws IOException {
        printHelloWorld();

//        new ExtensionFileCounter().countFilesInDirectoryByExtension(args[0], args[1]);
    }

    /**
     * Simply print out "Hello World!"
     */
    private static void printHelloWorld() {
        System.out.println("Hello World!");
    }

}

package kz.mun.se.eckel.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new File("files/test4.txt"));
        printStream.println("Hello");
        printStream.println("PrintStreamTest");
    }
}

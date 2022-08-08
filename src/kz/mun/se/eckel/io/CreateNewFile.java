package kz.mun.se.eckel.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("files/test3.txt");
        FileOutputStream outputStream = new FileOutputStream(file, true);
        String greetings = "Hello Amigo\n";
        outputStream.write(greetings.getBytes());
        outputStream.close();
    }
}

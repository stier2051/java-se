package kz.mun.se.eckel.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileTest {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream;
        FileOutputStream outputStream;
        try {
            inputStream = new FileInputStream("files/test1.txt");
            outputStream = new FileOutputStream("files/test2.txt");
            byte[] buffer = new byte[1000];
            while (inputStream.available() > 0) {
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

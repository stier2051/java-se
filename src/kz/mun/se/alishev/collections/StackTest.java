package kz.mun.se.alishev.collections;

import java.io.*;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) throws IOException {
        String s = "Info about Leela <span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela " +
                "</span></b></span><span>Super</span><span>girl</span>";
        StringReader reader = new StringReader(s);
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            if (i == 60) {
                sb.append((char) i);
                if (i == 32 || i == 62) System.out.println(sb);
            }
        }
    }
}

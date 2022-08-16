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
        String tag = "";
        boolean tagIsFound = false;
        while ((i = reader.read()) != -1) {
            if (i == 60) {
                sb.append((char)i);
                while ((i = reader.read()) != -1) {
                    if (i == 32 || i == 62) {
                        tag = sb.toString();
                        tagIsFound = true;
                        sb.setLength(0);
                        break;
                    } else sb.append((char)i);
                }
                if (tagIsFound) break;
            }
        }
        while ((i = reader.read()) != -1) {
            if (i == 60) {
                sb.append((char)i);
                while ((i = reader.read()) != -1) {
                    if (i == 32 || i == 62 && isOpen(sb.toString())) sb.append((char)i);
                    
                }

            }
        }
    }

    public static boolean isOpen(String tag) {
        return tag.equals("<" + tag.substring(1)) && !tag.equals("</" + tag.substring(2));
    }

    public static boolean isPair(String openTag, String closeTage) {
        return openTag.equals("<" + openTag) && closeTage.equals("</" + closeTage);
    }
}

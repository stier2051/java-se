package kz.mun.se.string;

import kz.mun.se.eckel.swing.MainFrame;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String str = "КН-3890/02/0/";
//        StringBuilder result = new StringBuilder();
//        char[] charArray = str.toCharArray();
//
//        for (char c : charArray) {
//            if (c == 057) {
//                result.append(URLEncoder.encode("/", "Windows-1251"));
//            } else {
//                result.append(c);
//            }
//
//        }
//        System.out.println(result);
//
//        String str1 = null;
//        if ("YES".equals(str1)) {
//            System.out.println("hallo");
//        } else {
//            System.out.println("good");
//        }

        String str = "hello";
        String str2 = "hello";

        if (str == str2) {
            System.out.println("ok");
        }

        String str3 = new String("hello");

        if (str.equals(str3)) {
            System.out.println("ok");
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("jf", 1);

    }
}

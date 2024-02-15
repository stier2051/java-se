package kz.mun.se.effective_java.object_methods.equals;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s));//true
        System.out.println(s.equals(cis));//false

//        System.out.println(s instanceof CaseInsensitiveString);

        /*
        Как и ожидалось, cis.equals(s) возвращает значение true.
        Проблема заключается в том, что, хотя метод equals в CaselnsensitiveString знает
        об обычных строках, метод equals в String забывает о строках, нечувствительных к регистру.
        Таким образом, s.equals(cis) возвращает значение false,
        что является явным нарушением симметрии.
         */

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.ORANGE);

        System.out.println("===========");
        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));

        System.out.println("===========");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));

    }
}

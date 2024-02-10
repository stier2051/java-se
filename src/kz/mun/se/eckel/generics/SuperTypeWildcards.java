package kz.mun.se.eckel.generics;

import java.util.List;

public class SuperTypeWildcards {
    static void writTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
    }
}

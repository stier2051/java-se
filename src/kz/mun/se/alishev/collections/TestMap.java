package kz.mun.se.alishev.collections;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("Казахстан", new ArrayList<>(Arrays.asList("Алматы", "Талдыкорган", "Павлодар", "Оскемен", "Семей")));
        map.put("Германия", new ArrayList<>(Arrays.asList("Берлин", "Бонн", "Коттбус", "Франкфурт на Майне", "Дюсельдорф")));

        System.out.println(map);
        System.out.println(map.get("Казахстан"));
    }
}

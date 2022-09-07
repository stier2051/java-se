package kz.mun.se.alishev.collections;

import java.util.*;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
//        Map<String, List<String>> map = new HashMap<>();
//        map.put("Казахстан", new ArrayList<>(Arrays.asList("Алматы", "Талдыкорган", "Павлодар", "Оскемен", "Семей")));
//        map.put("Германия", new ArrayList<>(Arrays.asList("Берлин", "Бонн", "Коттбус", "Франкфурт на Майне", "Дюсельдорф")));
//
//        System.out.println(map);
//        System.out.println(map.get("Казахстан"));

        Map<String, String> names = new HashMap<>();
        names.put("NUMBER1", "John");
        names.put("NUMBER2", "Sarah");

        Map<String, String> namesModify =
                names.entrySet().stream().collect(Collectors.toMap(s -> s.getKey().toLowerCase(), s -> s.getValue()));

        namesModify.entrySet().stream().forEach(System.out::println);
    }
}

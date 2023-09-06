package kz.mun.se.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.get("type"));
        System.out.println(map.containsKey("type"));
    }
}

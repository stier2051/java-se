package kz.mun.se.alishev.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

//        measureTimeAddElements(linkedList);
//        measureTimeAddElements(arrayList);

//        measureTimeReadElements(linkedList);
//        measureTimeReadElements(arrayList);

//        measureTimeAddElementToHead(linkedList);
//        measureTimeAddElementToHead(arrayList);
    }

    /**
     * добавляем элементы в лист
     * @param list
     */
    private static void measureTimeAddElements(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * считываем элементы из массива
     * @param list
     */
    private static void measureTimeReadElements(List<Integer> list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * добавляем элемент в начало массива (index 0)
     * @param list
     */
    private static void measureTimeAddElementToHead(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

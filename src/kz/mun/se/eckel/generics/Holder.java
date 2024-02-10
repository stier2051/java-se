package kz.mun.se.eckel.generics;

import java.util.Objects;

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.getValue();
        apple.setValue(d);
//        Holder<Fruit> fruit = apple; //не может выполнить восходящее преобразование
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.getValue();
        d = (Apple) fruit.getValue();
        try {
            Orange c = (Orange) fruit.getValue();
        } catch (Exception e) {
            System.out.println(e);
        }
//        fruit.setValue(new Apple()); //вызов set невозможен
//        fruit.setValue(new Fruit());

        System.out.println(fruit.equals(d));
    }
}

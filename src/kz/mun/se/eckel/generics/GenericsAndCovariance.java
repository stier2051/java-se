package kz.mun.se.eckel.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple()); //Ошибка компиляции: добавление элементов невозможно
//        flist.add(new Orange());
//        flist.add(new Object());
        flist.add(null); //добавление возможно, но не интересно
        Fruit f = flist.get(0);
    }
}

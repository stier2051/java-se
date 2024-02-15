package kz.mun.se.effective_java.object_methods.equals;

import java.awt.*;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        //реализация, которая нарушает симметричность
//        if (!(obj instanceof ColorPoint)) {
//            return false;
//        }
//        return super.equals(obj) && ((ColorPoint) obj).color == color;


        //реализация, которая соблюдает симметричность, но нарушает транзитивность
        if (!(obj instanceof Point)) {
            return false;
        }
        //если obj - обычная точка, сравнение не учитывает цвет
        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }
        //obj - объект ColorPoint; выполняется полное сравнение
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}

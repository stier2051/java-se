package kz.mun.se.alishev.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        //название_класса1 название_класса2 название_метода
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();
        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");
        m.invoke(o1, o2);
        System.out.println(o1);
    }
}

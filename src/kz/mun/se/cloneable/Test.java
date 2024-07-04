package kz.mun.se.cloneable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Car car = new Car(1L, "Ford", "red", 1000);

        Car clone = (Car) car.clone();
        System.out.println(car);
        clone.setId(2L);
        System.out.println(clone);

        Class<?> carClass = car.getClass();
        Field[] fieldList = carClass.getDeclaredFields();
        List<Method> methodList = Arrays.asList(carClass.getDeclaredMethods());
        List<String> methodNameList = methodList.stream().map(Method::getName).collect(Collectors.toList());

        List<String> list = new ArrayList<>();
        list.add("color");
        list.add("speed");

        for (Field field : fieldList) {
            if (list.contains(field.getName())) {
                String setterName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                if (methodNameList.contains(setterName)) {
                    Method method = carClass.getMethod(setterName, field.getType());
                    switch (field.getType().getName()) {
                        case "byte":
                            method.invoke(clone, (byte) 0);
                            break;
                        case "short":
                            method.invoke(clone, (short) 0);
                            break;
                        case "int":
                            method.invoke(clone, 0);
                            break;
                        case "long":
                            method.invoke(clone, 0L);
                            break;
                        case "float":
                            method.invoke(clone, 0.0f);
                            break;
                        case "double":
                            method.invoke(clone, 0.0);
                            break;
                        case "boolean":
                            method.invoke(clone, false);
                            break;
                        case "char":
                            method.invoke(clone, (char) 0);
                            break;
                        default:
                            method.invoke(clone, (Object) null);
                            break;
                    }
                }
            }
        }

        System.out.println(clone);
    }
}

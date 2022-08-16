package kz.mun.se.alishev.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        //получаем доступ к объекту типа Class для объекта типа Person тремя способами
        Class personClass = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("kz.mun.se.alishev.reflection.Person");

        //получаем все методы класса Person
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() +
                    ", " + method.getReturnType() +
                    ", " + Arrays.toString(method.getParameterTypes()));
        }

        //получаем все поля класса Person
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        //проверяем наличие определенной анотации
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) System.out.println("Yes");
        }
    }
}

package kz.mun.se.eckel.exceptions;

public class ExtraFeatures {

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
        }

        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
        }

        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
        }
    }

    public static void f() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из f()");
        throw new  MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из g()");
        throw new  MyException2("Создано в g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из h()");
        throw new  MyException2("Создано в h()", 47);
    }
}

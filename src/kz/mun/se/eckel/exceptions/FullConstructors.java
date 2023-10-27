package kz.mun.se.eckel.exceptions;

public class FullConstructors {
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }
    }

    public static void f() throws MyException {
        System.out.println("Возбуждаем MyException из f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Возбуждаем MyException из g()");
        throw new MyException();
    }
}

package kz.mun.se.eckel.exceptions;

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Возбуждаем SimpleException из f()");
        throw new SimpleException();
    }
}

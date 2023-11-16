package kz.mun.se.eckel.abstraction;

public class BackendDeveloper extends ITEmployee {

    public BackendDeveloper(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("I do backend");
    }
}

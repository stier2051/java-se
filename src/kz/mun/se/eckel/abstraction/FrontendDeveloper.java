package kz.mun.se.eckel.abstraction;

public class FrontendDeveloper extends ITEmployee {
    public FrontendDeveloper(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("I do frontend");
    }
}

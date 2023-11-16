package kz.mun.se.eckel.abstraction;

public class QA extends ITEmployee {

    public QA(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("I do tests for application");
    }
}

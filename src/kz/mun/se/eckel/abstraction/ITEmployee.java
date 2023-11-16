package kz.mun.se.eckel.abstraction;

public abstract class ITEmployee {
    private String name;
    private int age;

    public ITEmployee() {
    }

    public ITEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void doWork();
}

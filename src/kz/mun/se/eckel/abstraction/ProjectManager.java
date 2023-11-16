package kz.mun.se.eckel.abstraction;

public class ProjectManager extends ITEmployee {

    public ProjectManager() {
    }

    public ProjectManager(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("I execute project and create team for this project");
    }
}

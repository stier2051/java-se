package kz.mun.se.kishori.annotations;

public class Manager extends Employee {
    @Override
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary():" + salary);
    }
}
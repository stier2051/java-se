package kz.mun.se.eckel.abstraction;

public class MyITCompany {
    String name;
    int employeeCount;

    public MyITCompany() {
    }

    public MyITCompany(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void createAwesomeApplication(ITEmployee employee) {
        employee.doWork();
    }

    @Override
    public String toString() {
        return "MyITCompany{" +
                "name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}

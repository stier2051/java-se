package kz.mun.se.eckel.abstraction;

public class Test {
    public static void main(String[] args) {
        MyITCompany company = new MyITCompany("MunCorp", 20);
        ProjectManager pm = new ProjectManager("Serik", 30);
        SystemAnalyst sa = new SystemAnalyst("Zhanna", 25);
        BackendDeveloper back = new BackendDeveloper("Amir", 22);
        FrontendDeveloper front = new FrontendDeveloper("Dina", 31);
        QA qa = new QA("Vladimir", 28);

        ITEmployee[] team = {pm, sa, back, front, qa};

        for (ITEmployee employee : team) {
            employee.doWork();
        }
    }
}

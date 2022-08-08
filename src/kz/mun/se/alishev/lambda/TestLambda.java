package kz.mun.se.alishev.lambda;

interface Executable {
    int execute();
}

class Runner {
    public void run (Executable e) {
        int a = e.execute();
        System.out.println(a);
    }
}

public class TestLambda {
    public static void main(String[] args) {
       Runner runner = new Runner();

       runner.run(new Executable() {
           @Override
           public int execute() {
               System.out.println("Hello");
               System.out.println("Good bye");
               return 1;
           }
       });

       runner.run(() -> {
           System.out.println("Hello");
           System.out.println("Good bye");
           return 5;
       });
    }
}

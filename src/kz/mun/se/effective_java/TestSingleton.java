package kz.mun.se.effective_java;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonField elvis = SingletonField.INSTANCE;
        elvis.setName("Elvis");
        System.out.println(elvis);
    }
}

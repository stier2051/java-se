package kz.mun.se.effective_java;
//singleton pattern - со статической фабрикой
public class SingletonFabricMethod {
    private static final SingletonFabricMethod INSTANCE = new SingletonFabricMethod();
    private SingletonFabricMethod() {}

    public static SingletonFabricMethod getInstance() {
        return INSTANCE;
    }
}

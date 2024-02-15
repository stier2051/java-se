package kz.mun.se.effective_java.create_remove_objects;
//singleton pattern - со статической фабрикой
public class SingletonFabricMethod {
    private static final SingletonFabricMethod INSTANCE = new SingletonFabricMethod();
    private SingletonFabricMethod() {}

    public static SingletonFabricMethod getInstance() {
        return INSTANCE;
    }
}

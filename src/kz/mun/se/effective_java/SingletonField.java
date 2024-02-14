package kz.mun.se.effective_java;

//singleton pattern - с полем public final
public class SingletonField {
    public static final SingletonField INSTANCE = new SingletonField();

    private String name;
    private SingletonField(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

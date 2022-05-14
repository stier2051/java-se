package kz.mun.se.eckel.interfaces;

public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        TestInterface.process(new Upcase(), s);
        TestInterface.process(new Downcase(), s);
        TestInterface.process(new Splitter(), s);
    }
}

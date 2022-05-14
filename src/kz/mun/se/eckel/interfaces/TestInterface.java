package kz.mun.se.eckel.interfaces;

import java.util.Arrays;

public class TestInterface {
    public static void process(Processor p, Object s) {
        System.out.println("use processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

//class Processor {
//    public String name() {
//        return getClass().getName();
//    }
//
//    Object process(Object input) {
//        return input;
//    }
//}

interface Processor {
    public String name();
    Object process(Object input);
}

//class Upcase extends Processor {
//    String process(Object input) {
//        return ((String) input).toUpperCase();
//    }
//}

class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
//class Downcase extends Processor {
//    String process(Object input) {
//        return ((String) input).toLowerCase();
//    }
//}

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

//class Splitter extends Processor {
//    String process(Object input) {
//        return Arrays.toString(((String) input).split(" "));
//    }
//}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

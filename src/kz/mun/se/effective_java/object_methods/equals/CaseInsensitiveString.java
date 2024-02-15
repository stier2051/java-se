package kz.mun.se.effective_java.object_methods.equals;

import java.util.Objects;

//нарушение симметричности
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        //переопределение, которое нарушает симметричность
//        if (obj instanceof CaseInsensitiveString)
//            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);

        //одностороннее взаимодействие
//        if (obj instanceof String)
//            return s.equalsIgnoreCase((String) obj);
//
//        return false;

        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }
}

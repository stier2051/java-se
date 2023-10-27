package kz.mun.se.eckel.exceptions;

public class TestExceptions {
    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.err.println("Перехвачено!");
        }

        //invoke NPE
        String str = null;
        try {
            System.out.println(str.trim());
        } catch (NullPointerException e) {
            e.printStackTrace(System.err);
        }

        //invoke ArrayIndexOutOfBoundException
        int[] array = {1,23,4,54,87};
        try {
            for(int i = 0; i < array.length + 1; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.err);
        }
    }
}

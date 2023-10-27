package kz.mun.se.eckel.exceptions;

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Перехвачено " + e);
        }
    }
}

package kz.mun.se.effective_java.object_methods.equals;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point{
    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }
}

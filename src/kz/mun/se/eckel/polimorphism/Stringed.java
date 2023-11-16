package kz.mun.se.eckel.polimorphism;

public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

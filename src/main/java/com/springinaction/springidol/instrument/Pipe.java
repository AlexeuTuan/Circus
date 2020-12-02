package com.springinaction.springidol.instrument;


@StringedInstrument
public class Pipe implements Instrument {
    @Override
    public void play() {
        System.out.println("Whooo-whoo");
    }
}

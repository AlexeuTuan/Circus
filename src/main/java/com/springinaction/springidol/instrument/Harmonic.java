package com.springinaction.springidol.instrument;


import com.springinaction.springidol.annotation.ExampleAnnotation;

@ExampleAnnotation
public class Harmonic implements Instrument {
    @Override
    public void play() {
        System.out.println("Trun-trun");
    }
}

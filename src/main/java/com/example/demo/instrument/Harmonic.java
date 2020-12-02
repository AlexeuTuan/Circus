package com.example.demo.instrument;


import com.example.demo.annotation.ExampleAnnotation;

@ExampleAnnotation
public class Harmonic implements Instrument {
    @Override
    public void play() {
        System.out.println("Trun-trun");
    }
}

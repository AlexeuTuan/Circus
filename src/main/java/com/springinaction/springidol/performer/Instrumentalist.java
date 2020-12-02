package com.springinaction.springidol.performer;

import com.springinaction.springidol.instrument.Instrument;


// @Component("eddie")
public class Instrumentalist implements Performer {

    private String song;

    private Instrument instrument;


    public Instrumentalist() {
    }

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }
    public String getSong() {
        return song;
    }

    // @Autowired
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument;
    }
    public Instrument getInstrument() {
        return instrument;
    }
}
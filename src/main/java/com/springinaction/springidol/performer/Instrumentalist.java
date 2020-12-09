package com.springinaction.springidol.performer;

import com.springinaction.springidol.instrument.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {
    @Value("123")
    private String song;

    @Autowired
    private Instrument instrument;

    public Instrumentalist() {
    }

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public Instrument getInstrument() {
        return instrument;
    }
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
package com.springinaction.springidol.performer;

import com.springinaction.springidol.instrument.Instrument;

import java.util.Map;

public class OneManBand implements Performer {
    public OneManBand() {
    }
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде
    } // отображения (Map)
}
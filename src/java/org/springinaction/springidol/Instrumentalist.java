package org.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }
    
    @Override
    public void perform() {
        System.out.println("playing " + song + " : ");
        instrument.play();
    }
    
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
    
    public String screamSong() {
        return song;
    }
    
    
    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}

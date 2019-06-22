package org.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer{

    public OneManBand() {
    }

    @Override
    public void perform() {
        instruments.forEach((instrument) -> {
            instrument.play();
        });
    }
        private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
        
        
    
}

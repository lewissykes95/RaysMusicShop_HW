package instruments;

import behaviours.IPlay;

public class Instrument implements IPlay {

    protected String material;

    protected String colour;

    protected InstrumentType instrumentType;

    protected String sound;


    public Instrument(String material, String colour, InstrumentType instrumentType, String sound) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.sound = sound;
    }


    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
    @Override
    public String play() {
        return this.sound;

    }
}

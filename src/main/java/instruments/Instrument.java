package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {


    protected double price;
    protected String material;

    protected String colour;

    protected InstrumentType instrumentType;

    protected String sound;


    public Instrument(double price, String material, String colour, InstrumentType instrumentType, String sound) {
        this.price = price;
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.sound = sound;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

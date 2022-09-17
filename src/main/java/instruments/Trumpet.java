package instruments;

public class Trumpet extends Instrument{

    private TrumpetType trumpetType;

    private int numValves;

    public Trumpet(double price, String material, String colour, InstrumentType instrumentType, String sound, TrumpetType trumpetType, int numValves) {
        super(price, material, colour, instrumentType, sound);
        this.trumpetType = trumpetType;
        this.numValves = numValves;
    }

    public TrumpetType getTrumpetType() {
        return trumpetType;
    }

    public int getNumValves() {
        return this.numValves;
    }


}

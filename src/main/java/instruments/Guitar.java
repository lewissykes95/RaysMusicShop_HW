package instruments;

public class Guitar extends Instrument {

    private GuitarType guitarType;

    private int numStrings;

    public Guitar(double price, String material, String colour, InstrumentType instrumentType, String sound, GuitarType guitarType, int numStrings) {
        super(price, material, colour, instrumentType, sound);
        this.guitarType = guitarType;
        this.numStrings = numStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumStrings() {
        return numStrings;
    }


}

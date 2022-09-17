package instruments;

public class Guitar extends Instrument {

    private GuitarType guitarType;

    public Guitar(String material, String colour, InstrumentType instrumentType, String sound, GuitarType guitarType) {
        super(material, colour, instrumentType, sound);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }
}

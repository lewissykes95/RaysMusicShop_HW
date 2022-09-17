package instruments;

public class Trumpet extends Instrument{

    private TrumpetType trumpetType;

    public Trumpet(String material, String colour, InstrumentType instrumentType, String sound, TrumpetType trumpetType) {
        super(material, colour, instrumentType, sound);
        this.trumpetType = trumpetType;
    }

    public TrumpetType getTrumpetType() {
        return trumpetType;
    }
}

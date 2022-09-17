package instruments;

public class Drum extends Instrument{

    private DrumType drumType;

    public Drum(String material, String colour, InstrumentType instrumentType, String sound, DrumType drumType) {
        super(material, colour, instrumentType, sound);
        this.drumType = drumType;
    }

    public DrumType getDrumType() {
        return drumType;
    }
}

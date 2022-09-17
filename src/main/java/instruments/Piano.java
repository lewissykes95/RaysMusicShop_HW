package instruments;

public class Piano extends Instrument{

    private PianoType pianoType;

    public Piano(String material, String colour, InstrumentType instrumentType, String sound, PianoType pianoType) {
        super(material, colour, instrumentType, sound);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
}

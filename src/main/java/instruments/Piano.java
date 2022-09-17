package instruments;

public class Piano extends Instrument{

    private PianoType pianoType;

    private int age;

    public Piano(double price, String material, String colour, InstrumentType instrumentType, String sound, PianoType pianoType, int age) {
        super(price, material, colour, instrumentType, sound);
        this.pianoType = pianoType;
        this.age = age;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getAge() {
        return this.age;
    }
}

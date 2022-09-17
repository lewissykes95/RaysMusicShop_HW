import instruments.*;
import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {


    Drum drum;
    Guitar guitar;

    @Before
    public void setUp() {
        drum = new Drum("Oak", "Black", InstrumentType.PERCUSSION, "BOOM BOOM BANG BANG", DrumType.SNARE);
        guitar = new Guitar("Mahogany", "Orange and Black", InstrumentType.STRING, "Twang", GuitarType.ELECTRIC);
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Oak", drum.getMaterial());
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetInstrumentColour() {
        assertEquals("Black", drum.getColour());
        assertEquals("Orange and Black", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void instrumentCanPlaySound() {
        assertEquals("BOOM BOOM BANG BANG", drum.play());
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void canGetInstrumentTypeByCategory() {
        assertEquals(DrumType.SNARE, drum.getDrumType());
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }
}

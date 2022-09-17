package InstrumentTests;

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
        drum = new Drum(200.00,"Oak", "Black", InstrumentType.PERCUSSION, "BOOM BOOM BANG BANG", DrumType.SNARE);
        guitar = new Guitar(500.00,"Mahogany", "Orange and Black", InstrumentType.STRING, "Twang", GuitarType.ELECTRIC, 6);
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

    @Test
    public void canGetPrice() {
        assertEquals(200, drum.getPrice(), 0.0);
        assertEquals(500, guitar.getPrice(), 0.0);
    }

    @Test
    public void canChangePrice() {
        drum.setPrice(300);
        guitar.setPrice(600);
        assertEquals(300, drum.getPrice(), 0.0);
        assertEquals(600, guitar.getPrice(), 0.0);
    }



}

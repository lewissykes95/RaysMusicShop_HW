package ShopTests;

import instruments.Guitar;
import instruments.GuitarType;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    Shop shop;
    Guitar guitar;

    @Before
    public void setUp() {
        shop = new Shop("Rays Music Shop", 10000.00);
        guitar = new Guitar(500.00,"Mahogany", "Orange and Black", InstrumentType.STRING, "Twang", GuitarType.ELECTRIC, 6);
    }

    @Test
    public void canGetStock() {
        assertEquals(0, shop.getItems().size());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getItems().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getItems().size());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(600, shop.calculateMarkup(guitar), 0.0);
    }


}

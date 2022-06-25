package instrumentTests;

import Shop.instruments.Guitar;
import Shop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTests {

    Guitar guitar1;

    @Before
    public void before(){

        guitar1 = new Guitar(2000.00,1600.00, InstrumentType.STRING,"Mahogany","Gibson","Les Paul", 6);

    }

    @Test
    public void hasSalePrice(){
        assertEquals(2000.00,guitar1.getSalePrice(), 0.00);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(1600.00,guitar1.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING,guitar1.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Mahogany",guitar1.getMaterial());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Gibson",guitar1.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Les Paul",guitar1.getModel());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6,guitar1.getStrings());
    }

    @Test
    public void canChangeSalePrice(){
        guitar1.setSalePrice(1800.00);
        assertEquals(1800.00,guitar1.getSalePrice(),0.00);
    }

    @Test
    public void canPlayATune(){
        assertEquals("Strum Strum Strum", guitar1.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400.00,guitar1.calculateMarkup(),0.00);
    }
}

package instrumentTests;

import Shop.items.GuitarPick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {

    GuitarPick pick1;

    @Before
    public void before(){

        pick1 = new GuitarPick(0.50,0.20,"Awesome Pick", "Purple", 0.8);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(0.30,pick1.calculateMarkup(),0.00);
    }

    @Test
    public void canSalePrice(){
        assertEquals(0.50,pick1.getSalePrice(),0.00);
    }

    @Test
    public void canPurchasePrice(){
        assertEquals(0.20,pick1.getPurchasePrice(),0.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Awesome Pick",pick1.getName());
    }

    @Test
    public void canGetThickness(){
        assertEquals(0.8,pick1.getThickness(),0.00);
    }

    @Test
    public void canColour(){
        assertEquals("Purple",pick1.getColour());
    }


}

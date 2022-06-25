package instrumentTests;

import Shop.instruments.Guitar;
import Shop.items.GuitarPick;
import Shop.items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTests {

    SheetMusic sheetMusic1;
    Guitar guitar;


    @Before
    public void before(){

        sheetMusic1 = new SheetMusic(20.00,15.00,"Beatles Bops","Pop/Rock",guitar,"Easy");

    }

    @Test
    public void canGetMarkup(){
        assertEquals(5.00,sheetMusic1.calculateMarkup(),0.00);
    }

    @Test
    public void canSalePrice(){
        assertEquals(20.00,sheetMusic1.getSalePrice(),0.00);
    }

    @Test
    public void canPurchasePrice(){
        assertEquals(15.00,sheetMusic1.getPurchasePrice(),0.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Beatles Bops",sheetMusic1.getName());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Pop/Rock",sheetMusic1.getGenre());
    }

    @Test
    public void canGetInstrument(){
        assertEquals(guitar,sheetMusic1.getInstrument());
    }

    @Test
    public void canGetDifficulty(){
        assertEquals("Easy",sheetMusic1.getDifficulty());
    }
}

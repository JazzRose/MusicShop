import Shop.Shop;
import Shop.instruments.Guitar;
import Shop.instruments.InstrumentType;
import Shop.instruments.Piano;
import Shop.instruments.PianoType;
import Shop.items.GuitarPick;
import Shop.items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop jazzyShop;
    Guitar guitar1;
    Piano piano1;
    SheetMusic sheetMusic1;
    Guitar guitar;
    GuitarPick pick1;


    @Before
    public void before(){

    jazzyShop = new Shop();
    sheetMusic1 = new SheetMusic(20.00,15.00,"Beatles Bops","Pop/Rock",guitar,"Easy");
    guitar1 = new Guitar(2000.00,1600.00, InstrumentType.STRING,"Mahogany","Gibson","Les Paul", 6);
    piano1 = new Piano(3000.00,2500.00, InstrumentType.KEYBOARD,"Rosewood","Collard & Collard","B1", PianoType.BABY_GRAND);
    pick1 = new GuitarPick(0.50,0.20,"Awesome Pick", "Purple", 0.8);

    }

    @Test
    public void shopStartsWithEmptyStock(){
        assertEquals(0,jazzyShop.getStockAmount());
    }

    @Test
    public void canAddToStock(){
        jazzyShop.addToStock(guitar1);
        jazzyShop.addToStock(piano1);
        jazzyShop.addToStock(pick1);
        jazzyShop.addToStock(sheetMusic1);
        assertEquals(4,jazzyShop.getStockAmount());
    }

    @Test
    public void canRemoveFromStock(){
        jazzyShop.addToStock(guitar1);
        jazzyShop.addToStock(piano1);
        jazzyShop.addToStock(pick1);
        jazzyShop.removeFromStock(pick1);
        assertEquals(2,jazzyShop.getStockAmount());
    }

    @Test
    public void canGetPotentialProfit(){
        jazzyShop.addToStock(guitar1);
        jazzyShop.addToStock(piano1);
        jazzyShop.addToStock(sheetMusic1);
        assertEquals(905.00,jazzyShop.calculatePotentialProfit(),0.00);
    }


}

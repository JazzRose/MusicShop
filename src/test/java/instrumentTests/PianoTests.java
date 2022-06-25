package instrumentTests;

import Shop.instruments.InstrumentType;
import Shop.instruments.Piano;
import Shop.instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTests {

    Piano piano1;

    @Before
    public void before(){
        piano1 = new Piano(3000.00,2500.00, InstrumentType.KEYBOARD,"Rosewood","Collard & Collard","B1", PianoType.BABY_GRAND);

    }

    @Test
    public void hasAPianoType (){
        assertEquals(PianoType.BABY_GRAND,piano1.getPianoType());
    }

    @Test
    public void canPlayATune(){
        assertEquals("Bing Bang Bong", piano1.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(500.00,piano1.calculateMarkup(),0.00);
    }
}

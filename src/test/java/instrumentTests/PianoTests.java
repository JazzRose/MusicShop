package instrumentTests;

import instruments.InstrumentType;
import instruments.Piano;
import instruments.PianoType;
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
    public void hasaPianoType (){
        assertEquals(PianoType.BABY_GRAND,piano1.getPianoType());
    }
}

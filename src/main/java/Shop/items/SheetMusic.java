package Shop.items;

import Shop.instruments.Instrument;
import Shop.instruments.InstrumentType;

public class SheetMusic extends NonInstruments{

    private String name;
    private String genre;
    private Instrument instrument;
    private String difficulty;

    public SheetMusic(double salePrice, double purchasePrice, String name, String genre, Instrument instrument, String difficulty) {
        super(salePrice, purchasePrice);
        this.name = name;
        this.genre = genre;
        this.instrument = instrument;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Instrument getInstrument(){
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

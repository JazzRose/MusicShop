package Shop.instruments;

public class Piano extends Instrument {


    private PianoType pianoType;


    public Piano(double salePrice, double purchasePrice, InstrumentType instrumentType, String material, String manufacturer, String model, PianoType pianoType) {
        super(salePrice, purchasePrice, instrumentType, material, manufacturer, model);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public void setPianoType(PianoType pianoType) {
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "Bing Bang Bong";
    }
}

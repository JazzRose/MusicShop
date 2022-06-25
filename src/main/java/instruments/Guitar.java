package instruments;

public class Guitar extends Instrument{

    private int strings;


    public Guitar(double salePrice, double purchasePrice, InstrumentType type, String material, String manufacturer, String model, int strings) {
        super(salePrice, purchasePrice, type, material, manufacturer, model);
        this.strings = strings;
    }


    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public String play() {
        return "Strum Strum Strum";

    }
}

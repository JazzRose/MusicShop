package instruments;

public class Guitar extends Instrument{

    private String manufacturer;
    private String model;
    private int strings;


    public Guitar(double salePrice, double purchasePrice, Type type, String material, String manufacturer, String model, int strings) {
        super(salePrice, purchasePrice, type, material);
        this.manufacturer = manufacturer;
        this.model = model;
        this.strings = strings;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}

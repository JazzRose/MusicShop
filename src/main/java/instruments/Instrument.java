package instruments;

public abstract class Instrument implements IPlay{

    private String name;
    private double salePrice;
    private double purchasePrice;
    private InstrumentType type;
    private String material;
    private String manufacturer;
    private String model;

    public Instrument(double salePrice, double purchasePrice, InstrumentType type, String material, String manufacturer, String model) {
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.type = type;
        this.material = material;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

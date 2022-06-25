package instruments;

public abstract class Instrument {

    private String name;
    private double salePrice;
    private double purchasePrice;
    private Type type;
    private String material;

    public Instrument(double salePrice, double purchasePrice, Type type, String material) {
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.type = type;
        this.material = material;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

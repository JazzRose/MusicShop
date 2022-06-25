public abstract class Instrument {

    private String name;
    private int salePrice;
    private int purchasePrice;
    private Type type;
    private String material;

    public Instrument(int salePrice, int purchasePrice, Type type, String material) {
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.type = type;
        this.material = material;
    }
}

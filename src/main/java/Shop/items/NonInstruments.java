package Shop.items;

import Shop.ISell;

public abstract class NonInstruments  implements ISell {

    private double salePrice;
    private double purchasePrice;

    protected NonInstruments(double salePrice, double purchasePrice) {
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
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

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double calculateMarkup(){
        return salePrice - purchasePrice;
    }
}

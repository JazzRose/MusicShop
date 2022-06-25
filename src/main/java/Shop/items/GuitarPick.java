package Shop.items;

import Shop.ISell;

public class GuitarPick extends NonInstruments{

    private String name;
    private String colour;
    private double thickness;

    public GuitarPick(double salePrice, double purchasePrice, String name, String colour, double thickness) {
        super(salePrice, purchasePrice);
        this.name = name;
        this.colour = colour;
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getThickness() {
        return thickness;
    }

}

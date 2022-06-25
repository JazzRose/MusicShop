package Shop;

import Shop.instruments.Guitar;
import Shop.items.GuitarPick;

import java.util.ArrayList;

public class Shop {

   private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int getStockAmount() {
       return stock.size();
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public double calculatePotentialProfit() {
        double profit = 0.00;
        for (ISell item : stock) {
            profit += item.calculateMarkup();
        }
        return profit;

    }
}

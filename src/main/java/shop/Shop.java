package shop;
import behaviours.ISell;
import instruments.Instrument;
import java.util.ArrayList;
public class Shop implements ISell {
    private String name;
    private double till;
    private ArrayList<ISell> stock;
    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public double getTill() {
        return till;
    }
    public ArrayList<ISell> getItems() {
        return stock;
    }
    public void addToStock(ISell item) {
        stock.add(item);
    }
    public void removeFromStock(ISell item){
        stock.remove(item);
    }
    public int stockAmount() {
        return this.stock.size();
    }






    public double calculateSellPrice(Instrument instrument) {
        double buyPrice = instrument.getPrice();
        double twentyPercent = (buyPrice / 5);
        return twentyPercent + buyPrice;
    }

}

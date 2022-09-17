package shop;

import behaviours.ISell;
import instruments.Guitar;
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

    public void addToStock(Instrument instrument) {
        stock.add(instrument);
    }


    public void removeFromStock(Guitar guitar){
        stock.remove(guitar);
    }


    public double calculateMarkup(Instrument instrument) {
        double buyPrice = instrument.getPrice();
        return (buyPrice / 5) + buyPrice;
    }
}

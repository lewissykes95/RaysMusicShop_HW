package shop;

import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell {

    private String name;

    private int till;

    private ArrayList<ISell> items;

    public Shop(String name, int till) {
        this.name = name;
        this.till = till;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<ISell> getItems() {
        return items;
    }


    @Override
    public void calculateMarkup() {

    }
}

package behaviours;

import instruments.Instrument;

public interface ISell {

    public default double calculateMarkup(Instrument instrument) {
        double buyPrice = instrument.getPrice();
        return (buyPrice / 20) + buyPrice;
    }
}

package lab3.compulsory.locations;

import lab3.compulsory.interfaces.Classifiable;
import lab3.compulsory.interfaces.Payable;

import java.util.HashMap;
import java.util.Map;

public class Hotel extends Location implements Payable, Classifiable {

    private double priceNight;

    public Hotel(String name, double priceNight) {
        super(name, new HashMap<>());
        this.priceNight = priceNight;
    }

    public double getPriceNight() {
        return priceNight;
    }

    public void setPriceNight(double priceNight) {
        this.priceNight = priceNight;
    }

    @Override
    public int getRank() {
        return 0;
    }

    @Override
    public double getTicketPrice() {
        return priceNight;
    }

}

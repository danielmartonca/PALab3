package lab3.compulsory.locations;

import lab3.compulsory.interfaces.Classifiable;
import lab3.compulsory.interfaces.Payable;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Hotel creates a location with name and a cost map to other locations.
 * It also features two proprieties:
 * It payable with a price per night.
 * It is classifiable.
 */
public class Hotel extends Location implements Payable, Classifiable {

    private double priceNight;

    /**
     * Constructor for Hotel object. It calls the constructor in Location superclass and creates two opening times.
     *
     * @param name       The name of the object
     * @param priceNight the price for a night
     */
    public Hotel(String name, double priceNight) {
        super(name, new HashMap<>());
        this.priceNight = priceNight;
    }

    /**
     * Setter for the ticket price per night.
     *
     * @param priceNight the price per night.
     */
    public void setTicketPrice(double priceNight) {
        this.priceNight = priceNight;
    }

    /**
     * Method that returns the Rank of the Hotel.
     *
     * @return the rank
     */
    @Override
    public int getRank() {
        return 4;
    }

    /**
     * Getter for a night price.
     *
     * @return the price for one night
     */
    @Override
    public double getTicketPrice() {
        return priceNight;
    }

}

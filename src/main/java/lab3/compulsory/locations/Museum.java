package lab3.compulsory.locations;

import lab3.compulsory.interfaces.Classifiable;
import lab3.compulsory.interfaces.Payable;
import lab3.compulsory.interfaces.Visitable;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Museum creates a location with name and a cost map to other locations.
 * It also features two proprieties:
 * It is visitable with opening hour and closing hour.
 * It is Payable.
 */
public class Museum extends Location implements Visitable, Payable, Classifiable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    /**
     * Constructor for Museum object. It calls the constructor in Location superclass and creates two opening times.
     *
     * @param name        The name of the object
     * @param openingTime String under form: "xx:xx:xx" representing the opening hour,minute and second
     * @param closingTime String under form: "xx:xx:xx" representing the closing hour,minute and second
     */
    public Museum(String name, String openingTime, String closingTime, double ticketPrice) {
        super(name, new HashMap<>());
        this.openingTime = LocalTime.parse(openingTime);
        this.closingTime = LocalTime.parse(closingTime);
        this.ticketPrice = ticketPrice;
    }

    /**
     * Getter for opening time under LocalTime format
     *
     * @return the opening time
     */
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * Setter for opening time.
     *
     * @param openingTime opening hour under String format.
     */
    public void setOpeningTime(String openingTime) {
        this.openingTime = LocalTime.parse(openingTime);
    }

    /**
     * Setter for the opening time.
     *
     * @param openingTime opening hour under LocalTime format
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * Getter for closing time under LocalTime format
     *
     * @return the closing time
     */
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * Setter for the closing time.
     *
     * @param closingTime closing hour under LocalTime format
     */
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * Getter for a night price.
     *
     * @return the price for one night
     */
    @Override
    public double getTicketPrice() {
        return this.ticketPrice;
    }

    /**
     * Setter for the ticket price.
     *
     * @param ticketPrice the ticket price
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * Method that returns the Rank of the Museum.
     *
     * @return the rank
     */
    @Override
    public int getRank() {
        return 5;
    }
}

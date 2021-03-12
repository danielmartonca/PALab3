package lab3.optional.locations;

import lab3.optional.interfaces.Classifiable;
import lab3.optional.interfaces.Visitable;

import java.time.LocalTime;
import java.util.HashMap;

/**
 * Class Church creates a location with name and a cost map to other locations.
 * It also features two proprieties:
 * It is visitable with opening hour and closing hour.
 * It is classifiable.
 */
public class Church extends Location implements Visitable, Classifiable {

    public LocalTime openingTime, closingTime;

    /**
     * Constructor for Church object. It calls the constructor in Location superclass and creates two opening times.
     *
     * @param name        The name of the object
     * @param openingTime String under form: "xx:xx:xx" representing the opening hour,minute and second
     * @param closingTime String under form: "xx:xx:xx" representing the closing hour,minute and second
     */
    public Church(String name, String openingTime, String closingTime) {
        super(name, new HashMap<>());
        this.openingTime = LocalTime.parse(openingTime);
        this.closingTime = LocalTime.parse(closingTime);
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
     * Setter for opening time.
     *
     * @param openingTime opening hour under String format.
     */
    public void setOpeningTime(String openingTime) {
        this.openingTime = LocalTime.parse(openingTime);
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
     * Setter for the closing time.
     *
     * @param closingTime closing hour under String format
     */
    public void setClosingTime(String closingTime) {
        this.openingTime = LocalTime.parse(closingTime);
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
     * Getter for closing time under LocalTime format
     *
     * @return the closing time
     */
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * Method that returns the Rank of the Church.
     *
     * @return the rank
     */
    @Override
    public int getRank() {
        return 0;
    }

}

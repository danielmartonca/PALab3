package lab3.optional.locations;

import lab3.optional.interfaces.Classifiable;

import java.time.LocalTime;
import java.util.HashMap;

/**
 * Class Restaurant creates a location with name and a cost map to other locations.
 * It also features two proprieties:
 * It is visitable with opening hour and closing hour.
 * It is classifiable.
 */
public class Restaurant extends Location implements Classifiable {

    private LocalTime openingTime, closingTime;

    /**
     * Constructor for Restaurant object. It calls the constructor in Location superclass and creates two opening times.
     *
     * @param name        The name of the object
     * @param openingTime String under form: "xx:xx:xx" representing the opening hour,minute and second
     * @param closingTime String under form: "xx:xx:xx" representing the closing hour,minute and second
     */
    public Restaurant(String name, String openingTime, String closingTime) {
        super(name, new HashMap<>());
        this.openingTime = LocalTime.parse(openingTime);
        this.closingTime = LocalTime.parse(closingTime);
    }

    /**
     * Getter for opening time under LocalTime format
     *
     * @return the opening time
     */
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * Setter for opening time.
     *
     * @param openingTime opening hour under LocalTime format.
     */
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * Getter for closing time under LocalTime format
     *
     * @return the closing time
     */
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
     * Method that returns the Rank of the Restaurant.
     *
     * @return the rank
     */
    @Override
    public int getRank() {
        return 3;
    }
}

package lab3.optional.interfaces;

import lab3.optional.locations.Location;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Interface that implements an opening time and a closing time for a certain class.
 */
public interface Visitable {
    //LocalTime getOpeningTime(); abstract method OLD

    //LocalTime getClosingTime(); abstract method OLD

    /**
     * Default method that will be overridden. It has a default opening time of 10:00:00
     *
     * @return the opening time. Default 10:00:00
     */
    default LocalTime getOpeningTime()  //default method
    {
        return LocalTime.parse("10:00:00");
    }

    /**
     * Default method that will be overridden. It has a default closing time of 18:00:00
     *
     * @return the closing time. Default 18:00:00
     */
    default LocalTime getClosingTime()  //default method
    {
        return LocalTime.parse("18:00:00");
    }

    /**
     * Static method that returns the duration between the opening time and the closing time of an object of
     * type Location that implements the interface Visitable.
     *
     * @param location the object of type Location that implements the interface Visitable
     * @return the duration between the opening time and the closing time
     */
    static Duration getVisitingDuration(Location location) {
        return Duration.between(((Visitable) location).getOpeningTime(), ((Visitable) location).getClosingTime());
    }
}

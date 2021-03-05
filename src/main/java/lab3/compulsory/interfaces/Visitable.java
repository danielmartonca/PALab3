package lab3.compulsory.interfaces;

import java.time.LocalTime;

/**
 * Interface that implements an opening time and a closing time for a certain class.
 */
public interface Visitable {
    LocalTime getOpeningTime();

    LocalTime getClosingTime();
}

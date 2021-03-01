package lab3.compulsory.locations;

import lab3.compulsory.interfaces.Classifiable;
import lab3.compulsory.interfaces.Visitable;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Church extends Location implements Visitable, Classifiable {

    public LocalTime openingTime, closingTime;

    public Church(String name, String openingTime, String closingTime) {
        super(name, new HashMap<>());
        this.openingTime = LocalTime.parse(openingTime);
        this.closingTime = LocalTime.parse(closingTime);
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    @Override
    public int getRank() {
        return 0;
    }

}

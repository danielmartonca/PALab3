package lab3.compulsory.locations;

import lab3.compulsory.interfaces.Classifiable;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Restaurant extends Location implements Classifiable {

    private LocalTime openingTime, closingTime;

    public Restaurant(String name, String openingTime, String closingTime) {
        super(name, new HashMap<>());
        this.openingTime = LocalTime.parse(openingTime);
        this.closingTime = LocalTime.parse(closingTime);
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }


    @Override
    public int getRank() {
        return 4;
    }
}

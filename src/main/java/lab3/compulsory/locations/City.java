package lab3.compulsory.locations;

import java.util.LinkedList;

public class City {
    private LinkedList<Location> locationsList;

    public City() {
        locationsList = new LinkedList<>();
    }

    public City(LinkedList<Location> locationsList) {
        this.locationsList = locationsList;
    }

    public LinkedList<Location> getLocationsList() {
        return locationsList;
    }

    public void setLocationsList(LinkedList<Location> locationsList) {
        this.locationsList = locationsList;
    }

    public void addLocation(Location location) {
        this.locationsList.add(location);
    }
}

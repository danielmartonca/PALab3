package lab3.compulsory.locations;

import java.util.LinkedList;
import java.util.List;

/**
 * Class City stores an List of locations.
 */
public class City {
    private List<Location> locationsList;

    /**
     * Constructor for the City class that uses LinkedList as the type of list to be used.
     */
    public City() {
        locationsList = new LinkedList<>();
    }

    /**
     * Constructor for City with a parameter List of Location type objects.
     *
     * @param locationsList List of Location type objects
     */
    public City(List<Location> locationsList) {
        this.locationsList = locationsList;
    }

    /**
     * Getter for the list of locations
     *
     * @return the list of locations
     */
    public List<Location> getLocationsList() {
        return locationsList;
    }

    /**
     * Setter for the list of locations
     *
     * @param locationsList the new list of locations
     */
    public void setLocationsList(List<Location> locationsList) {
        this.locationsList = locationsList;
    }

    /**
     * Method that adds a location to the list of locations in the city.
     *
     * @param location The new Location object to be added in the location list.
     */
    public void addLocation(Location location) {
        this.locationsList.add(location);
    }
}

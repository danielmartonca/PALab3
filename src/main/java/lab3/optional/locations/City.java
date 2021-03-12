package lab3.optional.locations;

import lab3.optional.interfaces.Payable;
import lab3.optional.interfaces.Visitable;

import java.util.*;

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

    /**
     * This method finds which locations are visitable and payable, then sorts them based on the opening hour and print them to the screen.
     */
    public void printVisitableAndPayableLocations() {
        List<Location> locationsVisitableAndPayable = new LinkedList<>();

        for (Location location : locationsList)
            if (location instanceof Visitable && location instanceof Payable)
                locationsVisitableAndPayable.add(location);

        locationsVisitableAndPayable.sort(new Comparator<Location>() {
            @Override
            public int compare(Location l1, Location l2) {
                return l1.compareTo(l2);
            }
        });

        System.out.println("Locations that are visitable and payable:");
        for (Location location : locationsVisitableAndPayable)
            System.out.println(location);
    }

    public void printCity() {
        System.out.println("\nThe city:");
        for (Location location : locationsList)
            System.out.println(location.getName());
        System.out.print("\n");
    }
}

package lab3.optional.locations;

import lab3.optional.interfaces.Visitable;

import java.util.Map;

/**
 * Abstract class Location implements the functionalities for a location in a City
 * It also implements interface Comparable with objects of type Location in order to have some sort of ordering for objects of type Location
 */
public abstract class Location implements Comparable<Location> {

    private String name;
    private Map<Location, Integer> cost;

    /**
     * Constructor for Location. This constructor will be called by the subclasses it will create using super.
     *
     * @param name the name of the Location
     * @param cost the cost Map to other locations existing.
     */
    protected Location(String name, Map<Location, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Getter for name
     *
     * @return the name of the location
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the cost map to the other objects
     *
     * @return the cost map
     */
    public Map<Location, Integer> getCost() {
        return cost;
    }

    /**
     * Setter for the cost map. It adds a cost from the current location to a location specified.
     *
     * @param location the location from which to add the cost
     * @param value    the cost from this location to the location parameter
     */
    public void setCost(Location location, int value) {
        cost.put(location, value);
    }

    /**
     * Overridden method in order to compare objects of type Location
     *
     * @param other the other Location we compare this location to
     * @return integer value resulted by comparing the names of the locations as strings
     */
    @Override
    public int compareTo(Location other) {
        if (name != null) {
            if (this instanceof Visitable) {
                return ((Visitable) this).getOpeningTime().compareTo(((Visitable) other).getOpeningTime());
            } else
                return this.name.compareTo(other.name);

        } else
            throw new NullPointerException();
    }

    /**
     * Overridden method toString used to print the location's data members
     *
     * @return string containing the name of the location
     */
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                '}';
    }


}

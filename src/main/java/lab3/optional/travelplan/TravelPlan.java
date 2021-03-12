package lab3.optional.travelplan;

import lab3.optional.locations.*;

import java.util.LinkedList;
import java.util.List;

/**
 * The TravelPlan class purpose is to store a city and create a travel plan according to the user preferences.
 * The travel plan will consist of a list of locations the city.
 */
public class TravelPlan {
    private City city;
    private List<Location> visitingOrderPreferences;

    /**
     * Constructor for TravelPlan class that receives a City object as parameter.
     *
     * @param city a City object
     */
    public TravelPlan(City city) {
        this.city = city;
        this.visitingOrderPreferences = new LinkedList<>();
    }

    /**
     * Getter for the city.
     *
     * @return the city data member
     */
    public City getCity() {
        return city;
    }

    /**
     * Setter for city data member that will also reset the visiting order preferences (the travel plan).
     *
     * @param city the new city
     */
    public void setCity(City city) {
        this.city = city;
        visitingOrderPreferences = new LinkedList<>();
    }

    /**
     * This method checks if the location in the parameter is already in the travel plan order list.
     *
     * @param location the object to test the equality with.
     * @return true if it already on the travel plan, false otherwise
     */
    private boolean isLocationNotInTravelPlan(Location location) {
        for (Location location1 : visitingOrderPreferences)
            if (location.equals(location1))
                return false;

        return true;
    }

    /**
     * This method returns the next Church object available to visit in the city OR null if there are no churches left to visit.
     *
     * @return a Church object in the city data member or null
     */
    private Location getNextChurch() {

        for (Location location : city.getLocationsList())
            if (location instanceof Church)
                if (isLocationNotInTravelPlan(location))
                    return location;
        return null;
    }

    /**
     * This method returns the next Hotel object available to visit in the city OR null if there are no hotels left to visit.
     *
     * @return a Hotel object in the city data member or null
     */
    private Location getNextHotel() {
        for (Location location : city.getLocationsList())
            if (location instanceof Hotel)
                if (isLocationNotInTravelPlan(location))
                    return location;
        return null;
    }

    /**
     * This method returns the next Museum object available to visit in the city OR null if there are no museums left to visit.
     *
     * @return a Museum object in the city data member or null
     */
    private Location getNextMuseum() {
        for (Location location : city.getLocationsList())
            if (location instanceof Museum)
                if (isLocationNotInTravelPlan(location))
                    return location;
        return null;
    }

    /**
     * This method returns the next Restaurant object available to visit in the city OR null if there are no restaurants left to visit.
     *
     * @return a Restaurant object in the city data member or null
     */
    private Location getNextRestaurant() {
        for (Location location : city.getLocationsList())
            if (location instanceof Restaurant)
                if (isLocationNotInTravelPlan(location))
                    return location;
        return null;
    }

    /**
     * This method returns the next Location object to be added in the travel plan or null if none was found
     *
     * @param type the type of Location to be searched for
     * @return depending on the type parameter, an subclass of Location or null if none was found
     */
    private Location getNextLocationOfType(VisitPreference type) {
        if (type == VisitPreference.Museum)
            return getNextMuseum();
        if (type == VisitPreference.Hotel)
            return getNextHotel();
        if (type == VisitPreference.Church)
            return getNextChurch();

        return getNextRestaurant();
    }

    /**
     * Method that will insert a new visit in the travel plan according to the user's demands.
     * The user's demands will be an enum consisting of a couple of preferences.
     *
     * @param visitPreference the enum object.
     */
    public void addVisitPreference(VisitPreference visitPreference) {

        if (visitingOrderPreferences.size() >= city.getLocationsList().size()) {
            System.out.println("There are no locations left to visit in the city");
            return;
        }

        String type = "location";
        if (visitPreference == VisitPreference.Hotel) type = "hotel";
        if (visitPreference == VisitPreference.Restaurant) type = "restaurant";
        if (visitPreference == VisitPreference.Church) type = "church";
        if (visitPreference == VisitPreference.Museum) type = "museum";

        Location nextLocation = getNextLocationOfType(visitPreference);

        if (nextLocation == null)
            System.out.println("There is no " + type + " left to visit.");
        else {
            visitingOrderPreferences.add(nextLocation);
            System.out.println("Successfully added " + nextLocation.getName() + " to the visiting list");
        }

    }

    /**
     * This method prints the travel plan.
     */
    public void printTravelPlan() {
        System.out.println("The travel plan is:");
        int order = 1;
        for (Location location : visitingOrderPreferences)
            System.out.println(order++ + ". " + location.getName());
        System.out.print("\n");
    }
}

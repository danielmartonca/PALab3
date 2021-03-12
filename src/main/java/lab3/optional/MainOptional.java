package lab3.optional;

import lab3.optional.locations.*;
import lab3.optional.travelplan.TravelPlan;
import lab3.optional.travelplan.VisitPreference;

import java.util.Arrays;

public class MainOptional {

    public static void main(String[] args) {

        //create new objects
        Location v1 = new Hotel("Hotel Continental", 265.00);
        Location v2 = new Museum("Museum of History", "10:00:00", "20:00:00", 5.00);
        Location v3 = new Museum("Museum of Art", "09:00:00", "19:00:00", 7.00);
        Location v4 = new Church("Church1", "08:00:00", "21:00:00");
        Location v5 = new Church("Church2", "08:00:00", "21:00:00");
        Location v6 = new Restaurant("TheBomb", "07:30", "23:00");

        //Set the cost to the other locations
        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v2, 20);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v4, 30);
        v5.setCost(v6, 20);

        //create a city and add locations to it
        City myCity = new City();
        myCity.addLocation(v1);
        myCity.addLocation(v2);
        myCity.addLocation(v3);
        myCity.addLocation(v4);
        myCity.addLocation(v5);
        myCity.addLocation(v6);

        myCity.printVisitableAndPayableLocations();

        System.out.print("\n\n");

        TravelPlan myTravelPlan = new TravelPlan(myCity);
        myTravelPlan.addVisitPreference(VisitPreference.Hotel);
        myTravelPlan.addVisitPreference(VisitPreference.Hotel);
        myTravelPlan.addVisitPreference(VisitPreference.Church);
        myTravelPlan.addVisitPreference(VisitPreference.Church);
        myTravelPlan.addVisitPreference(VisitPreference.Museum);
        myTravelPlan.addVisitPreference(VisitPreference.Restaurant);
        myTravelPlan.addVisitPreference(VisitPreference.Museum);
        myTravelPlan.addVisitPreference(VisitPreference.Museum);

        System.out.print("\n\n");

        myTravelPlan.printTravelPlan();
    }
}

package lab3.compulsory;

import lab3.compulsory.locations.*;

import java.util.Arrays;

public class Main {

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

        System.out.println("City created successfully.");

        //test sorting method
        Location[] locations = {v1, v2, v3, v4, v5, v6};

        System.out.println("Array before sorting is:");
        for (Location location : locations)
            System.out.println(location);

        Arrays.sort(locations);

        System.out.println("\n\nArray after sorting is:");
        for (Location location : locations)
            System.out.println(location);
    }
}

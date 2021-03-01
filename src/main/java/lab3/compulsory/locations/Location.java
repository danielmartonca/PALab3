package lab3.compulsory.locations;

import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Comparable<Location> {

    private String name;
    private Map<Location, Integer> cost;

    public Location(String name, Map<Location, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    @Override
    public int compareTo(Location other) {
        if (name != null)
            return this.name.compareTo(other.name);
        else
            return 0;
    }

}

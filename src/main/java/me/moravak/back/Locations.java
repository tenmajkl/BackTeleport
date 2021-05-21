package me.moravak.back;

import org.bukkit.Location;

import java.util.HashMap;

public class Locations {

    private final HashMap<String, Location> locations;

    public Locations() {
        this.locations = new HashMap<>();
    }

    public Location getLocation(String playerName) {
        Location location = locations.get(playerName);
        return location;
    }

    public void setLocation(String playerName, Location location) {
        locations.put(playerName, location);
    }

}

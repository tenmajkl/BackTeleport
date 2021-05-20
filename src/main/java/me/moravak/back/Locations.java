package me.moravak.back;

import org.bukkit.Location;

import java.util.HashMap;

public class Locations
{
    private static HashMap<String, Location> locations = new HashMap<String, Location>();

    public static Location getLocation(String playerName)
    {
        Location location = locations.get(playerName);
        return location;
    }

    public static void setLocation(String playerName, Location location)
    {
        locations.put(playerName, location);
    }

}

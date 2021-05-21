package me.moravak.back;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Handler {

    private final Locations locations;

    public Handler(Locations locations) {
        this.locations = locations;
    }

    public Location locationHandler(Player player) {
        String name = player.getName();
        Location location = locations.getLocation(name);

        if (location != null) return location;
        else return player.getWorld().getSpawnLocation();
    }

    public void info(Player player) {
        Location location = this.locationHandler(player);
        int cordX = (int) location.getX();
        int cordY = (int) location.getY();
        int cordZ = (int) location.getZ();

        String cords = String.format("%d, %d, %d", cordX, cordY, cordZ);
        String world = location.getWorld() != null ? location.getWorld().getName() : "world";

        Util.sendMessages(player, "Info about location", String.format("Cords: %s", cords), String.format("World: %s", world));
    }


}

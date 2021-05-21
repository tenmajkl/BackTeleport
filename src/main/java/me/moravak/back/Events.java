package me.moravak.back;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class Events implements Listener {

    private final Locations locations;

    public Events(Locations locations) {
        this.locations = locations;
    }

    @EventHandler
    public void onTeleport(PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();
        Location location = event.getFrom();

        locations.setLocation(name, location);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        String name = player.getName();
        Location location = player.getLocation();

        locations.setLocation(name, location);
    }

}

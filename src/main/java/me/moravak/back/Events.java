package me.moravak.back;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class Events implements Listener
{
    @EventHandler
    public void onTeleport(PlayerTeleportEvent event)
    {
        Player player = event.getPlayer();
        String name = player.getName();
        Location location = event.getFrom();

        Locations.setLocation(name, location);

    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event)
    {
        Player player = event.getEntity();
        String name = player.getName();
        Location location = player.getLocation();

        Locations.setLocation(name, location);

    }

}

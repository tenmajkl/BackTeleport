package me.moravak.back;

import me.moravak.back.command.BackCommand;
import me.moravak.back.command.InfoCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private Locations locations;

    public void onEnable() {
        locations = new Locations();
        getServer().getPluginManager().registerEvents(new Events(locations), this);
        getCommand("back").setExecutor(new BackCommand(locations));
        getCommand("backinfo").setExecutor(new InfoCommand(locations));
        getLogger().info("Plugin was enabled.");
    }

    public void onDisable() {
        getLogger().info("Plugin was disabled.");
    }

    public Locations getLocations() {
        return locations;
    }
}

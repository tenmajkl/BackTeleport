package me.moravak.back;


import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public void onEnable()
    {
        System.out.println("Back Enabled!");
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("back").setExecutor(new Commands());
        getCommand("backinfo").setExecutor(new Commands());
    }
    public void onDisable()
    {
        System.out.println("Back Disabled!");
    }
}

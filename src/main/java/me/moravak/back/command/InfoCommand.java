package me.moravak.back.command;

import me.moravak.back.Handler;
import me.moravak.back.Locations;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {

    private final Locations locations;

    public InfoCommand(Locations locations) {
        this.locations = locations;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        new Handler(locations).info(player);
        return false;
    }
}

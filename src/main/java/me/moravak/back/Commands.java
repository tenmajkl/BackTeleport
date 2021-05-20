package me.moravak.back;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("back")) {
            Handler locationHandler= new Handler();
            Player player = (Player) sender;

            Location location = locationHandler.locationHandler(player);
            player.teleport(location);

            return true;
        }

        if (cmd.getName().equalsIgnoreCase("backinfo"))
        {
            Player player = (Player) sender;
            Handler handler = new Handler();

            handler.info(player);

            return true;
        }
        return false;
    }
}

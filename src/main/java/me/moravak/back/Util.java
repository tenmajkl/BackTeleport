package me.moravak.back;

import org.bukkit.entity.Player;

public class Util {

    public static void sendMessages(Player p, String... messages) {
        StringBuilder result = new StringBuilder();
        for (String message : messages) {
            result.append(message).append("\n");
        }
        p.sendMessage(result.toString());
    }

}

package me.kolombo.eventer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;

import java.util.logging.Level;

public interface Logger {
    public default void logAction(Level type, String message) {
        Bukkit.getLogger().log(type, ChatColor.LIGHT_PURPLE + ConfigExtractor.getPluginPrefix() + message);
    }

    public default void logDebug(Level type, String message) {
        Bukkit.getLogger().log(type, ChatColor.BLUE + ConfigExtractor.getPluginPrefix() + " [DEBUG] " + message);
    }
}

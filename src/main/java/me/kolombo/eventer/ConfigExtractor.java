package me.kolombo.eventer;

import org.bukkit.Bukkit;
import org.bukkit.Color;

public interface ConfigExtractor {
    public static String getPluginPrefix() {
        String prefix = "";
        prefix = Eventer.getPlugin(Eventer.class).getConfig().getString("prefix");
        return prefix;
    }

    public static String getEventBase() {
        return Eventer.getPlugin(Eventer.class).getConfig().getString("event-base");
    }

}

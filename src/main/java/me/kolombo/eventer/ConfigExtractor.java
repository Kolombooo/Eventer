package me.kolombo.eventer;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.World;

public interface ConfigExtractor {
    public static String getPluginPrefix() {
        String prefix = "";
        prefix = Eventer.getPlugin(Eventer.class).getConfig().getString("prefix");
        return prefix;
    }

    public static String getEventBase() {
        return Eventer.getPlugin(Eventer.class).getConfig().getString("event-base");
    }

    public static boolean getDebug() {
        return Eventer.getPlugin(Eventer.class).getConfig().getBoolean("debug");
    }

    public static World getEventWorld() {
        String WorldString = Eventer.getPlugin(Eventer.class).getConfig().getString("event-world");
        assert WorldString != null;
        return Bukkit.getWorld(WorldString);
    }

}

package me.kolombo.eventer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Eventer extends JavaPlugin implements ConfigExtractor, Logger {

    @Override
    public void onEnable() {

        boolean DebugMode = getConfig().getBoolean("debug");
        String ConfigVersion = getConfig().getString("config-version");

        logAction(Level.INFO, "Eventer plugin enabled and loaded. Check the plugin info below");
        logAction(Level.INFO, "Debug mode: " + DebugMode);
        logAction(Level.INFO, "Config version: " + ConfigVersion);

        boolean EventActive = false;

    }

    @Override
    public void onDisable() {

        System.out.println("");

    }
}

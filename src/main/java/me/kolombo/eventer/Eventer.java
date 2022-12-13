package me.kolombo.eventer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Eventer extends JavaPlugin {

    @Override
    public void onEnable() {

        boolean DebugMode = getConfig().getBoolean("debug");
        String ConfigVersion = getConfig().getString("config-version");

        Bukkit.getLogger().log(Level.INFO, "Eventer plugin enabled. Welcome!");
        System.out.println("Debug mode: " + DebugMode);
        System.out.println("Config version: " + ConfigVersion);

    }

    @Override
    public void onDisable() {

        System.out.println("");

    }
}

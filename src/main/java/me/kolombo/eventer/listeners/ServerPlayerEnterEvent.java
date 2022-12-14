package me.kolombo.eventer.listeners;

import me.kolombo.eventer.ConfigExtractor;
import me.kolombo.eventer.Logger;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Objects;
import java.util.logging.Level;

public class ServerPlayerEnterEvent implements Logger, ConfigExtractor, Listener {

    @EventHandler
    public void onPlayerServerEnter(PlayerJoinEvent e) {
        if (Objects.equals(ConfigExtractor.getEventBase(), "server")) {
            logAction(Level.INFO, "Player " + e.getPlayer().getName() + " joined the event server.");
        } else if (Objects.equals(ConfigExtractor.getEventBase(), "world")) {
            if (e.getPlayer().getWorld() == ConfigExtractor.getEventWorld()) {
                logAction(Level.INFO, "Player " + e.getPlayer().getName() + " joined into the event world.");
            } else {
                if (ConfigExtractor.getDebug()) {
                    logDebug(Level.INFO, "Player " + e.getPlayer().getName() + " joined, but is not in the event world.");
                    logDebug(Level.INFO, "Location of the player: " + e.getPlayer().getLocation());
                }
            }
        }
    }

}

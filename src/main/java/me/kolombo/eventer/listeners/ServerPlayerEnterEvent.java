package me.kolombo.eventer.listeners;

import me.kolombo.eventer.ConfigExtractor;
import me.kolombo.eventer.Logger;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.logging.Level;

public class ServerPlayerEnterEvent implements Logger, ConfigExtractor {

    @EventHandler
    public void onPlayerServerEnter(PlayerJoinEvent e) {
        if (ConfigExtractor.getEventBase() == "server") {
            logAction(Level.INFO, "Player " + e.getPlayer().getName() + " joined the event server.");
        }
    }

}

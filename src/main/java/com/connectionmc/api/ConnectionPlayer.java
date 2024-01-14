package com.connectionmc.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class ConnectionPlayer {

    private UUID uuid;

    public ConnectionPlayer(UUID uuid) {
        this.uuid = uuid;
    }

    public Player getMinecraftPlayer() {
        return Bukkit.getPlayer(this.uuid);
    }



}

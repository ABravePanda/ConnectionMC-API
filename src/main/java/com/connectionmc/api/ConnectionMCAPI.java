package com.connectionmc.api;

import org.bukkit.World;

import java.util.UUID;

public class ConnectionMCAPI {

    public static void sendPlayerToWorld(ConnectionPlayer connectionPlayer, World world) {

    }

    public static ConnectionPlayer getConnectionMCPlayer(UUID uuid) {
        return new ConnectionPlayer(uuid);
    }
}

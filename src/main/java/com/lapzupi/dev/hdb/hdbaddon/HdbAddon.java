package com.lapzupi.dev.hdb.hdbaddon;

import com.lapzupi.dev.configurablemenus.addons.ItemAddon;
import me.arcaniax.hdb.api.DatabaseLoadEvent;
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class HdbAddon extends ItemAddon implements Listener {
    private HeadDatabaseAPI api;

    @Override
    public ItemStack getItemStack(final String id) {
        return api.getItemHead(id);
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPrefix() {
        return "hdb";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPluginName() {
        return "HeadDatabase";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getAuthor() {
        return "Lapzupi Development Team";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getVersion() {
        return "1.0.2";
    }

    @EventHandler
    public void onDatabaseLoad(DatabaseLoadEvent e) {
        this.api = new HeadDatabaseAPI();
    }

    @Override
    public String getUrl() {
        return "https://github.com/Lapzupi/CM-Hdb-Addon/releases";
    }
}

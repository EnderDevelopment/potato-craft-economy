package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("PotatoCraft plugin has been enabled!");
        // Register commands and events
        this.getCommand("sell").setExecutor(new SellCommand());
        this.getCommand("price").setExecutor(new PriceCommand());
        this.getCommand("market").setExecutor(new MarketCommand());
        this.getCommand("trade").setExecutor(new TradeCommand());
        this.getCommand("powers").setExecutor(new PowersCommand());
        this.getCommand("unlock").setExecutor(new UnlockCommand());
        this.getCommand("boss").setExecutor(new BossCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("PotatoCraft plugin has been disabled!");
    }
}
package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PriceCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length < 2) {
            player.sendMessage("Usage: /price <item> <price>");
            return true;
        }

        String item = args[0];
        String price = args[1];
        // Set item price and announce logic
        player.sendMessage("Price set for " + item + ": " + price);
        return true;
    }
}
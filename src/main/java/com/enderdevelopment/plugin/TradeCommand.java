package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TradeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length < 3) {
            player.sendMessage("Usage: /trade <player> <item> <amount>");
            return true;
        }

        String targetPlayer = args[0];
        String item = args[1];
        String amount = args[2];
        // Player-to-player trade logic
        player.sendMessage("Trade request sent to " + targetPlayer);
        return true;
    }
}
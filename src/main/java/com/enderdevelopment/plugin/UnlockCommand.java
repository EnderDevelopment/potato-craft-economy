package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnlockCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length < 1) {
            player.sendMessage("Usage: /unlock <dimension>");
            return true;
        }

        String dimension = args[0];
        // Unlock new dimension logic
        player.sendMessage("Dimension " + dimension + " unlocked.");
        return true;
    }
}
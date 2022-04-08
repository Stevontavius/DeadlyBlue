package com.breaksapphire.deadlyblue.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WhenPlayerJoins implements Listener {
	
	
	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		p.sendMessage(ChatColor.BLUE + "Whatever you do, don't touch anything that is blue");
		p.sendMessage(ChatColor.BLUE + "Plugin made by BreakSapphire https://github.com/breaksapphire");
	}
}

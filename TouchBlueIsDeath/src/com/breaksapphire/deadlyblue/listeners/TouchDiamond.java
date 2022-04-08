package com.breaksapphire.deadlyblue.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TouchDiamond implements Listener {
	@EventHandler
	public static void touchDiamond(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		int x = p.getLocation().getBlockX();
		int y = p.getLocation().getBlockY();
		int z = p.getLocation().getBlockZ();
		
		Material DO = p.getWorld().getBlockAt(x, y-1, z).getType();
		if (DO == Material.DIAMOND_ORE) {
			p.damage(100);
		}
		
		Material DB = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (DB == Material.DIAMOND_BLOCK) {
			p.damage(100);
		}
		
		Material DDO = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (DDO == Material.DEEPSLATE_DIAMOND_ORE) {
			p.damage(100);
		}
	}
}

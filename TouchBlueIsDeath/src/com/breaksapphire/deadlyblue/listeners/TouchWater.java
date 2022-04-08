package com.breaksapphire.deadlyblue.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TouchWater implements Listener {
	@EventHandler
	public static void touchWater(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		int x = p.getLocation().getBlockX();
		int y = p.getLocation().getBlockY();
		int z = p.getLocation().getBlockZ();
		
		Material Water = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (Water == Material.WATER) {
			p.damage(100);
		}
		
		Material WaterC = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (WaterC == Material.WATER_CAULDRON) {
			p.damage(100);
		}
	}
}

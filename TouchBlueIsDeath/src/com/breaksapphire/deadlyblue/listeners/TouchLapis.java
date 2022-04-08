package com.breaksapphire.deadlyblue.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TouchLapis implements Listener {
	@EventHandler
	public static void touchLapis(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		int x = p.getLocation().getBlockX();
		int y = p.getLocation().getBlockY();
		int z = p.getLocation().getBlockZ();
		
		Material LB = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (LB == Material.LAPIS_BLOCK) {
			p.damage(100);
		}
		
		Material LO = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (LO == Material.LAPIS_ORE) {
			p.damage(100);
		}
		
		Material DLO = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (DLO == Material.DEEPSLATE_LAPIS_ORE) {
			p.damage(100);
		}
	}
}

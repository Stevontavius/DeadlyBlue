package com.breaksapphire.deadlyblue.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TouchBlueBeds implements Listener {
	@EventHandler
	public static void touchBed(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		int x = p.getLocation().getBlockX();
		int y = p.getLocation().getBlockY();
		int z = p.getLocation().getBlockZ();
		
		Material LBB = p.getWorld().getBlockAt(x, y-1, z).getType();
		if (LBB == Material.LIGHT_BLUE_BED) {
			p.damage(100);
		}
		
		Material BB = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (BB == Material.BLUE_BED) {
			p.damage(100);
		}
		
		Material BW = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (BW == Material.BLUE_WOOL) {
			p.damage(100);
		}
		Material DDO = p.getWorld().getBlockAt(x-1, y-1, z-1).getType();
		if (DDO == Material.BLUE_WOOL) {
			p.damage(100);
		}
	}
}

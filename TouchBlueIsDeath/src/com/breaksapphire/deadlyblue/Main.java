/*
 * This is all I had time for
 * I will release updates to this project
 * But for now it will be like this
 * Please let me know if there is any bugs
 * 
 * I ended up doing very time consuming methods to make this work.
 * I tried to make this plugin in less than 2 hours
 * Thanks for understanding
 * 
 * Discord: Sapphire#3391
 * 
 */

package com.breaksapphire.deadlyblue;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.breaksapphire.deadlyblue.listeners.TouchBlueBeds;
import com.breaksapphire.deadlyblue.listeners.TouchDiamond;
import com.breaksapphire.deadlyblue.listeners.TouchLapis;
import com.breaksapphire.deadlyblue.listeners.TouchWater;
import com.breaksapphire.deadlyblue.listeners.WhenPlayerJoins;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		//Player Joining
		getServer().getPluginManager().registerEvents(new WhenPlayerJoins(), this);
		//Blocks not to touch
		getServer().getPluginManager().registerEvents(new TouchWater(), this);
		getServer().getPluginManager().registerEvents(new TouchDiamond(), this);
		getServer().getPluginManager().registerEvents(new TouchLapis(), this);
		getServer().getPluginManager().registerEvents(new TouchBlueBeds(), this);
		//Console
		getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[BLUE IS DEADLY] Plugin Enabled!");
		
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[BLUE IS DEADLY] Plugin Disabled! Hope you had fun! :D");
	}
}

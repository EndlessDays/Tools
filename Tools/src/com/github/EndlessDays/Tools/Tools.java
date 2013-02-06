package com.github.EndlessDays.Tools;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Tools extends JavaPlugin{

	Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable(){
		
		log.info(String.format("[%s] Version: %s - Has Been Enabled!", getDescription().getName(), getDescription().getVersion()));
		
	}
	
	@Override
	public void onDisable(){
		
		log.info(String.format("[%s] Version: %s - Has Been Disabled!", getDescription().getName(), getDescription().getVersion()));
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if (cmd.getName().equalsIgnoreCase("test")){
			
			if (args.length == 1){
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', String.format("&0[&3%s&0]&f Test!", getDescription().getName())));
				return true;
			}
			else{
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', String.format("&0[&3%s&0]&4 Invalid Arguments!", getDescription().getName())));
				return true;
			}
			
		}
		return false;
		
	}
	
}
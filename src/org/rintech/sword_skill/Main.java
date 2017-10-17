package org.rintech.sword_skill;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("プラグインが有効になりましたよー");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("test")) {
			sender.sendMessage("コマンドが実行されましたよー");
		}
	return true;
	}
	
	@Override
	public void onDisable() {
		System.out.println("プラグインが無効になりましたよー");
	}
	
	
}
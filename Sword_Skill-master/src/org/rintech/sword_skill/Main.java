package org.rintech.sword_skill;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getServer().getPluginManager()registerEvents(this,this);
		
		System.out.println("繝励Λ繧ｰ繧､繝ｳ縺梧怏蜉ｹ縺ｫ縺ｪ繧翫∪縺励◆繧医�ｼ");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("test")) {
			sender.sendMessage("繧ｳ繝槭Φ繝峨′螳溯｡後＆繧後∪縺励◆繧医�ｼ");
		}
	return true;
	}
	
	@Override
	public void onDisable() {
		System.out.println("繝励Λ繧ｰ繧､繝ｳ縺檎┌蜉ｹ縺ｫ縺ｪ繧翫∪縺励◆繧医�ｼ");
	}
	
	@EventHandler
	public void onPlayerjoin(PlayerJoinEvent e) {
		e.setJoinMessage(e.getPlayer().getName()+"がログインしたよー");
	
	}
	
	
}
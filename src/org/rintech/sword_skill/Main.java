package org.rintech.sword_skill;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
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

    @EventHandler
  public void onPlayerJoin(BlockBreakEvent e) {
	Block b = e.getBlock();
	if (b.getType() == Material.GLASS) {
		e.setCancelled(true);
		b.setType(Material.GRASS);
	}
	if (b.getType() == Material.GRASS) {
		e.setCancelled(true);
		b.setType(Material.GLASS);
	}
}

	@Override
	public void onDisable() {
		System.out.println("プラグインが無効になりましたよー");
	}


}
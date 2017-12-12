package org.rintech.sword_skill;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		System.out.println("プラグインが有効になりましたよー");
		System.out.println("はいったよー");
		getServer().getPluginManager().registerEvents(this, this);
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
	  System.out.println("イベントだよー2");
	  Block b = e.getBlock();
	if (b.getType() == Material.GRASS) {
		e.setCancelled(true);
		b.setType(Material.GLASS);
	}
	if (b.getType() == Material.GLASS) {
		e.setCancelled(true);
		b.setType(Material.GRASS);
	}
}

    @EventHandler
    public void onLeftClick(PlayerInteractEvent event){
    	System.out.println("イベントだよー");
    	Player player = event.getPlayer();
        Location loc = player.getEyeLocation();
        System.out.println("Xだよー" + loc.getX());
    }


	@Override
	public void onDisable() {
		System.out.println("プラグインが無効になりましたよー");
	}


}
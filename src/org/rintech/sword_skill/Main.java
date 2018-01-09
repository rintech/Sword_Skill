package org.rintech.sword_skill;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
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
    public void onRightClick(PlayerInteractEvent event){
    if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
    	System.out.println("イベントだよー");
    	Player player = event.getPlayer();
        String playername = player.getName();
    	Location loc = player.getEyeLocation();
        System.out.println(playername + "さんのXYZだよー" + loc.getX() +"、"+ loc.getY()+"、"+ loc.getZ());
    }
    else {
<<<<<<< HEAD

=======
    	
    }
>>>>>>> 4e5adf8aec58e4fed3c1c78da9a320af206c4029
    }
    }


	@Override
	public void onDisable() {
		System.out.println("プラグインが無効になりましたよー");
	}


}
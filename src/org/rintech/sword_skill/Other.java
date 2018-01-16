package org.rintech.sword_skill;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Other implements Listener{

	@EventHandler
	public void onExplode(ExplosionPrimeEvent event) {
	   if (event.getEntity().getType()==(EntityType.PRIMED_TNT)) {
		   event.setCancelled(true);
	   }
	   else if (event.getEntity().getType()==(EntityType.CREEPER)) {
      //なんもしねー
   }
}

public void onWalk(PlayerMoveEvent event) {
	Location loc =event.getPlayer().getLocation();
	loc.getWorld().createExplosion(loc.getX(),loc.getY(),loc.getZ(),10,false,false );
	
}}

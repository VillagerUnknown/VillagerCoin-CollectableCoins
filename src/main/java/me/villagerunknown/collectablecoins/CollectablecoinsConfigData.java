package me.villagerunknown.collectablecoins;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "villagerunknown-collectablecoins")
public class CollectablecoinsConfigData implements me.shedaniel.autoconfig.ConfigData {
	
	/**
	 * General
	 */
	
	@ConfigEntry.Category("General")
	public boolean addCollectableCoinsToStructureLootTables = true;
	
	@ConfigEntry.Category("General")
	public boolean addCollectableCoinsToMobDrops = true;
	
}

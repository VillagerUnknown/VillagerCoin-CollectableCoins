package me.villagerunknown.collectablecoins.feature;

import me.villagerunknown.collectablecoins.item.CollectableCoinItems;
import me.villagerunknown.villagercoin.feature.CollectableCoinFeature;

public class CollectableCoinItemsFeature {
	
	public static void execute() {
		CollectableCoinFeature.execute();
		new CollectableCoinItems();
	}
	
}

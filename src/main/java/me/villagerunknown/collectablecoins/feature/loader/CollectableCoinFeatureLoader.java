package me.villagerunknown.collectablecoins.feature.loader;

import me.villagerunknown.collectablecoins.item.CollectableCoinItems;
import me.villagerunknown.villagercoin.feature.CollectableCoinFeature;

public class CollectableCoinFeatureLoader {
	
	public static void execute() {
		CollectableCoinFeature.execute();
		new CollectableCoinItems();
	}
	
}

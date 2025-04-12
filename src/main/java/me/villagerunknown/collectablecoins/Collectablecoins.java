package me.villagerunknown.collectablecoins;

import me.villagerunknown.collectablecoins.feature.MobsDropCollectableCoinsFeature;
import me.villagerunknown.collectablecoins.feature.StructuresIncludeCollectableCoinsFeature;
import me.villagerunknown.collectablecoins.feature.loader.CollectableCoinFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Collectablecoins implements ModInitializer {
	
	public static PlatformMod<CollectablecoinsConfigData> MOD = Platform.register( "collectablecoins", Collectablecoins.class, CollectablecoinsConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static CollectablecoinsConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "collectableCoinFeatureLoader", CollectableCoinFeatureLoader::execute );
		
		featureManager.addFeature( "structuresIncludeCollectableCoins", StructuresIncludeCollectableCoinsFeature::execute );
		featureManager.addFeature( "mobsDropCollectableCoins", MobsDropCollectableCoinsFeature::execute );
	}
	
}

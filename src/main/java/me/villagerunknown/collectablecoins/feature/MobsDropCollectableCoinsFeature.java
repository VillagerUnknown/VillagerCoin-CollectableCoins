package me.villagerunknown.collectablecoins.feature;

import me.villagerunknown.collectablecoins.Collectablecoins;
import me.villagerunknown.collectablecoins.item.CollectableCoinItems;
import me.villagerunknown.villagercoin.feature.MobsDropCoinsFeature;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MobsDropCollectableCoinsFeature {
	
	public static void execute(){
		addCoinsToMobDrops();
	}
	
	private static void addCoinsToMobDrops() {
		ServerLivingEntityEvents.AFTER_DEATH.register((entity, damageSource) -> {
			if( Collectablecoins.CONFIG.addCollectableCoinsToMobDrops ) {
				if( null != damageSource && null != damageSource.getAttacker() ) {
					if( damageSource.getAttacker().isPlayer() ) {
						HashMap<Item, Integer> coins = new HashMap<>();
						
						if( entity.getType().equals( EntityType.PIGLIN ) || entity.getType().equals( EntityType.PIGLIN_BRUTE ) ) {
						
						} else if( MobsDropCoinsFeature.COMMON_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( CollectableCoinItems.COLLECTABLE_COPPER_IRON_GOLEM_COIN, 1 );
						} else if( MobsDropCoinsFeature.RARE_MOB_DROPS.contains( entity.getType() ) ) {
						
						} else if( MobsDropCoinsFeature.EPIC_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( CollectableCoinItems.COLLECTABLE_EMERALD_IRON_GOLEM_COIN, 1 );
						} // if, else if ...
						
						MobsDropCoinsFeature.dropCoins( entity, damageSource, coins );
					} // if
				} // if
			} // if
		});
	}
	
}

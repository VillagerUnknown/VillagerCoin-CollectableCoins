package me.villagerunknown.collectablecoins.feature;

import me.villagerunknown.collectablecoins.Collectablecoins;
import me.villagerunknown.collectablecoins.item.CollectableCoinItems;
import me.villagerunknown.villagercoin.feature.StructuresIncludeCoinsFeature;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class StructuresIncludeCollectableCoinsFeature {
	
	public static void execute(){
		addCoinsToLootTables();
	}
	
	private static void addCoinsToLootTables() {
		LootTableEvents.MODIFY.register((registryKey, lootBuilder, lootTableSource, registryWrapper) -> {
			if( lootTableSource.isBuiltin() && Collectablecoins.CONFIG.addCollectableCoinsToStructureLootTables ) {
				LootPool.Builder poolBuilder = LootPool.builder();

				if( StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES.contains( registryKey ) || StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES.contains( registryKey ) ) {
					poolBuilder
							.with(ItemEntry.builder(CollectableCoinItems.COLLECTABLE_COPPER_IRON_GOLEM_COIN).weight(100))
							.rolls(UniformLootNumberProvider.create(0, 20));
				} // if

//				if( StructuresIncludeCoinsFeature.RARE_LOOT_TABLES.contains( registryKey ) ) {
//					poolBuilder
//							.with(ItemEntry.builder(CollectableCoinFeature.EDIBLE_EMERALD_COIN).weight(3))
//							.rolls(UniformLootNumberProvider.create(0, 7));
//				}  // if

				if( StructuresIncludeCoinsFeature.EPIC_LOOT_TABLES.contains( registryKey ) ) {
					poolBuilder
							.with(ItemEntry.builder(CollectableCoinItems.COLLECTABLE_EMERALD_IRON_GOLEM_COIN).weight(1))
							.rolls(UniformLootNumberProvider.create(0, 1));
				} // if
				
				lootBuilder.pool(poolBuilder);
			} // if
		});
	}
	
}

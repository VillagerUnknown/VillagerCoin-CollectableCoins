package me.villagerunknown.collectablecoins.item;

import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.CollectableCoinFeature;
import net.minecraft.item.Item;

public class CollectableCoinItems {
	
	public static Item COLLECTABLE_COPPER_CREEPER_COIN;
	public static Item COLLECTABLE_COPPER_VILLAGER_COIN;
	public static Item COLLECTABLE_COPPER_ZOMBIE_COIN;
	
	public static Item COLLECTABLE_IRON_GOLEM_COIN;
	public static Item COLLECTABLE_IRON_VEX_COIN;
	
	public static Item COLLECTABLE_GOLD_BLAZE_COIN;
	public static Item COLLECTABLE_GOLD_PIGLIN_COIN;
	
	public static Item COLLECTABLE_EMERALD_CREEPER_COIN;
	public static Item COLLECTABLE_EMERALD_PILLAGER_COIN;
	public static Item COLLECTABLE_EMERALD_SLIME_COIN;
	public static Item COLLECTABLE_EMERALD_VILLAGER_COIN;
	public static Item COLLECTABLE_EMERALD_ZOMBIE_COIN;
	
	public static Item COLLECTABLE_NETHERITE_ENDER_DRAGON_COIN;
	public static Item COLLECTABLE_NETHERITE_ENDERMAN_COIN;
	public static Item COLLECTABLE_NETHERITE_WITHER_COIN;
	
	public CollectableCoinItems() {}
	
	static {
		COLLECTABLE_COPPER_VILLAGER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_copper_" + CoinFeature.COIN_STRING, CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION );
		
		COLLECTABLE_EMERALD_VILLAGER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_emerald_" + CoinFeature.COIN_STRING, CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
	}
	
}

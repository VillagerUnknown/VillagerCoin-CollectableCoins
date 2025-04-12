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
	public static Item COLLECTABLE_IRON_SILVERFISH_COIN;
	
	public static Item COLLECTABLE_GOLD_BLAZE_COIN;
	public static Item COLLECTABLE_GOLD_PIGLIN_COIN;
	public static Item COLLECTABLE_GOLD_GHAST_COIN;
	public static Item COLLECTABLE_GOLD_MAGMA_CUBE_COIN;
	public static Item COLLECTABLE_GOLD_WITHER_COIN;
	
	public static Item COLLECTABLE_EMERALD_CREEPER_COIN;
	public static Item COLLECTABLE_EMERALD_PILLAGER_COIN;
	public static Item COLLECTABLE_EMERALD_SLIME_COIN;
	public static Item COLLECTABLE_EMERALD_VILLAGER_COIN;
	
	public static Item COLLECTABLE_NETHERITE_ENDER_DRAGON_COIN;
	public static Item COLLECTABLE_NETHERITE_ENDERMAN_COIN;
	public static Item COLLECTABLE_NETHERITE_WITHER_COIN;
	
	public CollectableCoinItems() {}
	
	static {
		COLLECTABLE_COPPER_CREEPER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_copper_creeper_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_COPPER_VILLAGER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_copper_" + CoinFeature.COIN_STRING, CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_COPPER_ZOMBIE_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_copper_zombie_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION );
		
		COLLECTABLE_IRON_GOLEM_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_iron_golem_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_IRON_VEX_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_iron_vex_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_IRON_SILVERFISH_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_iron_silverfish_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION );
		
		COLLECTABLE_GOLD_BLAZE_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_gold_blaze_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_GOLD_PIGLIN_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_gold_piglin_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_GOLD_GHAST_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_gold_ghast_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_GOLD_MAGMA_CUBE_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_gold_magma_cube_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_GOLD_WITHER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_gold_wither_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION );
		
		COLLECTABLE_EMERALD_CREEPER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_emerald_creeper_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_EMERALD_PILLAGER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_emerald_pillager_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_EMERALD_SLIME_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_emerald_slime_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_EMERALD_VILLAGER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_emerald_" + CoinFeature.COIN_STRING, CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
		
		COLLECTABLE_NETHERITE_ENDER_DRAGON_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_netherite_ender_dragon_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_NETHERITE_ENDERMAN_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_netherite_enderman_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
		COLLECTABLE_NETHERITE_WITHER_COIN = CollectableCoinFeature.registerCollectableCoinItem( "collectable_netherite_wither_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION );
	}
	
}

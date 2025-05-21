package me.villagerunknown.collectablecoins.item;

import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.CollectableCoinFeature;
import me.villagerunknown.villagercoin.feature.MobsDropCoinsFeature;
import me.villagerunknown.villagercoin.feature.StructuresIncludeCoinsFeature;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTables;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.Set;

public class CollectableCoinItems {
	
	public static final Item COLLECTABLE_COPPER_CAT_COIN;
	public static final Item COLLECTABLE_COPPER_CHICKEN_COIN;
	public static final Item COLLECTABLE_COPPER_CREEPER_COIN;
	public static final Item COLLECTABLE_COPPER_SHEEP_COIN;
	public static final Item COLLECTABLE_COPPER_IRON_GOLEM_COIN;
	public static final Item COLLECTABLE_COPPER_WOLF_COIN;
	public static final Item COLLECTABLE_COPPER_ZOMBIE_COIN;
	
	public static final Item COLLECTABLE_IRON_CAT_COIN;
	public static final Item COLLECTABLE_IRON_CHICKEN_COIN;
	public static final Item COLLECTABLE_IRON_GOLEM_COIN;
	public static final Item COLLECTABLE_IRON_SHEEP_COIN;
	public static final Item COLLECTABLE_IRON_VEX_COIN;
	public static final Item COLLECTABLE_IRON_SILVERFISH_COIN;
	
	public static final Item COLLECTABLE_GOLD_BLAZE_COIN;
	public static final Item COLLECTABLE_GOLD_PIGLIN_COIN;
	public static final Item COLLECTABLE_GOLD_GHAST_COIN;
	public static final Item COLLECTABLE_GOLD_MAGMA_CUBE_COIN;
	public static final Item COLLECTABLE_GOLD_WITHER_COIN;
	
	public static final Item COLLECTABLE_EMERALD_CREEPER_COIN;
	public static final Item COLLECTABLE_EMERALD_PILLAGER_COIN;
	public static final Item COLLECTABLE_EMERALD_SLIME_COIN;
	public static final Item COLLECTABLE_EMERALD_IRON_GOLEM_COIN;
	
	public static final Item COLLECTABLE_NETHERITE_ENDER_DRAGON_COIN;
	public static final Item COLLECTABLE_NETHERITE_ENDERMAN_COIN;
	public static final Item COLLECTABLE_NETHERITE_WITHER_COIN;
	
	public CollectableCoinItems() {}
	
	static {
		COLLECTABLE_COPPER_CAT_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_cat_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_PLAINS_CHEST,LootTables.VILLAGE_DESERT_HOUSE_CHEST,LootTables.VILLAGE_SAVANNA_HOUSE_CHEST,LootTables.VILLAGE_SNOWY_HOUSE_CHEST,LootTables.VILLAGE_TAIGA_HOUSE_CHEST,LootTables.FISHING_TREASURE_GAMEPLAY), Set.of(EntityType.CAT) );
		COLLECTABLE_COPPER_CHICKEN_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_chicken_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_FLETCHER_CHEST), Set.of(EntityType.CHICKEN) );
		COLLECTABLE_COPPER_CREEPER_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_creeper_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.JUNGLE_TEMPLE_CHEST,LootTables.DESERT_PYRAMID_CHEST,LootTables.DESERT_PYRAMID_ARCHAEOLOGY,LootTables.DESERT_WELL_ARCHAEOLOGY), Set.of(EntityType.CREEPER) );
		COLLECTABLE_COPPER_SHEEP_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_sheep_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_SHEPARD_CHEST), Set.of(EntityType.SHEEP) );
		COLLECTABLE_COPPER_IRON_GOLEM_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_iron_golem_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM) );
		COLLECTABLE_COPPER_WOLF_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_wolf_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST), Set.of(EntityType.WOLF) );
		COLLECTABLE_COPPER_ZOMBIE_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_copper_zombie_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.ANCIENT_CITY_CHEST), Set.of(EntityType.ZOMBIE) );
		
		COLLECTABLE_IRON_CAT_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_iron_cat_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_PLAINS_CHEST,LootTables.VILLAGE_DESERT_HOUSE_CHEST,LootTables.VILLAGE_SAVANNA_HOUSE_CHEST,LootTables.VILLAGE_SNOWY_HOUSE_CHEST,LootTables.VILLAGE_TAIGA_HOUSE_CHEST,LootTables.FISHING_TREASURE_GAMEPLAY), Set.of(EntityType.CAT) );
		COLLECTABLE_IRON_CHICKEN_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_iron_chicken_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_FLETCHER_CHEST), Set.of(EntityType.CHICKEN) );
		COLLECTABLE_IRON_GOLEM_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_iron_golem_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM) );
		COLLECTABLE_IRON_SHEEP_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_iron_sheep_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_SHEPARD_CHEST), Set.of(EntityType.SHEEP) );
		COLLECTABLE_IRON_VEX_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_iron_vex_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.WOODLAND_MANSION_CHEST), Set.of(EntityType.VEX) );
		COLLECTABLE_IRON_SILVERFISH_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_iron_silverfish_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.STRONGHOLD_LIBRARY_CHEST), Set.of(EntityType.SILVERFISH) );
		
		COLLECTABLE_GOLD_BLAZE_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_gold_blaze_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.NETHER_BRIDGE_CHEST), Set.of(EntityType.BLAZE) );
		COLLECTABLE_GOLD_PIGLIN_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_gold_piglin_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.BASTION_TREASURE_CHEST), Set.of(EntityType.PIGLIN,EntityType.PIGLIN_BRUTE) );
		COLLECTABLE_GOLD_GHAST_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_gold_ghast_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.GHAST) );
		COLLECTABLE_GOLD_MAGMA_CUBE_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_gold_magma_cube_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.MAGMA_CUBE) );
		COLLECTABLE_GOLD_WITHER_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_gold_wither_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.NETHER_BRIDGE_CHEST), Set.of(EntityType.WITHER,EntityType.WITHER_SKELETON) );
		
		COLLECTABLE_EMERALD_CREEPER_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_emerald_creeper_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.JUNGLE_TEMPLE_CHEST,LootTables.DESERT_PYRAMID_CHEST,LootTables.DESERT_PYRAMID_ARCHAEOLOGY,LootTables.DESERT_WELL_ARCHAEOLOGY), Set.of(EntityType.CREEPER) );
		COLLECTABLE_EMERALD_PILLAGER_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_emerald_pillager_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.PILLAGER_OUTPOST_CHEST,LootTables.WOODLAND_MANSION_CHEST), Set.of(EntityType.PILLAGER) );
		COLLECTABLE_EMERALD_SLIME_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_emerald_slime_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.SLIME) );
		COLLECTABLE_EMERALD_IRON_GOLEM_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_emerald_iron_golem_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM) );
		
		COLLECTABLE_NETHERITE_ENDER_DRAGON_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_netherite_ender_dragon_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.ENDER_DRAGON) );
		COLLECTABLE_NETHERITE_ENDERMAN_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_netherite_enderman_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.END_CITY_TREASURE_CHEST), Set.of(EntityType.ENDERMAN) );
		COLLECTABLE_NETHERITE_WITHER_COIN = CollectableCoinFeature.registerCraftableCollectableCoinItem( Villagercoin.MOD_ID,"collectable_netherite_wither_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.WITHER) );
	}
	
}

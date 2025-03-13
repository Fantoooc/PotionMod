package org.dev.potionmod.chests;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetPotionLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.potion.Potion;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.dev.potionmod.init.PotionInit;

import java.util.List;

public class AddingToChests {
    private static final Identifier ANCIENT_CITY_LOOT_TABLE = Identifier.of("minecraft", "chests/ancient_city");
    private static final Identifier VILLAGE_WEAPONSMITH_CHEST = Identifier.of("minecraft","chests/village/village_weaponsmith");
    private static final Identifier VILLAGE_TOOLSMITH_CHEST = Identifier.of("minecraft","chests/village/village_toolsmith");
    private static final Identifier VILLAGE_ARMORER_CHEST = Identifier.of("minecraft","chests/village/village_armorer");
    private static final Identifier VILLAGE_CARTOGRAPHER_CHEST = Identifier.of("minecraft","chests/village/village_cartographer");
    private static final Identifier VILLAGE_MASON_CHEST = Identifier.of("minecraft","chests/village/village_mason");
    private static final Identifier VILLAGE_SHEPARD_CHEST = Identifier.of("minecraft","chests/village/village_shepherd");
    private static final Identifier VILLAGE_BUTCHER_CHEST = Identifier.of("minecraft","chests/village/village_butcher");
    private static final Identifier VILLAGE_FLETCHER_CHEST = Identifier.of("minecraft","chests/village/village_fletcher");
    private static final Identifier VILLAGE_FISHER_CHEST = Identifier.of("minecraft","chests/village/village_fisher");
    private static final Identifier VILLAGE_TANNERY_CHEST = Identifier.of("minecraft","chests/village/village_tannery");
    private static final Identifier VILLAGE_TEMPLE_CHEST = Identifier.of("minecraft","chests/village/village_temple");
    private static final Identifier VILLAGE_DESERT_HOUSE_CHEST = Identifier.of("minecraft","chests/village/village_desert_house");
    private static final Identifier VILLAGE_PLAINS_CHEST = Identifier.of("minecraft","chests/village/village_plains_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE_CHEST = Identifier.of("minecraft","chests/village/village_taiga_house");
    private static final Identifier VILLAGE_SNOWY_HOUSE_CHEST = Identifier.of("minecraft","chests/village/village_snowy_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_CHEST = Identifier.of("minecraft","chests/village/village_savanna_house");
    private static final Identifier NETHER_BRIDGE_CHEST = Identifier.of("minecraft","chests/nether_bridge");
    private static final Identifier UNDERWATER_RUIN_SMALL_CHEST = Identifier.of("minecraft","chests/underwater_ruin_small");
    private static final Identifier UNDERWATER_RUIN_BIG_CHEST = Identifier.of("minecraft","chests/underwater_ruin_big");
    private static final Identifier SHIPWRECK_SUPPLY_CHEST = Identifier.of("minecraft","chests/shipwreck_supply");
    private static final Identifier FISHING_TREASURE_GAMEPLAY = Identifier.of("minecraft","gameplay/fishing/treasure");
    private static final Identifier ABANDONED_MINESHAFT_CHEST = Identifier.of("minecraft","chests/abandoned_mineshaft");
    private static final Identifier SIMPLE_DUNGEON_CHEST = Identifier.of("minecraft","chests/simple_dungeon");

    public static void init() {}

    public static void add(Identifier loot_table, List<RegistryEntry<Potion>> potions, List<Float> chances) {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (key.getValue().equals(loot_table) && source.isBuiltin()) {
                for (int i = 0; i < potions.size(); i++) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(chances.get(i)))
                            .with(ItemEntry.builder(Items.POTION)
                                .apply(SetPotionLootFunction.builder(potions.get(i))));
                    tableBuilder.pool(poolBuilder);
                }
            }
        });
    }

    static {
        add(ANCIENT_CITY_LOOT_TABLE, List.of(PotionInit.DARKNESS_POTION, PotionInit.LONG_DARKNESS_POTION, PotionInit.BLINDNESS_POTION_L2), List.of(0.4f, 0.25f, 0.25f));
        add(VILLAGE_WEAPONSMITH_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_TOOLSMITH_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_ARMORER_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_CARTOGRAPHER_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_MASON_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_SHEPARD_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_BUTCHER_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_FLETCHER_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_FISHER_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_TANNERY_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_TEMPLE_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_DESERT_HOUSE_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_PLAINS_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_TAIGA_HOUSE_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_SNOWY_HOUSE_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(VILLAGE_SAVANNA_HOUSE_CHEST, List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION), List.of(0.05f, 0.2f, 0.2f));
        add(NETHER_BRIDGE_CHEST, List.of(PotionInit.BLINDNESS_POTION, PotionInit.LONG_BLINDNESS_POTION, PotionInit.BLINDNESS_POTION_L2, PotionInit.UNLUCK_POTION, PotionInit.LONG_UNLUCK_POTION, PotionInit.UNLUCK_POTION_L2), List.of(0.2f, 0.2f, 0.1f, 0.3f, 0.1f, 0.1f));
        add(UNDERWATER_RUIN_SMALL_CHEST, List.of(PotionInit.MINING_FATIGUE_POTION), List.of(0.4f));
        add(UNDERWATER_RUIN_BIG_CHEST, List.of(PotionInit.MINING_FATIGUE_POTION, PotionInit.LONG_MINING_FATIGUE_POTION, PotionInit.MINING_FATIGUE_POTION_L2), List.of(0.4f, 0.4f, 0.2f));
        add(SHIPWRECK_SUPPLY_CHEST, List.of(PotionInit.MINING_FATIGUE_POTION), List.of(0.3f));
        add(FISHING_TREASURE_GAMEPLAY, List.of(PotionInit.LONG_MINING_FATIGUE_POTION), List.of(0.1f));
        add(ABANDONED_MINESHAFT_CHEST, List.of(PotionInit.HASTE_POTION, PotionInit.LONG_HASTE_POTION, PotionInit.HASTE_POTION_L2), List.of(0.3f, 0.3f, 0.1f));
        add(SIMPLE_DUNGEON_CHEST, List.of(PotionInit.HASTE_POTION), List.of(0.2f));
    }
}

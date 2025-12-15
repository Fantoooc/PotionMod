package dev.fantoooc.potionmod.init;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetPotionFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.List;

public class LootTablesEntry {
    public static void init() {}

    public static void add(Identifier loot_table, List<Holder<Potion>> potions, List<Float> chances) {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (key.identifier().equals(loot_table) && source.isBuiltin()) {
                for (int i = 0; i < potions.size(); i++) {
                    LootPool.Builder poolBuilder = LootPool.lootPool()
                            .setRolls(ConstantValue.exactly(1.0f))
                            .conditionally(LootItemRandomChanceCondition.randomChance(chances.get(i)).build())
                            .with(LootItem.lootTableItem(Items.POTION)
                                    .apply(SetPotionFunction.setPotion(potions.get(i))).build());
                    tableBuilder.pool(poolBuilder.build());
                }
            }
        });
    }

    static {
        add(
                Identifier.fromNamespaceAndPath("minecraft", "chests/ancient_city"),
                List.of(PotionInit.DARKNESS_POTION, PotionInit.LONG_DARKNESS_POTION, PotionInit.BLINDNESS_POTION_L2),
                List.of(0.4f, 0.25f, 0.25f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_weaponsmith"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_toolsmith"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_armorer"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_cartographer"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_mason"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_shepherd"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_butcher"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_fletcher"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_fisher"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_tannery"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_temple"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_desert_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_plains_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_taiga_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_snowy_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/village/village_savanna_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/nether_bridge"),
                List.of(PotionInit.BLINDNESS_POTION, PotionInit.LONG_BLINDNESS_POTION, PotionInit.BLINDNESS_POTION_L2, PotionInit.UNLUCK_POTION, PotionInit.LONG_UNLUCK_POTION, PotionInit.UNLUCK_POTION_L2),
                List.of(0.2f, 0.2f, 0.1f, 0.3f, 0.1f, 0.1f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/underwater_ruin_small"),
                List.of(PotionInit.MINING_FATIGUE_POTION),
                List.of(0.4f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/underwater_ruin_big"),
                List.of(PotionInit.MINING_FATIGUE_POTION, PotionInit.LONG_MINING_FATIGUE_POTION, PotionInit.MINING_FATIGUE_POTION_L2),
                List.of(0.4f, 0.4f, 0.2f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/shipwreck_supply"),
                List.of(PotionInit.MINING_FATIGUE_POTION),
                List.of(0.3f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","gameplay/fishing/treasure"),
                List.of(PotionInit.LONG_MINING_FATIGUE_POTION),
                List.of(0.1f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/abandoned_mineshaft"),
                List.of(PotionInit.HASTE_POTION, PotionInit.LONG_HASTE_POTION, PotionInit.HASTE_POTION_L2),
                List.of(0.3f, 0.3f, 0.1f)
        );
        add(
                Identifier.fromNamespaceAndPath("minecraft","chests/simple_dungeon"),
                List.of(PotionInit.HASTE_POTION),
                List.of(0.2f)
        );
    }
}

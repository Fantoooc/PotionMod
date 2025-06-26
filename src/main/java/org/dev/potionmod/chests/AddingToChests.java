package org.dev.potionmod.chests;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
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
    public static void init() {}

    public static void add(Identifier loot_table, List<RegistryEntry<Potion>> potions, List<Float> chances) {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (loot_table.equals(id) && source.isBuiltin()) {
                for (int i = 0; i < potions.size(); i++) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(chances.get(i)))
                            .with(ItemEntry.builder(Items.POTION)
                            .apply(SetPotionLootFunction.builder(potions.get(i).value())));
                    tableBuilder.pool(poolBuilder);
                }
            }
        });
    }

    static {
        add(
                Identifier.of("minecraft", "chests/ancient_city"),
                List.of(PotionInit.DARKNESS_POTION, PotionInit.LONG_DARKNESS_POTION, PotionInit.BLINDNESS_POTION_L2),
                List.of(0.4f, 0.25f, 0.25f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_weaponsmith"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_toolsmith"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_armorer"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_cartographer"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_mason"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_shepherd"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_butcher"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_fletcher"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_fisher"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_tannery"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_temple"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_desert_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_plains_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_taiga_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_snowy_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/village/village_savanna_house"),
                List.of(PotionInit.HERO_POTION, PotionInit.LUCK_POTION, PotionInit.LONG_LUCK_POTION),
                List.of(0.05f, 0.2f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/nether_bridge"),
                List.of(PotionInit.BLINDNESS_POTION, PotionInit.LONG_BLINDNESS_POTION, PotionInit.BLINDNESS_POTION_L2, PotionInit.UNLUCK_POTION, PotionInit.LONG_UNLUCK_POTION, PotionInit.UNLUCK_POTION_L2),
                List.of(0.2f, 0.2f, 0.1f, 0.3f, 0.1f, 0.1f)
        );
        add(
                Identifier.of("minecraft","chests/underwater_ruin_small"),
                List.of(PotionInit.MINING_FATIGUE_POTION),
                List.of(0.4f)
        );
        add(
                Identifier.of("minecraft","chests/underwater_ruin_big"),
                List.of(PotionInit.MINING_FATIGUE_POTION, PotionInit.LONG_MINING_FATIGUE_POTION, PotionInit.MINING_FATIGUE_POTION_L2),
                List.of(0.4f, 0.4f, 0.2f)
        );
        add(
                Identifier.of("minecraft","chests/shipwreck_supply"),
                List.of(PotionInit.MINING_FATIGUE_POTION),
                List.of(0.3f)
        );
        add(
                Identifier.of("minecraft","gameplay/fishing/treasure"),
                List.of(PotionInit.LONG_MINING_FATIGUE_POTION),
                List.of(0.1f)
        );
        add(
                Identifier.of("minecraft","chests/abandoned_mineshaft"),
                List.of(PotionInit.HASTE_POTION, PotionInit.LONG_HASTE_POTION, PotionInit.HASTE_POTION_L2),
                List.of(0.3f, 0.3f, 0.1f)
        );
        add(
                Identifier.of("minecraft","chests/simple_dungeon"),
                List.of(PotionInit.HASTE_POTION),
                List.of(0.2f)
        );
    }
}

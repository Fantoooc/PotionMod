package dev.fantoooc.potionmod.init;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class PotionRecipes {
    public static void recipeRegister() {
        // BLINDNESS POTION
        registerPotionTiers(
                Potions.AWKWARD,
                Items.FLINT,
                PotionInit.BLINDNESS_POTION,
                PotionInit.LONG_BLINDNESS_POTION,
                PotionInit.BLINDNESS_POTION_L2
        );

        // MINING FATIGUE POTION
        registerPotionTiers(
                Potions.AWKWARD,
                Items.CRYING_OBSIDIAN,
                PotionInit.MINING_FATIGUE_POTION,
                PotionInit.LONG_MINING_FATIGUE_POTION,
                PotionInit.MINING_FATIGUE_POTION_L2
        );

        // DARKNESS POTION
        registerPotionTiers(
                Potions.AWKWARD,
                Items.SCULK_SHRIEKER,
                PotionInit.DARKNESS_POTION,
                PotionInit.LONG_DARKNESS_POTION,
                PotionInit.DARKNESS_POTION_L2
        );

        // HASTE POTION
        registerPotionTiers(
                Potions.AWKWARD,
                Items.OBSIDIAN,
                PotionInit.HASTE_POTION,
                PotionInit.LONG_HASTE_POTION,
                PotionInit.HASTE_POTION_L2
        );

        // LUCK POTION
        registerPotionTiers(
                Potions.THICK,
                Items.BLUE_ORCHID,
                PotionInit.LUCK_POTION,
                PotionInit.LONG_LUCK_POTION,
                PotionInit.LUCK_POTION_L2
        );

        // UNLUCK POTION
        registerPotionTiers(
                Potions.THICK,
                Items.WITHER_ROSE,
                PotionInit.UNLUCK_POTION,
                PotionInit.LONG_UNLUCK_POTION,
                PotionInit.UNLUCK_POTION_L2
        );

        // HERO POTION
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Ingredient.of(Items.TOTEM_OF_UNDYING),
                    PotionInit.HERO_POTION
            );
        });
    }


    private static void registerPotionTiers(
            Holder<Potion> basePotion,
            Item ingredient,
            Holder<Potion> baseResult,
            Holder<Potion> longResult,
            Holder<Potion> strongResult
    ) {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    basePotion,
                    Ingredient.of(ingredient),
                    baseResult
            );
            builder.registerPotionRecipe(
                    baseResult,
                    Ingredient.of(Items.REDSTONE),
                    longResult
            );
            builder.registerPotionRecipe(
                    baseResult,
                    Ingredient.of(Items.GLOWSTONE_DUST),
                    strongResult
            );
        });
    }
}

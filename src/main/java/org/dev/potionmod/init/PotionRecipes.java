package org.dev.potionmod.init;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;

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
        FabricBrewingRecipeRegistry
                .registerPotionRecipe(
                        Potions.THICK,
                        Ingredient.ofItems(Items.TOTEM_OF_UNDYING),
                        PotionInit.HERO_POTION.value()
                );
    }


    private static void registerPotionTiers(
            Potion basePotion,
            Item ingredient,
            RegistryEntry<Potion> baseResult,
            RegistryEntry<Potion> longResult,
            RegistryEntry<Potion> strongResult
    ) {
        FabricBrewingRecipeRegistry.registerPotionRecipe(
                basePotion,
                Ingredient.ofItems(ingredient),
                baseResult.value()
        );
        FabricBrewingRecipeRegistry.registerPotionRecipe(
                baseResult.value(),
                Ingredient.ofItems(Items.REDSTONE),
                longResult.value()
        );
        FabricBrewingRecipeRegistry.registerPotionRecipe(
                baseResult.value(),
                Ingredient.ofItems(Items.GLOWSTONE_DUST),
                strongResult.value()
        );
    }
}

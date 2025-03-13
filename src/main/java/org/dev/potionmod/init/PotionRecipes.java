package org.dev.potionmod.init;


import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;

public class PotionRecipes {
    public static void recipeRegister() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            // BLINDNESS POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.FLINT,
                    PotionInit.BLINDNESS_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.BLINDNESS_POTION,
                    Items.REDSTONE,
                    PotionInit.LONG_BLINDNESS_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.BLINDNESS_POTION,
                    Items.GLOWSTONE,
                    PotionInit.BLINDNESS_POTION_L2
            );


            // MINING FATIGUE POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.CRYING_OBSIDIAN,
                    PotionInit.MINING_FATIGUE_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.MINING_FATIGUE_POTION,
                    Items.REDSTONE,
                    PotionInit.LONG_MINING_FATIGUE_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.MINING_FATIGUE_POTION,
                    Items.GLOWSTONE,
                    PotionInit.MINING_FATIGUE_POTION_L2
            );


            // DARKNESS POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.SCULK_SHRIEKER,
                    PotionInit.DARKNESS_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.DARKNESS_POTION,
                    Items.REDSTONE,
                    PotionInit.LONG_DARKNESS_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.DARKNESS_POTION,
                    Items.GLOWSTONE,
                    PotionInit.DARKNESS_POTION_L2
            );


            // HASTE POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.OBSIDIAN,
                    PotionInit.HASTE_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.HASTE_POTION,
                    Items.REDSTONE,
                    PotionInit.LONG_HASTE_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.HASTE_POTION,
                    Items.GLOWSTONE,
                    PotionInit.HASTE_POTION_L2
            );


            // LUCK POTION
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Items.BLUE_ORCHID,
                    PotionInit.LUCK_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.LUCK_POTION,
                    Items.REDSTONE,
                    PotionInit.LONG_LUCK_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.LUCK_POTION,
                    Items.GLOWSTONE,
                    PotionInit.LUCK_POTION_L2
            );


            // UNLUCK POTION
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Items.WITHER_ROSE,
                    PotionInit.UNLUCK_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.UNLUCK_POTION,
                    Items.REDSTONE,
                    PotionInit.LONG_UNLUCK_POTION
            );
            builder.registerPotionRecipe(
                    PotionInit.UNLUCK_POTION,
                    Items.GLOWSTONE,
                    PotionInit.UNLUCK_POTION_L2
            );


            // HERO POTION
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Items.TOTEM_OF_UNDYING,
                    PotionInit.HERO_POTION
            );
        });
    }
}

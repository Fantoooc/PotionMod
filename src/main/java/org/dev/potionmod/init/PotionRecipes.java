package org.dev.potionmod.init;


import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;

public class PotionRecipes {
    public static void recipeRegister() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            // BLINDNESS POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.FLINT,
                    Registries.POTION.getEntry(PotionInit.BLINDNESS_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.BLINDNESS_POTION),
                    Items.REDSTONE,
                    Registries.POTION.getEntry(PotionInit.LONG_BLINDNESS_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.BLINDNESS_POTION),
                    Items.GLOWSTONE,
                    Registries.POTION.getEntry(PotionInit.BLINDNESS_POTION_L2)
            );


            // MINING FATIGUE POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.CRYING_OBSIDIAN,
                    Registries.POTION.getEntry(PotionInit.MINING_FATIGUE_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.MINING_FATIGUE_POTION),
                    Items.REDSTONE,
                    Registries.POTION.getEntry(PotionInit.LONG_MINING_FATIGUE_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.MINING_FATIGUE_POTION),
                    Items.GLOWSTONE,
                    Registries.POTION.getEntry(PotionInit.MINING_FATIGUE_POTION_L2)
            );


            // DARKNESS POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.SCULK_SHRIEKER,
                    Registries.POTION.getEntry(PotionInit.DARKNESS_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.DARKNESS_POTION),
                    Items.REDSTONE,
                    Registries.POTION.getEntry(PotionInit.LONG_DARKNESS_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.DARKNESS_POTION),
                    Items.GLOWSTONE,
                    Registries.POTION.getEntry(PotionInit.DARKNESS_POTION_L2)
            );


            // HASTE POTION
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.OBSIDIAN,
                    Registries.POTION.getEntry(PotionInit.HASTE_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.HASTE_POTION),
                    Items.REDSTONE,
                    Registries.POTION.getEntry(PotionInit.LONG_HASTE_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.HASTE_POTION),
                    Items.GLOWSTONE,
                    Registries.POTION.getEntry(PotionInit.HASTE_POTION_L2)
            );


            // LUCK POTION
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Items.BLUE_ORCHID,
                    Registries.POTION.getEntry(PotionInit.LUCK_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.LUCK_POTION),
                    Items.REDSTONE,
                    Registries.POTION.getEntry(PotionInit.LONG_LUCK_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.LUCK_POTION),
                    Items.GLOWSTONE,
                    Registries.POTION.getEntry(PotionInit.LUCK_POTION_L2)
            );


            // UNLUCK POTION
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Items.WITHER_ROSE,
                    Registries.POTION.getEntry(PotionInit.UNLUCK_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.UNLUCK_POTION),
                    Items.REDSTONE,
                    Registries.POTION.getEntry(PotionInit.LONG_UNLUCK_POTION)
            );
            builder.registerPotionRecipe(
                    Registries.POTION.getEntry(PotionInit.UNLUCK_POTION),
                    Items.GLOWSTONE,
                    Registries.POTION.getEntry(PotionInit.UNLUCK_POTION_L2)
            );


            // HERO POTION
            builder.registerPotionRecipe(
                    Potions.THICK,
                    Items.TOTEM_OF_UNDYING,
                    Registries.POTION.getEntry(PotionInit.HERO_POTION)
            );
        });
    }
}

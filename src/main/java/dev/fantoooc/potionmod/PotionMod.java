package dev.fantoooc.potionmod;

import dev.fantoooc.potionmod.init.LootTablesEntry;
import dev.fantoooc.potionmod.init.PotionInit;
import dev.fantoooc.potionmod.init.PotionRecipes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotionMod implements ModInitializer {
    public static final String MOD_ID = "potionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        PotionInit.registerPotions();
        PotionRecipes.recipeRegister();
        LootTablesEntry.init();
        LOGGER.info("Loading...");
    }

    public static Identifier id(String path) { return Identifier.fromNamespaceAndPath(MOD_ID, path); }
}

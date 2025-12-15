package org.dev.potionmod;

import net.minecraft.util.Identifier;
import org.dev.potionmod.chests.AddingToChests;
import org.dev.potionmod.init.PotionInit;
import org.dev.potionmod.init.PotionRecipes;
import org.dev.potionmod.list.EffectsList;
import org.slf4j.Logger;
import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;


public class PotionMod implements ModInitializer {
	public static final String MOD_ID = "potionmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EffectsList.Effects();
		PotionInit.registerPotions();
		PotionRecipes.recipeRegister();
		AddingToChests.init();
		LOGGER.info("Loading...");
	}

	public static Identifier id(String path) { return  Identifier.of(MOD_ID, path); }
}
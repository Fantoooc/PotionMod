package org.dev.potionmod.init;

import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import org.dev.potionmod.PotionMod;

import static org.dev.potionmod.list.EffectsList.*;

public class PotionInit {
    public static final RegistryEntry<Potion> BLINDNESS_POTION;
    public static final RegistryEntry<Potion> LONG_BLINDNESS_POTION;
    public static final RegistryEntry<Potion> BLINDNESS_POTION_L2;

    public static final RegistryEntry<Potion> DARKNESS_POTION;
    public static final RegistryEntry<Potion> LONG_DARKNESS_POTION;
    public static final RegistryEntry<Potion> DARKNESS_POTION_L2;

    public static final RegistryEntry<Potion> MINING_FATIGUE_POTION;
    public static final RegistryEntry<Potion> LONG_MINING_FATIGUE_POTION;
    public static final RegistryEntry<Potion> MINING_FATIGUE_POTION_L2;

    public static final RegistryEntry<Potion> HASTE_POTION;
    public static final RegistryEntry<Potion> LONG_HASTE_POTION;
    public static final RegistryEntry<Potion> HASTE_POTION_L2;

    public static final RegistryEntry<Potion> LUCK_POTION;
    public static final RegistryEntry<Potion> LONG_LUCK_POTION;
    public static final RegistryEntry<Potion> LUCK_POTION_L2;

    public static final RegistryEntry<Potion> UNLUCK_POTION;
    public static final RegistryEntry<Potion> LONG_UNLUCK_POTION;
    public static final RegistryEntry<Potion> UNLUCK_POTION_L2;

    public static final RegistryEntry<Potion> HERO_POTION;

    public static RegistryEntry<Potion> register(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, PotionMod.id(name), potion);
    }

    public static void registerPotions() {}

    static {
        BLINDNESS_POTION = register("blindness_potion", BLINDNESS);
        LONG_BLINDNESS_POTION = register("long_blindness_potion", LONG_BLINDNESS);
        BLINDNESS_POTION_L2 = register("blindness_potion_l2", BLINDNESS_L2);

        MINING_FATIGUE_POTION = register("mining_fatigue_potion", MINING_FATIGUE);
        LONG_MINING_FATIGUE_POTION = register("long_mining_fatigue_potion", LONG_MINING_FATIGUE);
        MINING_FATIGUE_POTION_L2 = register("mining_fatigue_potion_l2", MINING_FATIGUE_L2);

        DARKNESS_POTION = register("darkness_potion", DARKNESS);
        LONG_DARKNESS_POTION = register("long_darkness_potion", LONG_DARKNESS);
        DARKNESS_POTION_L2 = register("darkness_potion_l2", DARKNESS_L2);

        HASTE_POTION = register("haste_potion", HASTE);
        LONG_HASTE_POTION = register("long_haste_potion", LONG_HASTE);
        HASTE_POTION_L2 = register("haste_potion_l2", HASTE_L2);

        LUCK_POTION = register("luck_potion", LUCK);
        LONG_LUCK_POTION = register("long_luck_potion", LONG_LUCK);
        LUCK_POTION_L2 = register("luck_potion_l2", LUCK_L2);

        UNLUCK_POTION = register("unluck_potion", UNLUCK);
        LONG_UNLUCK_POTION = register("long_unluck_potion", LONG_UNLUCK);
        UNLUCK_POTION_L2 = register("unluck_potion_l2", UNLUCK_L2);

        HERO_POTION = register("hero_potion", HERO);
    }
}
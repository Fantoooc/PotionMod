package dev.fantoooc.potionmod.init;


import dev.fantoooc.potionmod.PotionMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class PotionInit {
    public static final Holder<Potion> BLINDNESS_POTION;
    public static final Holder<Potion> LONG_BLINDNESS_POTION;
    public static final Holder<Potion> BLINDNESS_POTION_L2;

    public static final Holder<Potion> DARKNESS_POTION;
    public static final Holder<Potion> LONG_DARKNESS_POTION;
    public static final Holder<Potion> DARKNESS_POTION_L2;

    public static final Holder<Potion> MINING_FATIGUE_POTION;
    public static final Holder<Potion> LONG_MINING_FATIGUE_POTION;
    public static final Holder<Potion> MINING_FATIGUE_POTION_L2;

    public static final Holder<Potion> HASTE_POTION;
    public static final Holder<Potion> LONG_HASTE_POTION;
    public static final Holder<Potion> HASTE_POTION_L2;

    public static final Holder<Potion> LUCK_POTION;
    public static final Holder<Potion> LONG_LUCK_POTION;
    public static final Holder<Potion> LUCK_POTION_L2;

    public static final Holder<Potion> UNLUCK_POTION;
    public static final Holder<Potion> LONG_UNLUCK_POTION;
    public static final Holder<Potion> UNLUCK_POTION_L2;

    public static final Holder<Potion> HERO_POTION;

    public static Holder<Potion> register(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, PotionMod.id(name), potion);
    }

    public static void registerPotions() {}

    static {
        BLINDNESS_POTION = register("blindness_potion", new Potion("blindness", new MobEffectInstance(MobEffects.BLINDNESS, 20 * 45, 0)));
        LONG_BLINDNESS_POTION = register("long_blindness_potion", new Potion("blindness", new MobEffectInstance(MobEffects.BLINDNESS, 20 * 90, 0)));
        BLINDNESS_POTION_L2 = register("blindness_potion_l2", new Potion("blindness", new MobEffectInstance(MobEffects.BLINDNESS, 20 * 25, 1)));

        MINING_FATIGUE_POTION = register("mining_fatigue_potion", new Potion("mining_fatigue", new MobEffectInstance(MobEffects.MINING_FATIGUE, 20 * 45, 0)));
        LONG_MINING_FATIGUE_POTION = register("long_mining_fatigue_potion", new Potion("mining_fatigue", new MobEffectInstance(MobEffects.MINING_FATIGUE, 20 * 90, 0)));
        MINING_FATIGUE_POTION_L2 = register("mining_fatigue_potion_l2", new Potion("mining_fatigue", new MobEffectInstance(MobEffects.MINING_FATIGUE, 20 * 25, 1)));

        DARKNESS_POTION = register("darkness_potion", new Potion("darkness", new MobEffectInstance(MobEffects.DARKNESS, 20 * 45)));
        LONG_DARKNESS_POTION = register("long_darkness_potion", new Potion("darkness", new MobEffectInstance(MobEffects.DARKNESS, 20 * 90, 0)));
        DARKNESS_POTION_L2 = register("darkness_potion_l2", new Potion("darkness", new MobEffectInstance(MobEffects.DARKNESS, 20 * 25, 1)));

        HASTE_POTION = register("haste_potion", new Potion("haste", new MobEffectInstance(MobEffects.HASTE, 20 * 45, 0)));
        LONG_HASTE_POTION = register("long_haste_potion", new Potion("haste", new MobEffectInstance(MobEffects.HASTE, 20 * 90, 0)));
        HASTE_POTION_L2 = register("haste_potion_l2", new Potion("haste", new MobEffectInstance(MobEffects.HASTE, 20 * 25, 1)));

        LUCK_POTION = register("luck_potion", new Potion("luck", new MobEffectInstance(MobEffects.LUCK, 20 * 180, 0)));
        LONG_LUCK_POTION = register("long_luck_potion", new Potion("luck", new MobEffectInstance(MobEffects.LUCK, 20 * 480, 0)));
        LUCK_POTION_L2 = register("luck_potion_l2", new Potion("luck", new MobEffectInstance(MobEffects.LUCK, 20 * 120, 1)));

        UNLUCK_POTION = register("unluck_potion", new Potion("unluck", new MobEffectInstance(MobEffects.UNLUCK, 20 * 90, 0)));
        LONG_UNLUCK_POTION = register("long_unluck_potion", new Potion("unluck", new MobEffectInstance(MobEffects.UNLUCK, 20 * 180, 0)));
        UNLUCK_POTION_L2 = register("unluck_potion_l2", new Potion("unluck", new MobEffectInstance(MobEffects.UNLUCK, 20 * 120, 1)));

        HERO_POTION = register("hero_potion", new Potion("hero_of_village", new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 20 * 480, 0)));
    }
}
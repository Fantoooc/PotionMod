package org.dev.potionmod.list;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;

public class EffectsList {
    public static Potion BLINDNESS = new Potion("blindness", new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 45, 0));
    public static Potion LONG_BLINDNESS = new Potion("blindness", new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 90, 0));
    public static Potion BLINDNESS_L2 = new Potion("blindness", new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 25, 1));

    public static Potion HASTE = new Potion("haste", new StatusEffectInstance(StatusEffects.HASTE, 20 * 45, 0));
    public static Potion LONG_HASTE = new Potion("haste", new StatusEffectInstance(StatusEffects.HASTE, 20 * 90, 0));
    public static Potion HASTE_L2 = new Potion("haste", new StatusEffectInstance(StatusEffects.HASTE, 20 * 25, 1));

    public static Potion MINING_FATIGUE = new Potion("mining_fatigue", new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 45, 0));
    public static Potion LONG_MINING_FATIGUE = new Potion("mining_fatigue", new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 90, 0));
    public static Potion MINING_FATIGUE_L2 = new Potion("mining_fatigue", new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 25, 1));

    public static Potion LUCK = new Potion("luck", new StatusEffectInstance(StatusEffects.LUCK, 20 * 180, 0));
    public static Potion LONG_LUCK = new Potion("luck", new StatusEffectInstance(StatusEffects.LUCK, 20 * 480, 0));
    public static Potion LUCK_L2 = new Potion("luck", new StatusEffectInstance(StatusEffects.LUCK, 20 * 120, 1));

    public static Potion UNLUCK = new Potion("unluck", new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 180, 0));
    public static Potion LONG_UNLUCK = new Potion("unluck", new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 480, 0));
    public static Potion UNLUCK_L2 = new Potion("unluck", new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 120, 1));

    public static Potion DARKNESS = new Potion("darkness", new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 45));
    public static Potion LONG_DARKNESS = new Potion("darkness", new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 90, 0));
    public static Potion DARKNESS_L2 = new Potion("darkness", new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 25, 1));

    public static Potion HERO = new Potion("hero_of_village", new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 20 * 480, 0));
}

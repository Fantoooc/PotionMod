package org.dev.potionmod.list;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class EffectsList {
    public static StatusEffectInstance BLINDNESS = new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 45, 0);
    public static StatusEffectInstance LONG_BLINDNESS = new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 90, 0);
    public static StatusEffectInstance BLINDNESS_L2 = new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 25, 1);

    public static StatusEffectInstance HASTE = new StatusEffectInstance(StatusEffects.HASTE, 20 * 45, 0);
    public static StatusEffectInstance LONG_HASTE = new StatusEffectInstance(StatusEffects.HASTE, 20 * 90, 0);
    public static StatusEffectInstance HASTE_L2 = new StatusEffectInstance(StatusEffects.HASTE, 20 * 25, 1);

    public static StatusEffectInstance MINING_FATIGUE = new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 45, 0);
    public static StatusEffectInstance LONG_MINING_FATIGUE = new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 90, 0);
    public static StatusEffectInstance MINING_FATIGUE_L2 = new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 25, 1);

    public static StatusEffectInstance LUCK = new StatusEffectInstance(StatusEffects.LUCK, 20 * 180, 0);
    public static StatusEffectInstance LONG_LUCK = new StatusEffectInstance(StatusEffects.LUCK, 20 * 480, 0);
    public static StatusEffectInstance LUCK_L2 = new StatusEffectInstance(StatusEffects.LUCK, 20 * 120, 1);

    public static StatusEffectInstance UNLUCK = new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 180, 0);
    public static StatusEffectInstance LONG_UNLUCK = new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 480, 0);
    public static StatusEffectInstance UNLUCK_L2 = new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 120, 1);

    public static StatusEffectInstance DARKNESS = new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 45);
    public static StatusEffectInstance LONG_DARKNESS = new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 90, 0);
    public static StatusEffectInstance DARKNESS_L2 = new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 25, 1);

    public static StatusEffectInstance HERO = new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 20 * 480, 0);
}

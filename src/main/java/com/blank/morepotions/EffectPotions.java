package com.blank.morepotions;

import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class EffectPotions {

    // Haste Potions
    public static final PotionType HASTE0 = new PotionType("haste_mild", new PotionEffect(
            MobEffects.HASTE, 12000, 0)).setRegistryName("haste_mild");
    public static final PotionType HASTE1 = new PotionType("haste_normal", new PotionEffect(
            MobEffects.HASTE, 12000, 1)).setRegistryName("haste_normal");
    public static final PotionType HASTE2 = new PotionType("haste_strong", new PotionEffect(
            MobEffects.HASTE, 12000, 2)).setRegistryName("haste_strong");

    // Combat Potions
    public static final PotionType HEALTH_BOOST = new PotionType("health_boost", new PotionEffect(
            MobEffects.HEALTH_BOOST, 9600, 1)).setRegistryName("health_boost");
    public static final PotionType FIGHTING = new PotionType("fighting", new PotionEffect(
            MobEffects.HEALTH_BOOST, 9600, 1), new PotionEffect(MobEffects.RESISTANCE, 9600,
            2)).setRegistryName("fighting");

    public static void registerPotionTypes() {
        final PotionType[] types = new PotionType[]{
                HASTE0, HASTE1, HASTE2,
                HEALTH_BOOST, FIGHTING
        };

        for (PotionType pType : types) {
            ForgeRegistries.POTION_TYPES.register(pType);
        }
    }

    public static void registerRecipes() {
        PotionHelper.addMix(PotionTypes.STRONG_SWIFTNESS, Items.IRON_INGOT, HASTE0);
        PotionHelper.addMix(PotionTypes.STRONG_SWIFTNESS, Items.GOLD_INGOT, HASTE1);
        PotionHelper.addMix(PotionTypes.STRONG_SWIFTNESS, Items.DIAMOND, HASTE2);

        PotionHelper.addMix(PotionTypes.REGENERATION, Items.COOKED_BEEF, HEALTH_BOOST);
        PotionHelper.addMix(PotionTypes.STRENGTH, Items.IRON_SWORD, FIGHTING);
    }
}

package com.blank.morepotions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MorePotions.MODID, name = MorePotions.NAME, version = MorePotions.VERSION)
public class MorePotions
{
    public static final String MODID = "morepotions";
    public static final String NAME = "More Potions";
    public static final String VERSION = "1.0.0";

    private static final Logger logger = LogManager.getLogger(MorePotions.MODID);

    @EventHandler
    public void init(FMLInitializationEvent event) {
        EffectPotions.registerPotionTypes();
        EffectPotions.registerRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(MorePotions.NAME + " initialized");
    }
}

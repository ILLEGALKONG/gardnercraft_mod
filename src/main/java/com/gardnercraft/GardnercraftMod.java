package com.gardnercraft;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GardnercraftMod implements ModInitializer {

    public static final String MOD_ID = "gardnercraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        PolymerResourcePackUtils.addModAssets(MOD_ID);
        LOGGER.info("Gardnercraft mod loaded.");
    }
}

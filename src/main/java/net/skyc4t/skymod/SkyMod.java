package net.skyc4t.skymod;

import net.fabricmc.api.ModInitializer;

import net.skyc4t.skymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyMod implements ModInitializer {
	public static final String MOD_ID = "skymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}
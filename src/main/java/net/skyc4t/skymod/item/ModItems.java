package net.skyc4t.skymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.skyc4t.skymod.SkyMod;

public class ModItems {
    public static final Item RED_RUBY = registerItem("red_ruby", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SkyMod.MOD_ID,"red_ruby")))));
    public static final Item RAW_RED_RUBY = registerItem("raw_red_ruby", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SkyMod.MOD_ID,"raw_red_ruby")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkyMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SkyMod.LOGGER.info("Registering Mod Items for: " + SkyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RED_RUBY);
            entries.add(RAW_RED_RUBY);
        });
    }
}

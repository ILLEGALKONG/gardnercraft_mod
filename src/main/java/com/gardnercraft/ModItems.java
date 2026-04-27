package com.gardnercraft;

import com.gardnercraft.item.GardnercraftItem;
import com.gardnercraft.item.GardnercraftTrimTemplateItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ModItems {

    public static final GardnercraftItem THE_GARDNERCRAFT = register(
            "the_gardnercraft",
            key -> new GardnercraftItem(new Item.Settings().maxCount(1).registryKey(key))
    );

    public static final GardnercraftTrimTemplateItem GARDNERCRAFT_ARMOR_TRIM_SMITHING_TEMPLATE = register(
            "gardnercraft_armor_trim_smithing_template",
            key -> new GardnercraftTrimTemplateItem(new Item.Settings()
                    .maxCount(64)
                    .registryKey(key)
                    .rarity(Rarity.EPIC)
            )
    );

    private static <T extends Item> T register(String name, Function<RegistryKey<Item>, T> factory) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GardnercraftMod.MOD_ID, name));
        return Registry.register(Registries.ITEM, key, factory.apply(key));
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(THE_GARDNERCRAFT);
            entries.add(GARDNERCRAFT_ARMOR_TRIM_SMITHING_TEMPLATE);
        });
    }
}

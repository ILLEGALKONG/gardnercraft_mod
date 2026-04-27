package com.gardnercraft.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.nucleoid.packettweaker.PacketContext;

import java.util.List;

public class GardnercraftTrimTemplateItem extends SmithingTemplateItem implements PolymerItem {

    public GardnercraftTrimTemplateItem(Settings settings) {
        super(
            Text.empty(),
            Text.empty(),
            Text.empty(),
            Text.empty(),
            List.of(
                Identifier.of("minecraft", "item/empty_armor_slot_helmet"),
                Identifier.of("minecraft", "item/empty_armor_slot_chestplate"),
                Identifier.of("minecraft", "item/empty_armor_slot_leggings"),
                Identifier.of("minecraft", "item/empty_armor_slot_boots")
            ),
            List.of(
                Identifier.of("minecraft", "item/quartz"),
                Identifier.of("minecraft", "item/iron_ingot"),
                Identifier.of("minecraft", "item/gold_ingot"),
                Identifier.of("minecraft", "item/diamond"),
                Identifier.of("minecraft", "item/netherite_ingot"),
                Identifier.of("minecraft", "item/redstone"),
                Identifier.of("minecraft", "item/copper_ingot"),
                Identifier.of("minecraft", "item/emerald"),
                Identifier.of("minecraft", "item/lapis_lazuli"),
                Identifier.of("minecraft", "item/amethyst_shard")
            ),
            settings
        );
    }

    @Override
    public Item getPolymerItem(ItemStack stack, PacketContext context) {
        return Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE;
    }
}

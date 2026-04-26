package com.gardnercraft.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import xyz.nucleoid.packettweaker.PacketContext;

public class GardnercraftItem extends Item implements PolymerItem {

    public GardnercraftItem(Settings settings) {
        super(settings);
    }

    @Override
    public Text getName(ItemStack stack) {
        return Text.literal("The Gardnercraft").formatted(Formatting.LIGHT_PURPLE);
    }

    @Override
    public Item getPolymerItem(ItemStack stack, PacketContext context) {
        return Items.NETHER_STAR;
    }
}

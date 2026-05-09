package com.gardnercraft.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import xyz.nucleoid.packettweaker.PacketContext;

public class GardnercraftMusicDiscItem extends Item implements PolymerItem {

    public GardnercraftMusicDiscItem(Settings settings) {
        super(settings);
    }

    @Override
    public Item getPolymerItem(ItemStack stack, PacketContext context) {
        return Items.MUSIC_DISC_CAT;
    }
}

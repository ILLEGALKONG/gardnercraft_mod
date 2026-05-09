package com.gardnercraft;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public final class ModSounds {

    public static final Identifier MUSIC_DISC_GARDNERCRAFT_ID = Identifier.of(
            GardnercraftMod.MOD_ID,
            "music_disc.gardnercraft"
    );
    public static final RegistryKey<JukeboxSong> GARDNERCRAFT_JUKEBOX_SONG = RegistryKey.of(
            RegistryKeys.JUKEBOX_SONG,
            Identifier.of(GardnercraftMod.MOD_ID, "gardnercraft")
    );
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_GARDNERCRAFT = registerReference(
            MUSIC_DISC_GARDNERCRAFT_ID
    );

    private ModSounds() {
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void initialize() {
    }
}

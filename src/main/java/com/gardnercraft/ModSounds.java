package com.gardnercraft;

import eu.pb4.polymer.core.api.other.PolymerSoundEvent;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
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
        RegistryEntry.Reference<SoundEvent> reference = Registry.registerReference(
                Registries.SOUND_EVENT,
                id,
                SoundEvent.of(id)
        );
        PolymerSoundEvent.registerOverlay(
                reference.value(),
                SoundEvents.MUSIC_DISC_CAT,
                PolymerResourcePackUtils.getMainUuid()
        );
        return reference;
    }

    public static void initialize() {
    }
}

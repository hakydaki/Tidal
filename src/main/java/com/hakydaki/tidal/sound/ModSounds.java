package com.hakydaki.tidal.sound;

import com.hakydaki.tidal.Tidal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
        public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
                DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Tidal.MOD_ID);

        public static RegistryObject<SoundEvent> BEAUTIFUL_RUIN = registerSoundEvent("beautiful_ruin");

        private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
            return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Tidal.MOD_ID, name)));
        }

        public static void register(IEventBus eventBus) {
            SOUND_EVENTS.register(eventBus);
        }
 }

package com.hakydaki.tidal.entity;

import com.hakydaki.tidal.Tidal;
import com.hakydaki.tidal.entity.custom.KoiEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TidalEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Tidal.MOD_ID);

    public static final RegistryObject<EntityType<KoiEntity>> KOI =
            ENTITY_TYPES.register("koi",
                    () -> EntityType.Builder.of(KoiEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(Tidal.MOD_ID, "koi").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

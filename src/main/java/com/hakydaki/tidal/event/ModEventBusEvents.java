package com.hakydaki.tidal.event;

import com.hakydaki.tidal.Tidal;
import com.hakydaki.tidal.entity.TidalEntityTypes;
import com.hakydaki.tidal.entity.custom.KoiEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tidal.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(TidalEntityTypes.KOI.get(), KoiEntity.setAttributes());
    }
}

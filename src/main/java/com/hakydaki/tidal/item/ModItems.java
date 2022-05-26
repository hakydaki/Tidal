package com.hakydaki.tidal.item;

import com.hakydaki.tidal.Tidal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tidal.MOD_ID);

    public static final RegistryObject<Item> FISH_KOI = ITEMS.register("fish_koi",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TIDAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

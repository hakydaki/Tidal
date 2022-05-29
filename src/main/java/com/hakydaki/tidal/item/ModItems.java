package com.hakydaki.tidal.item;

import com.hakydaki.tidal.Tidal;
import com.hakydaki.tidal.entity.TidalEntityTypes;
import com.hakydaki.tidal.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tidal.MOD_ID);

    public static final RegistryObject<Item> FISH_KOI = ITEMS.register("fish_koi",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TIDAL_TAB)));

    public static final RegistryObject<Item> DISC_DESPAIR = ITEMS.register("disc_despair",
            () -> new RecordItem(4, ModSounds.BEAUTIFUL_RUIN,
                    new Item.Properties().tab(ModCreativeModeTab.TIDAL_TAB).stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> KOI_SPAWN_EGG = ITEMS.register("koi_spawn_egg",
            () -> new ForgeSpawnEggItem(TidalEntityTypes.KOI, 0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.TIDAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

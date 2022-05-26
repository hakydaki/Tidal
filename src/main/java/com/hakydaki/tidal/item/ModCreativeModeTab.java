package com.hakydaki.tidal.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TIDAL_TAB = new CreativeModeTab("tidaltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FISH_KOI.get());
        }
    };
}

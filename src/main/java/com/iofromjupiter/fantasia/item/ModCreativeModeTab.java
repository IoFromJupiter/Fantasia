package com.iofromjupiter.fantasia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FANTASIA_MATERIALS = new CreativeModeTab("fantasia_materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TUNGSTEN_INGOT.get());
        }
    };

}

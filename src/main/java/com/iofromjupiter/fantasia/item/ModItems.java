package com.iofromjupiter.fantasia.item;

import com.iofromjupiter.fantasia.Fantasia;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Fantasia.MOD_ID);

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> CUT_OPAL = ITEMS.register("cut_opal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

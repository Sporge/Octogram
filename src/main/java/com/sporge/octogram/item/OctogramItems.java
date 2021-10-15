package com.sporge.octogram.item;

import com.sporge.octogram.Octogram;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OctogramItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,Octogram.MODID);

    public static  final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

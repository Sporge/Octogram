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
    //list of items to register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,Octogram.MODID);

    //bunch of items made
    public static  final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> SPINEL = ITEMS.register("spinel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    //adds to forge
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

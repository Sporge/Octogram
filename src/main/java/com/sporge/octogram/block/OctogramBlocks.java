package com.sporge.octogram.block;

import com.sporge.octogram.Octogram;
import com.sporge.octogram.item.OctogramItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class OctogramBlocks {
    //list of blocks to register
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Octogram.MODID);
    //add in blocks here
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> SPINEL_BLOCK = registerBlock("spinel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    public static final RegistryObject<Block> ONYX_BLOCK = registerBlock("onyx_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5,6)));

    //adds block and item
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    //adds item version used by other
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        OctogramItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}

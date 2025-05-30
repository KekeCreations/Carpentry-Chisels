package com.kekecreations.carpentry_and_chisels;

import com.kekecreations.carpentry_and_chisels.core.platform.ForgeRegistryHelper;
import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ForgeCarpentryAndChisels {
    
    public ForgeCarpentryAndChisels() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CarpentryAndChisels.init();

        ForgeRegistryHelper.BLOCKS.register(modEventBus);
        ForgeRegistryHelper.ITEMS.register(modEventBus);


        modEventBus.addListener(this::creativeItemGroups);
        
    }


    private void addAfter(BuildCreativeModeTabContentsEvent event, Item beforeItem, Item item) {
        event.getEntries().putAfter(beforeItem.getDefaultInstance(), item.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    private void addAfter(BuildCreativeModeTabContentsEvent event, Block beforeItem, Item item) {
        event.getEntries().putAfter(beforeItem.asItem().getDefaultInstance(), item.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    private void addAfter(BuildCreativeModeTabContentsEvent event, Item beforeItem, Block item) {
        event.getEntries().putAfter(beforeItem.getDefaultInstance(), item.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    private void addAfter(BuildCreativeModeTabContentsEvent event, Block beforeItem, Block item) {
        event.getEntries().putAfter(beforeItem.asItem().getDefaultInstance(), item.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private void addBefore(BuildCreativeModeTabContentsEvent event, Block beforeItem, Block item) {
        event.getEntries().putBefore(beforeItem.asItem().getDefaultInstance(), item.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    private void addBefore(BuildCreativeModeTabContentsEvent event, Item beforeItem, Item item) {
        event.getEntries().putBefore(beforeItem.getDefaultInstance(), item.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public void creativeItemGroups(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            addAfter(event, Items.SHEARS, CCItems.CHISEL.get());
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            addAfter(event, Blocks.OAK_SLAB, CCBlocks.CARVED_OAK_WOOD.get());
            addAfter(event, Blocks.DARK_OAK_SLAB, CCBlocks.CARVED_DARK_OAK_WOOD.get());
            addAfter(event, Blocks.ACACIA_SLAB, CCBlocks.CARVED_ACACIA_WOOD.get());
            addAfter(event, Blocks.BAMBOO_MOSAIC_SLAB, CCBlocks.CARVED_BAMBOO_WOOD.get());
            addAfter(event, Blocks.BIRCH_SLAB, CCBlocks.CARVED_BIRCH_WOOD.get());
            addAfter(event, Blocks.CHERRY_SLAB, CCBlocks.CARVED_CHERRY_WOOD.get());
            addAfter(event, Blocks.CRIMSON_SLAB, CCBlocks.CARVED_CRIMSON_HYPHAE.get());
            addAfter(event, Blocks.JUNGLE_SLAB, CCBlocks.CARVED_JUNGLE_WOOD.get());
            addAfter(event, Blocks.MANGROVE_SLAB, CCBlocks.CARVED_MANGROVE_WOOD.get());
            addAfter(event, Blocks.SPRUCE_SLAB, CCBlocks.CARVED_SPRUCE_WOOD.get());
            addAfter(event, Blocks.WARPED_SLAB, CCBlocks.CARVED_WARPED_HYPHAE.get());



            addAfter(event, Blocks.OAK_WOOD, CCBlocks.OAK_LOG_SLAB.get());
            addAfter(event, Blocks.DARK_OAK_WOOD, CCBlocks.DARK_OAK_LOG_SLAB.get());
            addAfter(event, Blocks.ACACIA_WOOD, CCBlocks.ACACIA_LOG_SLAB.get());
            addAfter(event, Blocks.BAMBOO_BLOCK, CCBlocks.BAMBOO_BLOCK_SLAB.get());
            addAfter(event, Blocks.BIRCH_WOOD, CCBlocks.BIRCH_LOG_SLAB.get());
            addAfter(event, Blocks.CHERRY_WOOD, CCBlocks.CHERRY_LOG_SLAB.get());
            addAfter(event, Blocks.CRIMSON_HYPHAE, CCBlocks.CRIMSON_STEM_SLAB.get());
            addAfter(event, Blocks.JUNGLE_WOOD, CCBlocks.JUNGLE_LOG_SLAB.get());
            addAfter(event, Blocks.MANGROVE_WOOD, CCBlocks.MANGROVE_LOG_SLAB.get());
            addAfter(event, Blocks.SPRUCE_WOOD, CCBlocks.SPRUCE_LOG_SLAB.get());
            addAfter(event, Blocks.WARPED_HYPHAE, CCBlocks.WARPED_STEM_SLAB.get());


            addAfter(event, Blocks.STRIPPED_OAK_WOOD, CCBlocks.STRIPPED_OAK_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_DARK_OAK_WOOD, CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_ACACIA_WOOD, CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_BAMBOO_BLOCK, CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get());
            addAfter(event, Blocks.STRIPPED_BIRCH_WOOD, CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_CHERRY_WOOD, CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_CRIMSON_HYPHAE, CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get());
            addAfter(event, Blocks.STRIPPED_JUNGLE_WOOD, CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_MANGROVE_WOOD, CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_SPRUCE_WOOD, CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get());
            addAfter(event, Blocks.STRIPPED_WARPED_HYPHAE, CCBlocks.STRIPPED_WARPED_STEM_SLAB.get());
        }
    }
}
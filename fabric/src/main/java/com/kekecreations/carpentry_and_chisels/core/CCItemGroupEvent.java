package com.kekecreations.carpentry_and_chisels.core;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class CCItemGroupEvent {

    public static void add() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(event -> {
            event.addAfter(Items.SHEARS, CCItems.CHISEL.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(event -> {
            event.addAfter(Blocks.OAK_SLAB, CCBlocks.CARVED_OAK_WOOD.get());
            event.addAfter(Blocks.DARK_OAK_SLAB, CCBlocks.CARVED_DARK_OAK_WOOD.get());
            event.addAfter(Blocks.ACACIA_SLAB, CCBlocks.CARVED_ACACIA_WOOD.get());
            event.addAfter(Blocks.BAMBOO_MOSAIC_SLAB, CCBlocks.CARVED_BAMBOO_WOOD.get());
            event.addAfter(Blocks.BIRCH_SLAB, CCBlocks.CARVED_BIRCH_WOOD.get());
            event.addAfter(Blocks.CHERRY_SLAB, CCBlocks.CARVED_CHERRY_WOOD.get());
            event.addAfter(Blocks.CRIMSON_SLAB, CCBlocks.CARVED_CRIMSON_HYPHAE.get());
            event.addAfter(Blocks.JUNGLE_SLAB, CCBlocks.CARVED_JUNGLE_WOOD.get());
            event.addAfter(Blocks.MANGROVE_SLAB, CCBlocks.CARVED_MANGROVE_WOOD.get());
            event.addAfter(Blocks.SPRUCE_SLAB, CCBlocks.CARVED_SPRUCE_WOOD.get());
            event.addAfter(Blocks.WARPED_SLAB, CCBlocks.CARVED_WARPED_HYPHAE.get());

            event.addAfter(Blocks.OAK_WOOD, CCBlocks.OAK_LOG_SLAB.get());
            event.addAfter(Blocks.DARK_OAK_WOOD, CCBlocks.DARK_OAK_LOG_SLAB.get());
            event.addAfter(Blocks.ACACIA_WOOD, CCBlocks.ACACIA_LOG_SLAB.get());
            event.addAfter(Blocks.BAMBOO_BLOCK, CCBlocks.BAMBOO_BLOCK_SLAB.get());
            event.addAfter(Blocks.BIRCH_WOOD, CCBlocks.BIRCH_LOG_SLAB.get());
            event.addAfter(Blocks.CHERRY_WOOD, CCBlocks.CHERRY_LOG_SLAB.get());
            event.addAfter(Blocks.CRIMSON_HYPHAE, CCBlocks.CRIMSON_STEM_SLAB.get());
            event.addAfter(Blocks.JUNGLE_WOOD, CCBlocks.JUNGLE_LOG_SLAB.get());
            event.addAfter(Blocks.MANGROVE_WOOD, CCBlocks.MANGROVE_LOG_SLAB.get());
            event.addAfter(Blocks.SPRUCE_WOOD, CCBlocks.SPRUCE_LOG_SLAB.get());
            event.addAfter(Blocks.WARPED_HYPHAE, CCBlocks.WARPED_STEM_SLAB.get());


            event.addAfter(Blocks.STRIPPED_OAK_WOOD, CCBlocks.STRIPPED_OAK_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_DARK_OAK_WOOD, CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_ACACIA_WOOD, CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_BAMBOO_BLOCK, CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get());
            event.addAfter(Blocks.STRIPPED_BIRCH_WOOD, CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_CHERRY_WOOD, CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_CRIMSON_HYPHAE, CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get());
            event.addAfter(Blocks.STRIPPED_JUNGLE_WOOD, CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_MANGROVE_WOOD, CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_SPRUCE_WOOD, CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get());
            event.addAfter(Blocks.STRIPPED_WARPED_HYPHAE, CCBlocks.STRIPPED_WARPED_STEM_SLAB.get());
        });
    }
}

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
            event.addAfter(Blocks.BAMBOO_SLAB, CCBlocks.CARVED_BAMBOO_WOOD.get());
            event.addAfter(Blocks.BIRCH_SLAB, CCBlocks.CARVED_BIRCH_WOOD.get());
            event.addAfter(Blocks.CHERRY_SLAB, CCBlocks.CARVED_CHERRY_WOOD.get());
            event.addAfter(Blocks.CRIMSON_SLAB, CCBlocks.CARVED_CRIMSON_WOOD.get());
            event.addAfter(Blocks.JUNGLE_SLAB, CCBlocks.CARVED_JUNGLE_WOOD.get());
            event.addAfter(Blocks.MANGROVE_SLAB, CCBlocks.CARVED_MANGROVE_WOOD.get());
            event.addAfter(Blocks.SPRUCE_SLAB, CCBlocks.CARVED_SPRUCE_WOOD.get());
            event.addAfter(Blocks.WARPED_SLAB, CCBlocks.CARVED_WARPED_WOOD.get());
        });
    }
}

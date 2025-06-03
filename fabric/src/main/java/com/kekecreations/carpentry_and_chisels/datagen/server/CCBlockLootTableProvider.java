package com.kekecreations.carpentry_and_chisels.datagen.server;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Block;

public class CCBlockLootTableProvider extends FabricBlockLootTableProvider {
    public CCBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropSelf(CCBlocks.CARVED_OAK_WOOD.get());
        dropSelf(CCBlocks.CARVED_DARK_OAK_WOOD.get());
        dropSelf(CCBlocks.CARVED_ACACIA_WOOD.get());
        dropSelf(CCBlocks.CARVED_BAMBOO_WOOD.get());
        dropSelf(CCBlocks.CARVED_BIRCH_WOOD.get());
        dropSelf(CCBlocks.CARVED_CHERRY_WOOD.get());
        dropSelf(CCBlocks.CARVED_CRIMSON_HYPHAE.get());
        dropSelf(CCBlocks.CARVED_JUNGLE_WOOD.get());
        dropSelf(CCBlocks.CARVED_MANGROVE_WOOD.get());
        dropSelf(CCBlocks.CARVED_SPRUCE_WOOD.get());
        dropSelf(CCBlocks.CARVED_WARPED_HYPHAE.get());


        slabDrop(CCBlocks.OAK_LOG_SLAB.get());
        slabDrop(CCBlocks.DARK_OAK_LOG_SLAB.get());
        slabDrop(CCBlocks.ACACIA_LOG_SLAB.get());
        slabDrop(CCBlocks.BAMBOO_BLOCK_SLAB.get());
        slabDrop(CCBlocks.BIRCH_LOG_SLAB.get());
        slabDrop(CCBlocks.CHERRY_LOG_SLAB.get());
        slabDrop(CCBlocks.CRIMSON_STEM_SLAB.get());
        slabDrop(CCBlocks.JUNGLE_LOG_SLAB.get());
        slabDrop(CCBlocks.MANGROVE_LOG_SLAB.get());
        slabDrop(CCBlocks.SPRUCE_LOG_SLAB.get());
        slabDrop(CCBlocks.WARPED_STEM_SLAB.get());

        slabDrop(CCBlocks.STRIPPED_OAK_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get());
        slabDrop(CCBlocks.STRIPPED_WARPED_STEM_SLAB.get());

        dropSelf(CCBlocks.OAK_POLE.get());
        dropSelf(CCBlocks.DARK_OAK_POLE.get());
        dropSelf(CCBlocks.ACACIA_POLE.get());
        dropSelf(CCBlocks.BAMBOO_POLE.get());
        dropSelf(CCBlocks.BIRCH_POLE.get());
        dropSelf(CCBlocks.CHERRY_POLE.get());
        dropSelf(CCBlocks.CRIMSON_POLE.get());
        dropSelf(CCBlocks.JUNGLE_POLE.get());
        dropSelf(CCBlocks.MANGROVE_POLE.get());
        dropSelf(CCBlocks.SPRUCE_POLE.get());
        dropSelf(CCBlocks.WARPED_POLE.get());

        dropSelf(CCBlocks.STRIPPED_OAK_POLE.get());
        dropSelf(CCBlocks.STRIPPED_DARK_OAK_POLE.get());
        dropSelf(CCBlocks.STRIPPED_ACACIA_POLE.get());
        dropSelf(CCBlocks.STRIPPED_BAMBOO_POLE.get());
        dropSelf(CCBlocks.STRIPPED_BIRCH_POLE.get());
        dropSelf(CCBlocks.STRIPPED_CHERRY_POLE.get());
        dropSelf(CCBlocks.STRIPPED_CRIMSON_POLE.get());
        dropSelf(CCBlocks.STRIPPED_JUNGLE_POLE.get());
        dropSelf(CCBlocks.STRIPPED_MANGROVE_POLE.get());
        dropSelf(CCBlocks.STRIPPED_SPRUCE_POLE.get());
        dropSelf(CCBlocks.STRIPPED_WARPED_POLE.get());

    }
    public void slabDrop(Block block) {
        add(block, createSlabItemTable(block));
    }
}

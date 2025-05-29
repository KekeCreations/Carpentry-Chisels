package com.kekecreations.carpentry_and_chisels.datagen.server;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CCBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public CCBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        axe();
    }

    private void axe() {
        this.getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(CCBlocks.CARVED_DARK_OAK_WOOD.get())
                .add(CCBlocks.CARVED_ACACIA_WOOD.get())
                .add(CCBlocks.CARVED_BAMBOO_WOOD.get())
                .add(CCBlocks.CARVED_BIRCH_WOOD.get())
                .add(CCBlocks.CARVED_CHERRY_WOOD.get())
                .add(CCBlocks.CARVED_CRIMSON_WOOD.get())
                .add(CCBlocks.CARVED_JUNGLE_WOOD.get())
                .add(CCBlocks.CARVED_MANGROVE_WOOD.get())
                .add(CCBlocks.CARVED_SPRUCE_WOOD.get())
                .add(CCBlocks.CARVED_WARPED_WOOD.get())
                .add(CCBlocks.CARVED_OAK_WOOD.get())

                .add(CCBlocks.DARK_OAK_LOG_SLAB.get())
                .add(CCBlocks.ACACIA_LOG_SLAB.get())
                .add(CCBlocks.BAMBOO_BLOCK_SLAB.get())
                .add(CCBlocks.BIRCH_LOG_SLAB.get())
                .add(CCBlocks.CHERRY_LOG_SLAB.get())
                .add(CCBlocks.CRIMSON_STEM_SLAB.get())
                .add(CCBlocks.JUNGLE_LOG_SLAB.get())
                .add(CCBlocks.MANGROVE_LOG_SLAB.get())
                .add(CCBlocks.SPRUCE_LOG_SLAB.get())
                .add(CCBlocks.WARPED_STEM_SLAB.get())
                .add(CCBlocks.OAK_LOG_SLAB.get())

                .add(CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get())
                .add(CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get())
                .add(CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get())
                .add(CCBlocks.STRIPPED_WARPED_STEM_SLAB.get())
                .add(CCBlocks.STRIPPED_OAK_LOG_SLAB.get())
        ;
    }
}

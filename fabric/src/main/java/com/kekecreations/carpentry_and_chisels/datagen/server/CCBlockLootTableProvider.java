package com.kekecreations.carpentry_and_chisels.datagen.server;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

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
        dropSelf(CCBlocks.CARVED_CRIMSON_WOOD.get());
        dropSelf(CCBlocks.CARVED_JUNGLE_WOOD.get());
        dropSelf(CCBlocks.CARVED_MANGROVE_WOOD.get());
        dropSelf(CCBlocks.CARVED_SPRUCE_WOOD.get());
        dropSelf(CCBlocks.CARVED_WARPED_WOOD.get());
    }
}

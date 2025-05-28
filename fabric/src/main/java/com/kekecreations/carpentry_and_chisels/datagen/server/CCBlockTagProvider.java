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
                .add(CCBlocks.CARVED_OAK_WOOD.get());
    }
}

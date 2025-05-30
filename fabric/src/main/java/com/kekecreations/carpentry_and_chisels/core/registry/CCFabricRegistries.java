package com.kekecreations.carpentry_and_chisels.core.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class CCFabricRegistries {

    public static void register() {
        //FLAMMABLE
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_ACACIA_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_BAMBOO_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_BIRCH_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_CHERRY_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_CRIMSON_HYPHAE.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_DARK_OAK_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_JUNGLE_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_MANGROVE_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_OAK_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_SPRUCE_WOOD.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.CARVED_WARPED_HYPHAE.get(), 5, 20);


        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.OAK_LOG_SLAB.get(), 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CCBlocks.STRIPPED_OAK_LOG_SLAB.get(), 5, 20);
    }
}

package com.kekecreations.carpentry_and_chisels.core.registry;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class CCBlocks {

    private static <T extends Block> Supplier<T> registerBlockWithItem(String name, java.util.function.Supplier<T> blockSupplier) {
        return Services.REGISTRY.registerBlockWithItem(name, blockSupplier);
    }
}

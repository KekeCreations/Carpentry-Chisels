package com.kekecreations.carpentry_and_chisels.core.platform.services;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface IRegistryHelper {

    <T extends Block> Supplier<T> registerBlockWithItem(String id, java.util.function.Supplier<T> blockSupplier);
}

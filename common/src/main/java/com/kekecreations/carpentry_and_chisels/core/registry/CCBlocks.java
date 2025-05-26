package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.kekecreations.carpentry_and_chisels.core.platform.Services;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class CCBlocks {


    public static final Supplier<Block> CARVED_OAK_WOOD = registerBlockWithItem("carved_oak_wood", () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    private static <T extends Block> Supplier<T> registerBlockWithItem(String name, java.util.function.Supplier<T> blockSupplier) {
        return Services.REGISTRY.registerBlockWithItem(name, blockSupplier);
    }

    public static void register() {}
}

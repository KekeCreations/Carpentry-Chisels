package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.common.block.CCSlabBlock;
import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.kekecreations.carpentry_and_chisels.core.platform.Services;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class CCBlocks {


    public static final Supplier<Block> CARVED_OAK_WOOD = registerBlockWithItem("carved_oak_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_DARK_OAK_WOOD = registerBlockWithItem("carved_dark_oak_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_ACACIA_WOOD = registerBlockWithItem("carved_acacia_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_BAMBOO_WOOD = registerBlockWithItem("carved_bamboo_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_BIRCH_WOOD = registerBlockWithItem("carved_birch_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_CHERRY_WOOD = registerBlockWithItem("carved_cherry_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_CRIMSON_WOOD = registerBlockWithItem("carved_crimson_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_JUNGLE_WOOD = registerBlockWithItem("carved_jungle_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_MANGROVE_WOOD = registerBlockWithItem("carved_mangrove_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_SPRUCE_WOOD = registerBlockWithItem("carved_spruce_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> CARVED_WARPED_WOOD = registerBlockWithItem("carved_warped_wood",
            () -> new CarvedWoodBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Supplier<Block> OAK_LOG_SLAB = registerBlockWithItem("oak_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_OAK_LOG_SLAB = registerBlockWithItem("stripped_oak_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    private static <T extends Block> Supplier<T> registerBlockWithItem(String name, java.util.function.Supplier<T> blockSupplier) {
        return Services.REGISTRY.registerBlockWithItem(name, blockSupplier);
    }

    public static void register() {}
}

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


    //SLABS

    public static final Supplier<Block> ACACIA_LOG_SLAB = registerBlockWithItem("acacia_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_ACACIA_LOG_SLAB = registerBlockWithItem("stripped_acacia_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> BAMBOO_BLOCK_SLAB = registerBlockWithItem("bamboo_block_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_BAMBOO_BLOCK_SLAB = registerBlockWithItem("stripped_bamboo_block_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> BIRCH_LOG_SLAB = registerBlockWithItem("birch_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_BIRCH_LOG_SLAB = registerBlockWithItem("stripped_birch_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> CHERRY_LOG_SLAB = registerBlockWithItem("cherry_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_CHERRY_LOG_SLAB = registerBlockWithItem("stripped_cherry_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> CRIMSON_STEM_SLAB = registerBlockWithItem("crimson_stem_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.STEM).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_CRIMSON_STEM_SLAB = registerBlockWithItem("stripped_crimson_stem_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.STEM).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> DARK_OAK_LOG_SLAB = registerBlockWithItem("dark_oak_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_DARK_OAK_LOG_SLAB = registerBlockWithItem("stripped_dark_oak_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> JUNGLE_LOG_SLAB = registerBlockWithItem("jungle_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_JUNGLE_LOG_SLAB = registerBlockWithItem("stripped_jungle_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> MANGROVE_LOG_SLAB = registerBlockWithItem("mangrove_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_MANGROVE_LOG_SLAB = registerBlockWithItem("stripped_mangrove_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> OAK_LOG_SLAB = registerBlockWithItem("oak_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_OAK_LOG_SLAB = registerBlockWithItem("stripped_oak_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> SPRUCE_LOG_SLAB = registerBlockWithItem("spruce_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_SPRUCE_LOG_SLAB = registerBlockWithItem("stripped_spruce_log_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> WARPED_STEM_SLAB = registerBlockWithItem("warped_stem_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.STEM).ignitedByLava().mapColor(MapColor.WOOD)));

    public static final Supplier<Block> STRIPPED_WARPED_STEM_SLAB = registerBlockWithItem("stripped_warped_stem_slab",
            () -> new CCSlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.STEM).ignitedByLava().mapColor(MapColor.WOOD)));

    private static <T extends Block> Supplier<T> registerBlockWithItem(String name, java.util.function.Supplier<T> blockSupplier) {
        return Services.REGISTRY.registerBlockWithItem(name, blockSupplier);
    }

    public static void register() {}
}

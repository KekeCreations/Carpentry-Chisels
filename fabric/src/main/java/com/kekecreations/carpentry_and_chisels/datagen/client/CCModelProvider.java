package com.kekecreations.carpentry_and_chisels.datagen.client;

import com.kekecreations.carpentry_and_chisels.Constants;
import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import com.kekecreations.carpentry_and_chisels.datagen.client.util.CCModelTemplate;
import com.kekecreations.carpentry_and_chisels.datagen.client.util.CCTextureMapping;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;

public class CCModelProvider extends FabricModelProvider {
    public CCModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        carvedWoodBlock(generator, CCBlocks.CARVED_OAK_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_DARK_OAK_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_ACACIA_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_BAMBOO_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_BIRCH_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_CHERRY_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_CRIMSON_HYPHAE.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_JUNGLE_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_MANGROVE_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_SPRUCE_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_WARPED_HYPHAE.get());

        slab(generator, CCBlocks.OAK_LOG_SLAB.get(), Blocks.OAK_LOG);
        slab(generator, CCBlocks.STRIPPED_OAK_LOG_SLAB.get(), Blocks.STRIPPED_OAK_LOG);
        slab(generator, CCBlocks.DARK_OAK_LOG_SLAB.get(), Blocks.DARK_OAK_LOG);
        slab(generator, CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(), Blocks.STRIPPED_DARK_OAK_LOG);
        slab(generator, CCBlocks.ACACIA_LOG_SLAB.get(), Blocks.ACACIA_LOG);
        slab(generator, CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get(), Blocks.STRIPPED_ACACIA_LOG);
        slab(generator, CCBlocks.BAMBOO_BLOCK_SLAB.get(), Blocks.BAMBOO_BLOCK);
        slab(generator, CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), Blocks.STRIPPED_BAMBOO_BLOCK);
        slab(generator, CCBlocks.BIRCH_LOG_SLAB.get(), Blocks.BIRCH_LOG);
        slab(generator, CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get(), Blocks.STRIPPED_BIRCH_LOG);
        slab(generator, CCBlocks.CHERRY_LOG_SLAB.get(), Blocks.CHERRY_LOG);
        slab(generator, CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get(), Blocks.STRIPPED_CHERRY_LOG);
        slab(generator, CCBlocks.CRIMSON_STEM_SLAB.get(), Blocks.CRIMSON_STEM);
        slab(generator, CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(), Blocks.STRIPPED_CRIMSON_STEM);
        slab(generator, CCBlocks.JUNGLE_LOG_SLAB.get(), Blocks.JUNGLE_LOG);
        slab(generator, CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(), Blocks.STRIPPED_JUNGLE_LOG);
        slab(generator, CCBlocks.MANGROVE_LOG_SLAB.get(), Blocks.MANGROVE_LOG);
        slab(generator, CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(), Blocks.STRIPPED_MANGROVE_LOG);
        slab(generator, CCBlocks.SPRUCE_LOG_SLAB.get(), Blocks.SPRUCE_LOG);
        slab(generator, CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(), Blocks.STRIPPED_SPRUCE_LOG);
        slab(generator, CCBlocks.WARPED_STEM_SLAB.get(), Blocks.WARPED_STEM);
        slab(generator, CCBlocks.STRIPPED_WARPED_STEM_SLAB.get(), Blocks.STRIPPED_WARPED_STEM);

        pole(generator, CCBlocks.OAK_POLE.get());
        pole(generator, CCBlocks.STRIPPED_OAK_POLE.get());
        pole(generator, CCBlocks.DARK_OAK_POLE.get());
        pole(generator, CCBlocks.STRIPPED_DARK_OAK_POLE.get());
        pole(generator, CCBlocks.ACACIA_POLE.get());
        pole(generator, CCBlocks.STRIPPED_ACACIA_POLE.get());
        pole(generator, CCBlocks.BAMBOO_POLE.get());
        pole(generator, CCBlocks.STRIPPED_BAMBOO_POLE.get());
        pole(generator, CCBlocks.BIRCH_POLE.get());
        pole(generator, CCBlocks.STRIPPED_BIRCH_POLE.get());
        pole(generator, CCBlocks.CHERRY_POLE.get());
        pole(generator, CCBlocks.STRIPPED_CHERRY_POLE.get());
        pole(generator, CCBlocks.CRIMSON_POLE.get());
        pole(generator, CCBlocks.STRIPPED_CRIMSON_POLE.get());
        pole(generator, CCBlocks.JUNGLE_POLE.get());
        pole(generator, CCBlocks.STRIPPED_JUNGLE_POLE.get());
        pole(generator, CCBlocks.MANGROVE_POLE.get());
        pole(generator, CCBlocks.STRIPPED_MANGROVE_POLE.get());
        pole(generator, CCBlocks.SPRUCE_POLE.get());
        pole(generator, CCBlocks.STRIPPED_SPRUCE_POLE.get());
        pole(generator, CCBlocks.WARPED_POLE.get());
        pole(generator, CCBlocks.STRIPPED_WARPED_POLE.get());


    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(CCItems.CHISEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

    }

    public static void carvedWoodBlock(BlockModelGenerators generator, Block block) {
        ResourceLocation model0 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "0"), generator.modelOutput);
        ResourceLocation model1 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_1"), CCTextureMapping.woodTextureMappings(block, "1"), generator.modelOutput);
        ResourceLocation model2 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_2"), CCTextureMapping.woodTextureMappings(block, "2"), generator.modelOutput);
        ResourceLocation model3 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_3"), CCTextureMapping.woodTextureMappings(block, "3"), generator.modelOutput);
        ResourceLocation model4 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_4"), CCTextureMapping.woodTextureMappings(block, "4"), generator.modelOutput);
        ResourceLocation model5 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_5"), CCTextureMapping.woodTextureMappings(block, "5"), generator.modelOutput);
        ResourceLocation model6 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_6"), CCTextureMapping.woodTextureMappings(block, "6"), generator.modelOutput);
        ResourceLocation model7 = CCModelTemplate.CARVEDWOOD.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_7"), CCTextureMapping.woodTextureMappings(block, "7"), generator.modelOutput);
        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block)
                .with(PropertyDispatch.property(CarvedWoodBlock.PATTERN)
                        .select(0, Variant.variant()
                                .with(VariantProperties.MODEL, model0))
                        .select(1, Variant.variant()
                                .with(VariantProperties.MODEL, model1))
                        .select(2, Variant.variant()
                                .with(VariantProperties.MODEL, model2))
                        .select(3, Variant.variant()
                                .with(VariantProperties.MODEL, model3))
                        .select(4, Variant.variant()
                                .with(VariantProperties.MODEL, model4))
                        .select(5, Variant.variant()
                                .with(VariantProperties.MODEL, model5))
                        .select(6, Variant.variant()
                                .with(VariantProperties.MODEL, model6))
                        .select(7, Variant.variant()
                                .with(VariantProperties.MODEL, model7))
                ));
    }

    public static void slab(BlockModelGenerators generator, Block block, Block logBlock) {
        ResourceLocation bottomModel = CCModelTemplate.SLAB.create(block, CCTextureMapping.slabTextureMappings(logBlock), generator.modelOutput);
        ResourceLocation topModel = CCModelTemplate.TOP_SLAB.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_top"), CCTextureMapping.slabTextureMappings(logBlock), generator.modelOutput);
        ResourceLocation doubleModel = CCModelTemplate.CUBE_COLUMN.create(ResourceLocation.tryParse(TextureMapping.getBlockTexture(block) + "_double"), CCTextureMapping.logTextureMappings(logBlock), generator.modelOutput);
        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant()
                                .with(VariantProperties.MODEL, bottomModel))
                        .select(SlabType.TOP, Variant.variant()
                                .with(VariantProperties.MODEL, topModel))
                        .select(SlabType.DOUBLE, Variant.variant()
                                .with(VariantProperties.MODEL, doubleModel))));
    }

    public static void pole(BlockModelGenerators generator, Block block) {
        ResourceLocation model = CCModelTemplate.POLE.create(block, CCTextureMapping.poleTextureMappings(block), generator.modelOutput);
        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block, Variant.variant().with(VariantProperties.MODEL, model)));
    }
}

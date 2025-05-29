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
        carvedWoodBlock(generator, CCBlocks.CARVED_CRIMSON_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_JUNGLE_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_MANGROVE_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_SPRUCE_WOOD.get());
        carvedWoodBlock(generator, CCBlocks.CARVED_WARPED_WOOD.get());


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
}

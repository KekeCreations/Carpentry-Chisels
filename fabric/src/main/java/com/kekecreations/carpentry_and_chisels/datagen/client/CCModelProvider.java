package com.kekecreations.carpentry_and_chisels.datagen.client;

import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class CCModelProvider extends FabricModelProvider {
    public CCModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {


    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {

    }

    public static void carvedWoodBlock(BlockModelGenerators generator, Block block) {
        ResourceLocation model0 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "0"), generator.modelOutput);
        ResourceLocation model1 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "1"), generator.modelOutput);
        ResourceLocation model2 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "2"), generator.modelOutput);
        ResourceLocation model3 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "3"), generator.modelOutput);
        ResourceLocation model4 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "4"), generator.modelOutput);
        ResourceLocation model5 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "5"), generator.modelOutput);
        ResourceLocation model6 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "6"), generator.modelOutput);
        ResourceLocation model7 = CCModelTemplate.CARVEDWOOD.create(block, CCTextureMapping.woodTextureMappings(block, "7"), generator.modelOutput);
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

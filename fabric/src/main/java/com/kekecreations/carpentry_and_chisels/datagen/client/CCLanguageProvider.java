package com.kekecreations.carpentry_and_chisels.datagen.client;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CCLanguageProvider extends FabricLanguageProvider {

    public CCLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(CCBlocks.CARVED_OAK_WOOD.get(), "Carved Oak Wood");
        builder.add(CCBlocks.CARVED_DARK_OAK_WOOD.get(), "Carved Dark Oak Wood");
        builder.add(CCBlocks.CARVED_ACACIA_WOOD.get(), "Carved Acacia Wood");
        builder.add(CCBlocks.CARVED_BAMBOO_WOOD.get(), "Carved Bamboo Wood");
        builder.add(CCBlocks.CARVED_BIRCH_WOOD.get(), "Carved Birch Wood");
        builder.add(CCBlocks.CARVED_CHERRY_WOOD.get(), "Carved Cherry Wood");
        builder.add(CCBlocks.CARVED_CRIMSON_WOOD.get(), "Carved Crimson Wood");
        builder.add(CCBlocks.CARVED_JUNGLE_WOOD.get(), "Carved Jungle Wood");
        builder.add(CCBlocks.CARVED_MANGROVE_WOOD.get(), "Carved Mangrove Wood");
        builder.add(CCBlocks.CARVED_SPRUCE_WOOD.get(), "Carved Spruce Wood");
        builder.add(CCBlocks.CARVED_WARPED_WOOD.get(), "Carved Warped Wood");
        builder.add(CCItems.CHISEL.get(), "Chisel");

        builder.add(CCBlocks.OAK_LOG_SLAB.get(), "Oak Log Slab");
        builder.add(CCBlocks.DARK_OAK_LOG_SLAB.get(), "Dark Oak Log Slab");
        builder.add(CCBlocks.ACACIA_LOG_SLAB.get(), "Acacia Log Slab");
        builder.add(CCBlocks.BAMBOO_BLOCK_SLAB.get(), "Bamboo Block Slab");
        builder.add(CCBlocks.BIRCH_LOG_SLAB.get(), "Birch Log Slab");
        builder.add(CCBlocks.CHERRY_LOG_SLAB.get(), "Cherry Log Slab");
        builder.add(CCBlocks.CRIMSON_STEM_SLAB.get(), "Crimson Stem Slab");
        builder.add(CCBlocks.JUNGLE_LOG_SLAB.get(), "Jungle Log Slab");
        builder.add(CCBlocks.MANGROVE_LOG_SLAB.get(), "Mangrove Log Slab");
        builder.add(CCBlocks.SPRUCE_LOG_SLAB.get(), "Spruce Log Slab");
        builder.add(CCBlocks.WARPED_STEM_SLAB.get(), "Warped Stem Slab");

        builder.add(CCBlocks.STRIPPED_OAK_LOG_SLAB.get(), "Stripped Oak Log Slab");
        builder.add(CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(), "Stripped Dark Oak Log Slab");
        builder.add(CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get(), "Stripped Acacia Log Slab");
        builder.add(CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), "Stripped Bamboo Block Slab");
        builder.add(CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get(), "Stripped Birch Log Slab");
        builder.add(CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get(), "Stripped Cherry Log Slab");
        builder.add(CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(), "Stripped Crimson Stem Slab");
        builder.add(CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(), "Stripped Jungle Log Slab");
        builder.add(CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(), "Stripped Mangrove Log Slab");
        builder.add(CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(), "Stripped Spruce Log Slab");
        builder.add(CCBlocks.STRIPPED_WARPED_STEM_SLAB.get(), "Stripped Warped Stem Slab");

        builder.add("tooltip.carpentry_and_chisels.pattern_0", "No Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_1", "Swirl Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_2", "Target Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_3", "Cross Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_4", "Stripe Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_5", "Star Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_6", "Wave Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_7", "Bubble Pattern");
        builder.add("tooltip.carpentry_and_chisels.show", "[Shift to show controls]");
        builder.add("tooltip.carpentry_and_chisels.control_1", "Interact to cycle pattern or carve saved pattern");
        builder.add("tooltip.carpentry_and_chisels.control_2", "Shift interact carved wood to save pattern");
        builder.add("tooltip.carpentry_and_chisels.control_3", "Shift interact air to clear saved pattern");

    }
}

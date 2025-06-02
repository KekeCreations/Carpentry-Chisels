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
        builder.add(CCBlocks.CARVED_CRIMSON_HYPHAE.get(), "Carved Crimson Hyphae");
        builder.add(CCBlocks.CARVED_JUNGLE_WOOD.get(), "Carved Jungle Wood");
        builder.add(CCBlocks.CARVED_MANGROVE_WOOD.get(), "Carved Mangrove Wood");
        builder.add(CCBlocks.CARVED_SPRUCE_WOOD.get(), "Carved Spruce Wood");
        builder.add(CCBlocks.CARVED_WARPED_HYPHAE.get(), "Carved Warped Hyphae");
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


        builder.add(CCBlocks.OAK_POLE.get(), "Oak Pole");
        builder.add(CCBlocks.DARK_OAK_POLE.get(), "Dark Oak Pole");
        builder.add(CCBlocks.ACACIA_POLE.get(), "Acacia Pole");
        builder.add(CCBlocks.BAMBOO_POLE.get(), "Bamboo Pole");
        builder.add(CCBlocks.BIRCH_POLE.get(), "Birch Pole");
        builder.add(CCBlocks.CHERRY_POLE.get(), "Cherry Pole");
        builder.add(CCBlocks.CRIMSON_POLE.get(), "Crimson Pole");
        builder.add(CCBlocks.JUNGLE_POLE.get(), "Jungle Pole");
        builder.add(CCBlocks.MANGROVE_POLE.get(), "Mangrove Pole");
        builder.add(CCBlocks.SPRUCE_POLE.get(), "Spruce Pole");
        builder.add(CCBlocks.WARPED_POLE.get(), "Warped Pole");

        builder.add(CCBlocks.STRIPPED_OAK_POLE.get(), "Stripped Oak Pole");
        builder.add(CCBlocks.STRIPPED_DARK_OAK_POLE.get(), "Stripped Dark Oak Pole");
        builder.add(CCBlocks.STRIPPED_ACACIA_POLE.get(), "Stripped Acacia Pole");
        builder.add(CCBlocks.STRIPPED_BAMBOO_POLE.get(), "Stripped Bamboo Pole");
        builder.add(CCBlocks.STRIPPED_BIRCH_POLE.get(), "Stripped Birch Pole");
        builder.add(CCBlocks.STRIPPED_CHERRY_POLE.get(), "Stripped Cherry Pole");
        builder.add(CCBlocks.STRIPPED_CRIMSON_POLE.get(), "Stripped Crimson Pole");
        builder.add(CCBlocks.STRIPPED_JUNGLE_POLE.get(), "Stripped Jungle Pole");
        builder.add(CCBlocks.STRIPPED_MANGROVE_POLE.get(), "Stripped Mangrove Pole");
        builder.add(CCBlocks.STRIPPED_SPRUCE_POLE.get(), "Stripped Spruce Pole");
        builder.add(CCBlocks.STRIPPED_WARPED_POLE.get(), "Stripped Warped Pole");

        builder.add("tooltip.carpentry_and_chisels.pattern_0", "No Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_1", "Swirl Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_2", "Target Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_3", "Cross Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_4", "Stripe Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_5", "Star Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_6", "Wave Pattern");
        builder.add("tooltip.carpentry_and_chisels.pattern_7", "Bubble Pattern");
        builder.add("tooltip.carpentry_and_chisels.show", "[Shift to show controls]");
        builder.add("tooltip.carpentry_and_chisels.control_1", "While sneaking:");
        builder.add("tooltip.carpentry_and_chisels.control_2", " Interact with Carved Wood to save pattern");
        builder.add("tooltip.carpentry_and_chisels.control_3", " Interact with Air to clear pattern");
    }
}

package com.kekecreations.carpentry_and_chisels.datagen.server;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class CCRecipeProvider extends FabricRecipeProvider {
    public CCRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        carvedWoodRecipe(Blocks.OAK_SLAB, CCBlocks.CARVED_OAK_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.DARK_OAK_SLAB, CCBlocks.CARVED_DARK_OAK_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.ACACIA_SLAB, CCBlocks.CARVED_ACACIA_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.BAMBOO_SLAB, CCBlocks.CARVED_BAMBOO_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.BIRCH_SLAB, CCBlocks.CARVED_BIRCH_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.CHERRY_SLAB, CCBlocks.CARVED_CHERRY_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.CRIMSON_SLAB, CCBlocks.CARVED_CRIMSON_HYPHAE.get(), consumer);
        carvedWoodRecipe(Blocks.JUNGLE_SLAB, CCBlocks.CARVED_JUNGLE_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.MANGROVE_SLAB, CCBlocks.CARVED_MANGROVE_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.SPRUCE_SLAB, CCBlocks.CARVED_SPRUCE_WOOD.get(), consumer);
        carvedWoodRecipe(Blocks.WARPED_SLAB, CCBlocks.CARVED_WARPED_HYPHAE.get(), consumer);


        slabRecipe(Blocks.OAK_LOG, CCBlocks.OAK_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.DARK_OAK_LOG, CCBlocks.DARK_OAK_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.ACACIA_LOG, CCBlocks.ACACIA_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.BAMBOO_BLOCK, CCBlocks.BAMBOO_BLOCK_SLAB.get(), consumer);
        slabRecipe(Blocks.BIRCH_LOG, CCBlocks.BIRCH_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.CHERRY_LOG, CCBlocks.CHERRY_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.CRIMSON_STEM, CCBlocks.CRIMSON_STEM_SLAB.get(), consumer);
        slabRecipe(Blocks.JUNGLE_LOG, CCBlocks.JUNGLE_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.MANGROVE_LOG, CCBlocks.MANGROVE_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.SPRUCE_LOG, CCBlocks.SPRUCE_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.WARPED_STEM, CCBlocks.WARPED_STEM_SLAB.get(), consumer);

        slabRecipe(Blocks.STRIPPED_OAK_LOG, CCBlocks.STRIPPED_OAK_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_DARK_OAK_LOG, CCBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_ACACIA_LOG, CCBlocks.STRIPPED_ACACIA_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_BAMBOO_BLOCK, CCBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_BIRCH_LOG, CCBlocks.STRIPPED_BIRCH_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_CHERRY_LOG, CCBlocks.STRIPPED_CHERRY_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_CRIMSON_STEM, CCBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_JUNGLE_LOG, CCBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_MANGROVE_LOG, CCBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_SPRUCE_LOG, CCBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(), consumer);
        slabRecipe(Blocks.STRIPPED_WARPED_STEM, CCBlocks.STRIPPED_WARPED_STEM_SLAB.get(), consumer);

        poleRecipe(Blocks.OAK_LOG, CCBlocks.OAK_POLE.get(), consumer);
        poleRecipe(Blocks.DARK_OAK_LOG, CCBlocks.DARK_OAK_POLE.get(), consumer);
        poleRecipe(Blocks.ACACIA_LOG, CCBlocks.ACACIA_POLE.get(), consumer);
        poleRecipe(Blocks.BAMBOO_BLOCK, CCBlocks.BAMBOO_POLE.get(), consumer);
        poleRecipe(Blocks.BIRCH_LOG, CCBlocks.BIRCH_POLE.get(), consumer);
        poleRecipe(Blocks.CHERRY_LOG, CCBlocks.CHERRY_POLE.get(), consumer);
        poleRecipe(Blocks.CRIMSON_STEM, CCBlocks.CRIMSON_POLE.get(), consumer);
        poleRecipe(Blocks.JUNGLE_LOG, CCBlocks.JUNGLE_POLE.get(), consumer);
        poleRecipe(Blocks.MANGROVE_LOG, CCBlocks.MANGROVE_POLE.get(), consumer);
        poleRecipe(Blocks.SPRUCE_LOG, CCBlocks.SPRUCE_POLE.get(), consumer);
        poleRecipe(Blocks.WARPED_STEM, CCBlocks.WARPED_POLE.get(), consumer);

        poleRecipe(Blocks.STRIPPED_OAK_LOG, CCBlocks.STRIPPED_OAK_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_DARK_OAK_LOG, CCBlocks.STRIPPED_DARK_OAK_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_ACACIA_LOG, CCBlocks.STRIPPED_ACACIA_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_BAMBOO_BLOCK, CCBlocks.STRIPPED_BAMBOO_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_BIRCH_LOG, CCBlocks.STRIPPED_BIRCH_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_CHERRY_LOG, CCBlocks.STRIPPED_CHERRY_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_CRIMSON_STEM, CCBlocks.STRIPPED_CRIMSON_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_JUNGLE_LOG, CCBlocks.STRIPPED_JUNGLE_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_MANGROVE_LOG, CCBlocks.STRIPPED_MANGROVE_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_SPRUCE_LOG, CCBlocks.STRIPPED_SPRUCE_POLE.get(), consumer);
        poleRecipe(Blocks.STRIPPED_WARPED_STEM, CCBlocks.STRIPPED_WARPED_POLE.get(), consumer);

    }

    protected static void carvedWoodRecipe(Block craftingBlock, Block resultBlock, Consumer<FinishedRecipe> output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, resultBlock ,1)
                .pattern("KK")
                .define('K', craftingBlock)
                .unlockedBy(getItemName(resultBlock), has(craftingBlock))
                .save(output, getItemName(resultBlock));
    }

    protected static void slabRecipe(Block craftingBlock, Block resultBlock, Consumer<FinishedRecipe> output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, resultBlock ,6)
                .pattern("KKK")
                .define('K', craftingBlock)
                .unlockedBy(getItemName(resultBlock), has(craftingBlock))
                .save(output, getItemName(resultBlock));
    }

    protected static void poleRecipe(Block craftingBlock, Block resultBlock, Consumer<FinishedRecipe> output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, resultBlock ,4)
                .pattern("K")
                .pattern("K")
                .define('K', craftingBlock)
                .unlockedBy(getItemName(resultBlock), has(craftingBlock))
                .save(output, getItemName(resultBlock));
    }
}

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

    }

    protected static void carvedWoodRecipe(Block craftingBlock, Block resultBlock, Consumer<FinishedRecipe> output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, resultBlock ,1)
                .pattern("KK")
                .define('K', craftingBlock)
                .unlockedBy(getItemName(resultBlock), has(craftingBlock))
                .save(output, getItemName(resultBlock) + "_type");
    }
}

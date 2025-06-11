package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.Constants;
import com.kekecreations.carpentry_and_chisels.common.block.CCSlabBlock;
import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.kekecreations.carpentry_and_chisels.common.block.PoleBlock;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodTypeRegistry;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;

public class EveryCompatModule {


    static SimpleModule mod = new SimpleModule(Constants.MOD_ID, "ca");
    static SimpleEntrySet<?, ?> carved = SimpleEntrySet.builder(WoodType.class, "wood", "carved", CCBlocks.CARVED_OAK_WOOD, ()-> WoodTypeRegistry.OAK_TYPE,
                    w -> new CarvedWoodBlock(Utils.copyPropertySafe(w.planks)))
            .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
            .dropSelf()
            .addRecipe(new ResourceLocation("carpentry_and_chisels:carved_oak_wood"))
            .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("building_blocks")))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_0"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_1"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_2"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_3"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_4"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_5"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_6"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/carved_oak_wood_7"))
            .build();

    static SimpleEntrySet<WoodType, ?> strippedLogSlab = SimpleEntrySet.builder(WoodType.class, "log_slab", "stripped", CCBlocks.STRIPPED_OAK_LOG_SLAB, ()-> WoodTypeRegistry.OAK_TYPE,
                    w -> new CCSlabBlock(null, Utils.copyPropertySafe(w.log)))
            .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
            .copyParentDrop()
            .requiresChildren("stripped_log")
            .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("building_blocks")))
            .addTexture(new ResourceLocation("minecraft:block/stripped_oak_log"))
            .addTexture(new ResourceLocation("minecraft:block/stripped_oak_log_top"))
            .defaultRecipe()
            .build();

    public static SimpleEntrySet<?, ?> logSlab = SimpleEntrySet.builder(WoodType.class, "log_slab", CCBlocks.OAK_LOG_SLAB, ()-> WoodTypeRegistry.OAK_TYPE,
                    w -> new CCSlabBlock(strippedLogSlab.blocks.get(w), Utils.copyPropertySafe(w.log)))
            .requiresFromMap(strippedLogSlab.blocks)
            .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
            .copyParentDrop()
            .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("building_blocks")))
            .addTexture(new ResourceLocation("minecraft:block/oak_log"))
            .addTexture(new ResourceLocation("minecraft:block/oak_log_top"))
            .defaultRecipe()
            .build();

    static SimpleEntrySet<WoodType, ?> strippedPole = SimpleEntrySet.builder(WoodType.class, "pole", "stripped", CCBlocks.STRIPPED_OAK_LOG_SLAB, ()-> WoodTypeRegistry.OAK_TYPE,
                    w -> new PoleBlock(null, Utils.copyPropertySafe(w.log)))
            .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
            .dropSelf()
            .requiresChildren("stripped_log")
            .addRecipe(new ResourceLocation("carpentry_and_chisels:oak_pole"))
            .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("building_blocks")))
            .addTexture(new ResourceLocation("minecraft:block/stripped_oak_log"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/stripped_oak_pole_top"))
            .defaultRecipe()
            .build();

    public static SimpleEntrySet<?, ?> pole = SimpleEntrySet.builder(WoodType.class, "pole", CCBlocks.OAK_LOG_SLAB, ()-> WoodTypeRegistry.OAK_TYPE,
                    w -> new PoleBlock(strippedPole.blocks.get(w), Utils.copyPropertySafe(w.log)))
            .requiresFromMap(strippedPole.blocks)
            .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
            .dropSelf()
            .addRecipe(new ResourceLocation("carpentry_and_chisels:oak_pole"))
            .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("building_blocks")))
            .addTexture(new ResourceLocation("minecraft:block/oak_log"))
            .addTexture(new ResourceLocation("carpentry_and_chisels:block/oak_pole_top"))
            .build();





    public static void register() {
        mod.addEntry(carved);
        mod.addEntry(strippedLogSlab);
        mod.addEntry(logSlab);
        mod.addEntry(strippedPole);
        mod.addEntry(pole);
        EveryCompatAPI.registerModule(mod);
    }
}

package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.CarpentryAndChisels;
import com.kekecreations.carpentry_and_chisels.common.block.CCSlabBlock;
import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.kekecreations.carpentry_and_chisels.common.block.PoleBlock;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodTypeRegistry;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;

public class EveryCompatModule extends SimpleModule {

    public EveryCompatModule(String modId) {
        super(modId, "ca");

        SimpleEntrySet<?, ?> carved = SimpleEntrySet.builder(WoodType.class, "wood", "carved", CCBlocks.CARVED_OAK_WOOD, ()-> WoodTypeRegistry.OAK_TYPE,
                        w -> new CarvedWoodBlock(Utils.copyPropertySafe(w.planks)))
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .dropSelf()
                .addRecipe(CarpentryAndChisels.id("carved_oak_wood"))
                .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.withDefaultNamespace("building_blocks")))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_0"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_1"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_2"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_3"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_4"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_5"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_6"))
                .addTexture(CarpentryAndChisels.id("block/carved_oak_wood_7"))
                .build();
        this.addEntry(carved);

        SimpleEntrySet<WoodType, ?> strippedLogSlab = SimpleEntrySet.builder(WoodType.class, "log_slab", "stripped", CCBlocks.STRIPPED_OAK_LOG_SLAB, ()-> WoodTypeRegistry.OAK_TYPE,
                        w -> new CCSlabBlock(null, Utils.copyPropertySafe(w.log)))
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .copyParentDrop()
                .requiresChildren("stripped_log")
                .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.withDefaultNamespace("building_blocks")))
                .addTexture(ResourceLocation.withDefaultNamespace("block/stripped_oak_log"))
                .addTexture(ResourceLocation.withDefaultNamespace("block/stripped_oak_log_top"))
                .defaultRecipe()
                .build();
        this.addEntry(strippedLogSlab);

        SimpleEntrySet<?, ?> logSlab = SimpleEntrySet.builder(WoodType.class, "log_slab", CCBlocks.OAK_LOG_SLAB, ()-> WoodTypeRegistry.OAK_TYPE,
                        w -> new CCSlabBlock(strippedLogSlab.blocks.get(w), Utils.copyPropertySafe(w.log)))
                .requiresFromMap(strippedLogSlab.blocks)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .copyParentDrop()
                .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.withDefaultNamespace("building_blocks")))
                .addTexture(ResourceLocation.withDefaultNamespace("block/oak_log"))
                .addTexture(ResourceLocation.withDefaultNamespace("block/oak_log_top"))
                .defaultRecipe()
                .build();
        this.addEntry(logSlab);

        SimpleEntrySet<WoodType, ?> strippedPole = SimpleEntrySet.builder(WoodType.class, "pole", "stripped", CCBlocks.STRIPPED_OAK_POLE, ()-> WoodTypeRegistry.OAK_TYPE,
                        w -> new PoleBlock(null, Utils.copyPropertySafe(w.log)))
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .dropSelf()
                .requiresChildren("stripped_log")
                .addRecipe(CarpentryAndChisels.id("oak_pole"))
                .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.withDefaultNamespace("building_blocks")))
                .addTexture(CarpentryAndChisels.id("block/stripped_oak_pole"))
                .addTexture(CarpentryAndChisels.id("block/stripped_oak_pole_top"))
                .defaultRecipe()
                .build();
        this.addEntry(strippedPole);

        SimpleEntrySet<?, ?> pole = SimpleEntrySet.builder(WoodType.class, "pole", CCBlocks.OAK_POLE, ()-> WoodTypeRegistry.OAK_TYPE,
                        w -> new PoleBlock(strippedPole.blocks.get(w), Utils.copyPropertySafe(w.log)))
                .requiresFromMap(strippedPole.blocks)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .dropSelf()
                .addRecipe(CarpentryAndChisels.id("oak_pole"))
                .setTabKey(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.withDefaultNamespace("building_blocks")))
                .addTexture(CarpentryAndChisels.id("block/oak_pole"))
                .addTexture(CarpentryAndChisels.id("block/oak_pole_top"))
                .createPaletteFromChild("wood")
                .build();
        this.addEntry(pole);
    }
}

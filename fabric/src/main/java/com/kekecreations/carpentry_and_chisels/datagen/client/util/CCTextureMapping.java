package com.kekecreations.carpentry_and_chisels.datagen.client.util;

import com.kekecreations.carpentry_and_chisels.CarpentryAndChisels;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class CCTextureMapping {


    public static TextureMapping woodTextureMappings(Block block, String path) {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, getCarvedWood(block, path))
                .put(TextureSlot.TEXTURE, getCarvedWood(block, path));
    }

    public static TextureMapping slabTextureMappings(Block block) {
        return (new TextureMapping())
                .put(TextureSlot.TOP, ResourceLocation.parse(TextureMapping.getBlockTexture(block) + "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(block))
                .put(TextureSlot.BOTTOM, ResourceLocation.parse(TextureMapping.getBlockTexture(block) + "_top"));
    }

    public static TextureMapping logTextureMappings(Block block) {
        return (new TextureMapping())
                .put(TextureSlot.END, ResourceLocation.parse(TextureMapping.getBlockTexture(block) + "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(block));
    }

    public static TextureMapping poleTextureMappings(Block block) {
        return (new TextureMapping())
                .put(TextureSlot.TOP, ResourceLocation.parse(TextureMapping.getBlockTexture(block) + "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(block))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(block));
    }
    public static TextureMapping poleNormalTextureMappings(Block block, String string) {
        return (new TextureMapping())
                .put(TextureSlot.TOP, ResourceLocation.parse(TextureMapping.getBlockTexture(block) + "_top"))
                .put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/" + string + "_log"))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(block));
    }


    public static ResourceLocation getCarvedWood(Block block, String pattern) {
        return ResourceLocation.parse(TextureMapping.getBlockTexture(block) + "_" + pattern);
    }
}

package com.kekecreations.carpentry_and_chisels.datagen.client.util;

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


    public static ResourceLocation getCarvedWood(Block block, String pattern) {
        return new ResourceLocation("carpentry_and_chisels:block/" + block.getName() + "_" + pattern);
    }
}

package com.kekecreations.carpentry_and_chisels.datagen.client.util;

import com.kekecreations.carpentry_and_chisels.Constants;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class CCModelTemplate {
    public static final ModelTemplate CARVEDWOOD;

    public static final ModelTemplate SLAB;

    public static final ModelTemplate TOP_SLAB;

    public static final ModelTemplate CUBE_COLUMN;


    static {
        CARVEDWOOD = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(Constants.MOD_ID, "carved_wood").withPrefix("block/")), Optional.empty(), new TextureSlot[]{TextureSlot.TEXTURE, TextureSlot.PARTICLE});
        SLAB = new ModelTemplate(Optional.of(ResourceLocation.tryBuild("minecraft", "slab").withPrefix("block/")), Optional.empty(), new TextureSlot[]{TextureSlot.TOP, TextureSlot.SIDE, TextureSlot.BOTTOM});
        TOP_SLAB = new ModelTemplate(Optional.of(ResourceLocation.tryBuild("minecraft", "slab_top").withPrefix("block/")), Optional.empty(), new TextureSlot[]{TextureSlot.TOP, TextureSlot.SIDE, TextureSlot.BOTTOM});
        CUBE_COLUMN = new ModelTemplate(Optional.of(ResourceLocation.tryBuild("minecraft", "cube_column").withPrefix("block/")), Optional.empty(), new TextureSlot[]{TextureSlot.END, TextureSlot.SIDE});
    }
}

package com.kekecreations.carpentry_and_chisels.datagen.client.util;

import com.kekecreations.carpentry_and_chisels.Constants;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class CCModelTemplate {
    public static final ModelTemplate CARVEDWOOD;


    static {
        CARVEDWOOD = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(Constants.MOD_ID, "plaster_model").withPrefix("block/")), Optional.empty(), new TextureSlot[]{TextureSlot.TEXTURE, TextureSlot.PARTICLE});
    }
}

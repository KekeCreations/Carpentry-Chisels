package com.kekecreations.carpentry_and_chisels;


import com.kekecreations.carpentry_and_chisels.core.platform.Services;
import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCDatapackRegistries;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import com.kekecreations.carpentry_and_chisels.core.registry.EveryCompatModule;
import net.minecraft.resources.ResourceLocation;

public class CarpentryAndChisels {



    public static void init() {
        CCDatapackRegistries.register();
        CCItems.register();
        CCBlocks.register();
        if (Services.PLATFORM.isModLoaded("everycomp")) {
            EveryCompatModule.register();
        }
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
}
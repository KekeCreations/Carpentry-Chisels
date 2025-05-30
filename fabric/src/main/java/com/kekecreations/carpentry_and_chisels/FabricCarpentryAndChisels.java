package com.kekecreations.carpentry_and_chisels;

import com.kekecreations.carpentry_and_chisels.common.item.Chiseling;
import com.kekecreations.carpentry_and_chisels.core.CCItemGroupEvent;
import com.kekecreations.carpentry_and_chisels.core.registry.CCDatapackRegistries;
import com.kekecreations.carpentry_and_chisels.core.registry.CCFabricRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;

public class FabricCarpentryAndChisels implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CarpentryAndChisels.init();
        DynamicRegistries.register(CCDatapackRegistries.CHISELING, Chiseling.CODEC);
        CCFabricRegistries.register();
        CCItemGroupEvent.add();
    }
}

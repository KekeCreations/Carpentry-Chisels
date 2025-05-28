package com.kekecreations.carpentry_and_chisels;

import com.kekecreations.carpentry_and_chisels.core.CCItemGroupEvent;
import net.fabricmc.api.ModInitializer;

public class FabricCarpentryAndChisels implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CarpentryAndChisels.init();
        CCItemGroupEvent.add();
    }
}

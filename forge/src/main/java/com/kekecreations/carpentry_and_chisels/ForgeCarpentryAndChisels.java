package com.kekecreations.carpentry_and_chisels;

import com.kekecreations.carpentry_and_chisels.core.platform.ForgeRegistryHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ForgeCarpentryAndChisels {
    
    public ForgeCarpentryAndChisels() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CarpentryAndChisels.init();

        ForgeRegistryHelper.BLOCKS.register(modEventBus);
        ForgeRegistryHelper.ITEMS.register(modEventBus);
        
    }
}
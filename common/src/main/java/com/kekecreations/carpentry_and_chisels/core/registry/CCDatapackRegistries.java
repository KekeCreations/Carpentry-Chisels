package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.CarpentryAndChisels;
import com.kekecreations.carpentry_and_chisels.common.item.Chiseling;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class CCDatapackRegistries {
    public static final ResourceKey<Registry<Chiseling>> CHISELING = ResourceKey.createRegistryKey(CarpentryAndChisels.id("chiseling"));

    public static void register() {

    }
}

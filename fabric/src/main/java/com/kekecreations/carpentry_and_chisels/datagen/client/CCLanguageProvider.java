package com.kekecreations.carpentry_and_chisels.datagen.client;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CCLanguageProvider extends FabricLanguageProvider {

    public CCLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(CCBlocks.CARVED_OAK_WOOD.get(), "Oak Carved Wood");
        builder.add(CCItems.CHISEL.get(), "Chisel");

    }
}

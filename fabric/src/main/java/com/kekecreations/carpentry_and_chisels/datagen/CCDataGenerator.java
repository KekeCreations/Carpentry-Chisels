package com.kekecreations.carpentry_and_chisels.datagen;

import com.kekecreations.carpentry_and_chisels.datagen.client.CCLanguageProvider;
import com.kekecreations.carpentry_and_chisels.datagen.client.CCModelProvider;
import com.kekecreations.carpentry_and_chisels.datagen.server.CCBlockLootTableProvider;
import com.kekecreations.carpentry_and_chisels.datagen.server.CCBlockTagProvider;
import com.kekecreations.carpentry_and_chisels.datagen.server.CCRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CCDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Server Data
        pack.addProvider(CCBlockTagProvider::new);
        //pack.addProvider(ACCItemTagProvider::new);
        pack.addProvider(CCRecipeProvider::new);
        pack.addProvider(CCBlockLootTableProvider::new);

        // Client Data
        pack.addProvider(CCModelProvider::new);
        pack.addProvider(CCLanguageProvider::new);
    }
}

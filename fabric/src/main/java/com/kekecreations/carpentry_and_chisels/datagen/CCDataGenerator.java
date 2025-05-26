package com.kekecreations.carpentry_and_chisels.datagen;

import com.kekecreations.carpentry_and_chisels.datagen.client.CCLanguageProvider;
import com.kekecreations.carpentry_and_chisels.datagen.client.CCModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CCDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Server Data
        //pack.addProvider(ACCBlockTagProvider::new);
        //pack.addProvider(ACCItemTagProvider::new);
        //pack.addProvider(ACCRecipeProvider::new);
        //pack.addProvider(ACCBlockLootTableProvider::new);

        // Client Data
        pack.addProvider(CCModelProvider::new);
        pack.addProvider(CCLanguageProvider::new);
    }
}

package net.tearpelato.falldropbackportFabric;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.tearpelato.falldropbackportFabric.datagen.ModBlockLootableProvider;
import net.tearpelato.falldropbackportFabric.datagen.*;
import net.tearpelato.falldropbackportFabric.registries.ModBiomes;
import net.tearpelato.falldropbackportFabric.worldgen.ModConfiguredFeatures;
import net.tearpelato.falldropbackportFabric.worldgen.ModPlacedFeatures;

public class FallDropBackportDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockLootableProvider::new);
        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModItemsTagsProvider::new);
        pack.addProvider(ModRegistryDataProvider::new);


    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
        registryBuilder.add(Registries.BIOME, ModBiomes::bootstrap);

    }
}

package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.registries.ModBlocks;
import net.tearpelato.falldrop_backport.registries.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemsTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.POPLAR_LOGS)
                .add(Constants.getResourceKeyItem(ModBlocks.POPLAR_LOG.asItem()))
                .add(Constants.getResourceKeyItem(ModBlocks.POPLAR_WOOD.asItem()))
                .add(Constants.getResourceKeyItem(ModBlocks.STRIPPED_POPLAR_LOG.asItem()))
                .add(Constants.getResourceKeyItem(ModBlocks.STRIPPED_POPLAR_WOOD.asItem()));
        tag(ItemTags.WOODEN_TOOL_MATERIALS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_PLANKS.asItem()));
        tag(ItemTags.PLANKS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_PLANKS.asItem()));

        tag(ItemTags.WOODEN_BUTTONS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_BUTTON.asItem()));
        tag(ItemTags.WOODEN_DOORS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_DOOR.asItem()));
        tag(ItemTags.WOODEN_FENCES).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_FENCE.asItem()));
        tag(ItemTags.WOODEN_SLABS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_SLAB.asItem()));
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_PRESSURE_PLATE.asItem()));
        tag(ItemTags.WOODEN_STAIRS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_STAIRS.asItem()));
        tag(ItemTags.WOODEN_TRAPDOORS).add(Constants.getResourceKeyItem(ModBlocks.POPLAR_TRAPDOOR.asItem()));
    }
}
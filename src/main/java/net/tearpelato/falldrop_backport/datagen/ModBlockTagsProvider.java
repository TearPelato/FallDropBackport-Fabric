package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.registries.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Constants.getResourceKey(ModBlocks.POPLAR_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_PLANKS))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_SLAB))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_FENCE))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_SIGN))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_WALL_SIGN))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_HANGING_SIGN))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_WALL_HANGING_SIGN))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_DOOR))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_TRAPDOOR))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_BUTTON))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_PRESSURE_PLATE));

        tag(BlockTags.LOGS)
                .add(Constants.getResourceKey(ModBlocks.POPLAR_LOG))
                .add(Constants.getResourceKey(ModBlocks.POPLAR_WOOD))
                .add(Constants.getResourceKey(ModBlocks.STRIPPED_POPLAR_WOOD))
                .add(Constants.getResourceKey(ModBlocks.STRIPPED_POPLAR_LOG));

        tag(BlockTags.LEAVES)
                .add(Constants.getResourceKey(ModBlocks.RED_POPLAR_LEAVES))
                .add(Constants.getResourceKey(ModBlocks.ORANGE_POPLAR_LEAVES))
                .add(Constants.getResourceKey(ModBlocks.YELLOW_POPLAR_LEAVES));


        tag(BlockTags.STAIRS)
                .add(Constants.getResourceKey(ModBlocks.POPLAR_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.WHITE_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.LIGHT_GRAY_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.GRAY_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.BLACK_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.BROWN_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.RED_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.ORANGE_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.YELLOW_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.LIME_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.GREEN_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.CYAN_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.LIGHT_BLUE_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.BLUE_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.PURPLE_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.MAGENTA_WOOL_STAIRS))
                .add(Constants.getResourceKey(ModBlocks.PINK_WOOL_STAIRS));

        tag(BlockTags.SLABS)
                .add(Constants.getResourceKey(ModBlocks.POPLAR_SLAB))
                .add(Constants.getResourceKey(ModBlocks.WHITE_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.LIGHT_GRAY_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.GRAY_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.BLACK_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.BROWN_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.RED_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.ORANGE_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.YELLOW_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.LIME_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.GREEN_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.CYAN_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.LIGHT_BLUE_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.BLUE_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.PURPLE_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.MAGENTA_WOOL_SLAB))
                .add(Constants.getResourceKey(ModBlocks.PINK_WOOL_SLAB));

        tag(BlockTags.FENCES).add(Constants.getResourceKey(ModBlocks.POPLAR_FENCE));
        tag(BlockTags.FENCE_GATES).add(Constants.getResourceKey(ModBlocks.POPLAR_FENCE_GATE));
        tag(BlockTags.DOORS).add(Constants.getResourceKey(ModBlocks.POPLAR_DOOR));
        tag(BlockTags.TRAPDOORS).add(Constants.getResourceKey(ModBlocks.POPLAR_TRAPDOOR));

        tag(BlockTags.WOODEN_SHELVES).add(Constants.getResourceKey(ModBlocks.POPLAR_SHELF));


        tag(BlockTags.FLOWER_POTS)
                .add(Constants.getResourceKey(ModBlocks.POPLAR_SAPLING_POTTED))
                .add(Constants.getResourceKey(ModBlocks.RED_SHRUB_POTTED));

        tag(BlockTags.WOODEN_BUTTONS).add(Constants.getResourceKey(ModBlocks.POPLAR_BUTTON));
        tag(BlockTags.WOODEN_DOORS).add(Constants.getResourceKey(ModBlocks.POPLAR_DOOR));
        tag(BlockTags.WOODEN_FENCES).add(Constants.getResourceKey(ModBlocks.POPLAR_FENCE));
        tag(BlockTags.WOODEN_SLABS).add(Constants.getResourceKey(ModBlocks.POPLAR_SLAB));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(Constants.getResourceKey(ModBlocks.POPLAR_PRESSURE_PLATE));
        tag(BlockTags.WOODEN_STAIRS).add(Constants.getResourceKey(ModBlocks.POPLAR_STAIRS));
        tag(BlockTags.WOODEN_TRAPDOORS).add(Constants.getResourceKey(ModBlocks.POPLAR_TRAPDOOR));



    }
}
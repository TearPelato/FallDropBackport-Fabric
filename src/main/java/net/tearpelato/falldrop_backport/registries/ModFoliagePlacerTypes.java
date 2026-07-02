package net.tearpelato.falldropbackportFabric.registries;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.tearpelato.falldropbackportFabric.Constants;
import net.tearpelato.falldropbackportFabric.worldgen.placer.PoplarFoliagePlacer;

public class ModFoliagePlacerTypes {

    public static final FoliagePlacerType<PoplarFoliagePlacer> POPLAR_FOLIAGE_PLACER =
            register("poplar_foliage_placer", PoplarFoliagePlacer.CODEC);

    private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String name, MapCodec<P> codec) {
        return Registry.register(
                BuiltInRegistries.FOLIAGE_PLACER_TYPE,
                Constants.vanilla(name),
                new FoliagePlacerType<>(codec)
        );
    }

    public static void registerFoliagePlacer() {
        Constants.LOGGER.info("Registering Foliage Placers for " + Constants.MOD_ID);
    }
}
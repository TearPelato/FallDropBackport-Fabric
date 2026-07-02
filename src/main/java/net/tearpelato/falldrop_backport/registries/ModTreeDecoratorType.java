package net.tearpelato.falldropbackportFabric.registries;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.tearpelato.falldropbackportFabric.Constants;
import net.tearpelato.falldropbackportFabric.worldgen.placer.decorator.ShelfMushroomDecorator;

public class ModTreeDecoratorType {

    public static final TreeDecoratorType<ShelfMushroomDecorator> SHELF_MUSHROOM =
            register("shelf_mushroom_decorator", ShelfMushroomDecorator.CODEC);


    private static <P extends TreeDecorator> TreeDecoratorType<P> register(String name, MapCodec<P> codec) {
        return Registry.register(
                BuiltInRegistries.TREE_DECORATOR_TYPE,
                Constants.vanilla(name),
                new TreeDecoratorType<>(codec)
        );
    }


    public static void registerCreativeModeTabs() {
        Constants.LOGGER.info("Registering Tree Decorators for " + Constants.MOD_ID);
    }
}
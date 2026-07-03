package net.tearpelato.falldrop_backport.registries;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.tearpelato.falldrop_backport.Constants;

public class ModWoodType {
    public static final WoodType POPLAR = WoodType.register(new WoodType(Constants.NAMESPACE + ":poplar", BlockSetType.OAK));
}
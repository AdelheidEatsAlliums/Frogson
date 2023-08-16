package net.adelheideatsalliums.frogson.Crops;

import net.adelheideatsalliums.frogson.Crops.blockClasses.TomatoBush;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CropBlocks {
    public static final Block TOMATO_BUSH = new TomatoBush(FabricBlockSettings.copy(Blocks.BEETROOTS));
    public static final Block FLOWERING_TOMATO_BUSH = new SweetBerryBushBlock(FabricBlockSettings.copy(Blocks.POPPY));

    public static void plantSeeds() {
        Registry.register(Registries.BLOCK, new Identifier("frogson", "tomato_bush"), TOMATO_BUSH);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flowering_tomato_bush"), FLOWERING_TOMATO_BUSH);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flowering_tomato_bush"), new BlockItem(FLOWERING_TOMATO_BUSH, new FabricItemSettings()));

    }
}

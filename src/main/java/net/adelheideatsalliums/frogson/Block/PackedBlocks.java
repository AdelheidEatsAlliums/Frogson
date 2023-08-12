package net.adelheideatsalliums.frogson.Block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PackedBlocks {
    public static final Block PACKED_SHELLS_BLOCK = new Block(FabricBlockSettings.copy(Blocks.CALCITE));

    public static void registerPackedBlocks() {

        Registry.register(Registries.BLOCK, new Identifier("frogson", "packed_shells_block"), PACKED_SHELLS_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "packed_shells_block"), new BlockItem(PACKED_SHELLS_BLOCK, new FabricItemSettings()));

    }
}

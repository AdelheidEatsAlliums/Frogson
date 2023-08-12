package net.adelheideatsalliums.frogson.Block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CloudstoneBlocks {
    public static final Block CLOUDSTONE = new Block(FabricBlockSettings.copy(Blocks.TUFF));
    public static final Block COBBLECLOUDSTONE = new Block(FabricBlockSettings.copy(Blocks.TUFF));
    public static final Block CLOUDSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.TUFF));
    public static final Block COBBLECLOUDSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.TUFF));

    public static void registerCloudstoneBlocks() {

        Registry.register(Registries.BLOCK, new Identifier("frogson", "cloudstone"), CLOUDSTONE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "cloudstone"), new BlockItem(CLOUDSTONE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "cobblecloudstone"), COBBLECLOUDSTONE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "cobblecloudstone"), new BlockItem(COBBLECLOUDSTONE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "cloudstone_bricks"), CLOUDSTONE_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "cloudstone_bricks"), new BlockItem(CLOUDSTONE_BRICKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "cobblecloudstone_bricks"), COBBLECLOUDSTONE_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "cobblecloudstone_bricks"), new BlockItem(COBBLECLOUDSTONE_BRICKS, new FabricItemSettings()));

    }
}

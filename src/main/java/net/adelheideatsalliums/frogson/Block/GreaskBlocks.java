package net.adelheideatsalliums.frogson.Block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GreaskBlocks {
    public static final Item GREASK = new Item(new FabricItemSettings());
    public static final Block GREASK_BLOCK = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GREASK = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block CUT_POLISHED_GREASK = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final PillarBlock POLISHED_GREASK_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block LARGE_GREASK_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block MEDIUM_GREASK_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block SMALL_GREASK_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block GREASKOT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block GREASKOTIN_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());

    public static void registerGreaskBlocks() {

        Registry.register(Registries.ITEM, new Identifier("frogson", "greask"), GREASK);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "greask_block"), GREASK_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "greask_block"), new BlockItem(GREASK_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "polished_greask"), POLISHED_GREASK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "polished_greask"), new BlockItem(POLISHED_GREASK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "cut_polished_greask"), CUT_POLISHED_GREASK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "cut_polished_greask"), new BlockItem(CUT_POLISHED_GREASK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "polished_greask_pillar"), POLISHED_GREASK_PILLAR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "polished_greask_pillar"), new BlockItem(POLISHED_GREASK_PILLAR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "large_greask_bricks"), LARGE_GREASK_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "large_greask_bricks"), new BlockItem(LARGE_GREASK_BRICKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "medium_greask_bricks"), MEDIUM_GREASK_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "medium_greask_bricks"), new BlockItem(MEDIUM_GREASK_BRICKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "small_greask_bricks"), SMALL_GREASK_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "small_greask_bricks"), new BlockItem(SMALL_GREASK_BRICKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "greaskot_bricks"), GREASKOT_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "greaskot_bricks"), new BlockItem(GREASKOT_BRICKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "greaskotin_bricks"), GREASKOTIN_BRICKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "greaskotin_bricks"), new BlockItem(GREASKOTIN_BRICKS, new FabricItemSettings()));

    }
}

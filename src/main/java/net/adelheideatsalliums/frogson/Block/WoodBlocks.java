package net.adelheideatsalliums.frogson.Block;

import net.adelheideatsalliums.frogson.Block.classes.FrogsonStairsBlock;
import net.adelheideatsalliums.frogson.Block.classes.FrogsonTrapdoorBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WoodBlocks {
    public static final Block NASCHJA_WOOD = new Block(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static final Block NASCHJA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final Block NASCHJA_DOOR = new DoorBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON);
    public static final Block NASCHJA_TRAPDOOR = new FrogsonTrapdoorBlock(FabricBlockSettings.copy(Blocks.CRIMSON_TRAPDOOR), BlockSetType.CRIMSON);
    public static final Block NASCHJA_STAIRS = new FrogsonStairsBlock(NASCHJA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block NASCHJA_PLANK_STAIRS = new FrogsonStairsBlock(NASCHJA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_PLANKS));
    public static final Block NASCHJA_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block NASCHJA_PLANK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_PLANKS));

    public static final Block MOSSENSCHON_WOOD = new Block(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static final Block MOSSENSCHON_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final Block MOSSENSCHON_DOOR = new DoorBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON);
    public static final Block MOSSENSCHON_TRAPDOOR = new FrogsonTrapdoorBlock(FabricBlockSettings.copy(Blocks.CRIMSON_TRAPDOOR), BlockSetType.CRIMSON);
    public static final Block MOSSENSCHON_STAIRS = new FrogsonStairsBlock(NASCHJA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block MOSSENSCHON_PLANK_STAIRS = new FrogsonStairsBlock(NASCHJA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_PLANKS));
    public static final Block MOSSENSCHON_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block MOSSENSCHON_PLANK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_PLANKS));

    public static final Block KESTEKTLA_WOOD = new Block(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static final Block KESTEKTLA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final Block KESTEKTLA_DOOR = new DoorBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON);
    public static final Block KESTEKTLA_TRAPDOOR = new FrogsonTrapdoorBlock(FabricBlockSettings.copy(Blocks.CRIMSON_TRAPDOOR), BlockSetType.CRIMSON);
    public static final Block KESTEKTLA_STAIRS = new FrogsonStairsBlock(NASCHJA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block KESTEKTLA_PLANK_STAIRS = new FrogsonStairsBlock(NASCHJA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_PLANKS));
    public static final Block KESTEKTLA_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block KESTEKTLA_PLANK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_PLANKS));

    public static final Block FLONSAGAL_WOOD = new Block(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static final Block FLONSAGAL_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final Block FLONSAGAL_DOOR = new DoorBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON);
    public static final Block FLONSAGAL_TRAPDOOR = new FrogsonTrapdoorBlock(FabricBlockSettings.copy(Blocks.CRIMSON_TRAPDOOR), BlockSetType.CRIMSON);
    public static final Block FLONSAGAL_STAIRS = new FrogsonStairsBlock(NASCHJA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block FLONSAGAL_PLANK_STAIRS = new FrogsonStairsBlock(NASCHJA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(NASCHJA_PLANKS));
    public static final Block FLONSAGAL_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_WOOD));
    public static final Block FLONSAGAL_PLANK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(NASCHJA_PLANKS));

    public static void registerWoodBlocks() {
        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_wood"), NASCHJA_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_wood"), new BlockItem(NASCHJA_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_planks"), NASCHJA_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_planks"), new BlockItem(NASCHJA_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_door"), NASCHJA_DOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_door"), new BlockItem(NASCHJA_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_trapdoor"), NASCHJA_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_trapdoor"), new BlockItem(NASCHJA_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_stairs"), NASCHJA_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_stairs"), new BlockItem(NASCHJA_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_plank_stairs"), NASCHJA_PLANK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_plank_stairs"), new BlockItem(NASCHJA_PLANK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_slab"), NASCHJA_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_slab"), new BlockItem(NASCHJA_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "naschja_plank_slab"), NASCHJA_PLANK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "naschja_plank_slab"), new BlockItem(NASCHJA_PLANK_SLAB, new FabricItemSettings()));


        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_wood"), MOSSENSCHON_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_wood"), new BlockItem(MOSSENSCHON_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_planks"), MOSSENSCHON_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_planks"), new BlockItem(MOSSENSCHON_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_door"), MOSSENSCHON_DOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_door"), new BlockItem(MOSSENSCHON_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_trapdoor"), MOSSENSCHON_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_trapdoor"), new BlockItem(MOSSENSCHON_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_stairs"), MOSSENSCHON_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_stairs"), new BlockItem(MOSSENSCHON_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_plank_stairs"), MOSSENSCHON_PLANK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_plank_stairs"), new BlockItem(MOSSENSCHON_PLANK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_slab"), MOSSENSCHON_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_slab"), new BlockItem(MOSSENSCHON_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "mossenschon_plank_slab"), MOSSENSCHON_PLANK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "mossenschon_plank_slab"), new BlockItem(MOSSENSCHON_PLANK_SLAB, new FabricItemSettings()));


        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_wood"), KESTEKTLA_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_wood"), new BlockItem(KESTEKTLA_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_planks"), KESTEKTLA_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_planks"), new BlockItem(KESTEKTLA_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_door"), KESTEKTLA_DOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_door"), new BlockItem(KESTEKTLA_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_trapdoor"), KESTEKTLA_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_trapdoor"), new BlockItem(KESTEKTLA_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_stairs"), KESTEKTLA_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_stairs"), new BlockItem(KESTEKTLA_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_plank_stairs"), KESTEKTLA_PLANK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_plank_stairs"), new BlockItem(KESTEKTLA_PLANK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_slab"), KESTEKTLA_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_slab"), new BlockItem(KESTEKTLA_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kestektla_plank_slab"), KESTEKTLA_PLANK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kestektla_plank_slab"), new BlockItem(KESTEKTLA_PLANK_SLAB, new FabricItemSettings()));


        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_wood"), FLONSAGAL_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_wood"), new BlockItem(FLONSAGAL_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_planks"), FLONSAGAL_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_planks"), new BlockItem(FLONSAGAL_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_door"), FLONSAGAL_DOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_door"), new BlockItem(FLONSAGAL_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_trapdoor"), FLONSAGAL_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_trapdoor"), new BlockItem(FLONSAGAL_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_stairs"), FLONSAGAL_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_stairs"), new BlockItem(FLONSAGAL_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_plank_stairs"), FLONSAGAL_PLANK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_plank_stairs"), new BlockItem(FLONSAGAL_PLANK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_slab"), FLONSAGAL_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_slab"), new BlockItem(FLONSAGAL_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "flonsagal_plank_slab"), FLONSAGAL_PLANK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "flonsagal_plank_slab"), new BlockItem(FLONSAGAL_PLANK_SLAB, new FabricItemSettings()));

    }
}

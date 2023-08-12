package net.adelheideatsalliums.frogson.Registry;

import net.adelheideatsalliums.frogson.ArmorAndTool.*;
import net.adelheideatsalliums.frogson.Block.*;
import net.adelheideatsalliums.frogson.Item.FrogsonFoods;
import net.adelheideatsalliums.frogson.Item.FrogsonIngredients;
import net.adelheideatsalliums.frogson.Item.TonslanItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ItemGroupPlacement {

    public static void ItemGroupPlacementRegister(){

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Blocks.WARPED_BUTTON, WoodBlocks.NASCHJA_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(WoodBlocks.NASCHJA_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_WOOD, WoodBlocks.NASCHJA_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_STAIRS, WoodBlocks.NASCHJA_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_SLAB, WoodBlocks.NASCHJA_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_PLANKS, WoodBlocks.NASCHJA_PLANK_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_PLANK_STAIRS, WoodBlocks.NASCHJA_PLANK_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_PLANK_SLAB, WoodBlocks.NASCHJA_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_DOOR, WoodBlocks.NASCHJA_TRAPDOOR);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.NASCHJA_TRAPDOOR, WoodBlocks.MOSSENSCHON_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(WoodBlocks.MOSSENSCHON_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_WOOD, WoodBlocks.MOSSENSCHON_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_STAIRS, WoodBlocks.MOSSENSCHON_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_SLAB, WoodBlocks.MOSSENSCHON_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_PLANKS, WoodBlocks.MOSSENSCHON_PLANK_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_PLANK_STAIRS, WoodBlocks.MOSSENSCHON_PLANK_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_PLANK_SLAB, WoodBlocks.MOSSENSCHON_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_DOOR, WoodBlocks.MOSSENSCHON_TRAPDOOR);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.MOSSENSCHON_TRAPDOOR, WoodBlocks.KESTEKTLA_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(WoodBlocks.KESTEKTLA_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_WOOD, WoodBlocks.KESTEKTLA_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_STAIRS, WoodBlocks.KESTEKTLA_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_SLAB, WoodBlocks.KESTEKTLA_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_PLANKS, WoodBlocks.KESTEKTLA_PLANK_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_PLANK_STAIRS, WoodBlocks.KESTEKTLA_PLANK_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_PLANK_SLAB, WoodBlocks.KESTEKTLA_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_DOOR, WoodBlocks.KESTEKTLA_TRAPDOOR);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.KESTEKTLA_TRAPDOOR, WoodBlocks.FLONSAGAL_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(WoodBlocks.FLONSAGAL_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_WOOD, WoodBlocks.FLONSAGAL_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_STAIRS, WoodBlocks.FLONSAGAL_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_SLAB, WoodBlocks.FLONSAGAL_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_PLANKS, WoodBlocks.FLONSAGAL_PLANK_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_PLANK_STAIRS, WoodBlocks.FLONSAGAL_PLANK_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_PLANK_SLAB, WoodBlocks.FLONSAGAL_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_DOOR, WoodBlocks.FLONSAGAL_TRAPDOOR);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(ScheelchBlocks.SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ScheelchBlocks.SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ScheelchBlocks.SMOOTH_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.SMOOTH_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.RED_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.ORANGE_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.YELLOW_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIME_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.GREEN_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.CYAN_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIGHT_BLUE_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BLUE_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.PURPLE_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.MAGENTA_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.PINK_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BROWN_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.WHITE_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIGHT_GRAY_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.GRAY_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BLACK_SHCEELCH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.CACTUS_SHCEELCH);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ScheelchBlocks.SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.RED_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.ORANGE_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.YELLOW_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIME_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.GREEN_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.CYAN_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIGHT_BLUE_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BLUE_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.PURPLE_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.MAGENTA_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.PINK_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BROWN_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.WHITE_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIGHT_GRAY_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.GRAY_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BLACK_SHCEELCH_TILE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.CACTUS_SHCEELCH_TILE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ScheelchBlocks.SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.RED_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.ORANGE_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.YELLOW_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIME_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.GREEN_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.CYAN_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIGHT_BLUE_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BLUE_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.PURPLE_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.MAGENTA_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.PINK_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BROWN_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.WHITE_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.LIGHT_GRAY_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.GRAY_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.BLACK_SHCEELCH_TILES);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ScheelchBlocks.CACTUS_SHCEELCH_TILES);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.ROSE_QUARTZ);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.ROSE_QUARTZ_ORE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, FrogsonMaterials.ROSE_QUARTZ_BLOCK);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.MALACHITE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.MALACHITE_ORE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonMaterials.ROSE_QUARTZ_BLOCK, FrogsonMaterials.MALACHITE_BLOCK);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.RAW_RAINBOW_IRON);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.RAINBOW_IRON_INGOT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.RAINBOW_IRON_NUGGET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.RAINBOW_IRON_ORE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.RAW_RAINBOW_IRON_BLOCK);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonMaterials.MALACHITE_BLOCK, FrogsonMaterials.RAINBOW_IRON_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonMaterials.RAINBOW_IRON_BLOCK, FrogsonMaterials.ENDENSKIAL_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonMaterials.ENDENSKIAL_BLOCK, FrogsonIngredients.ENDLIESKINDAEL_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonIngredients.ENDLIESKINDAEL_BLOCK, FrogsonIngredients.QUANTENDIUM_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonIngredients.QUANTENDIUM_BLOCK, FrogsonIngredients.TENTILIMUNELIESK_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonIngredients.TENTILIMUNELIESK_BLOCK, FrogsonIngredients.MALACHITE_ROSE_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonIngredients.MALACHITE_ROSE_BLOCK, PackedBlocks.PACKED_SHELLS_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(PackedBlocks.PACKED_SHELLS_BLOCK, FrogsonMaterials.ANDESITE_PERIWINKLE_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(FrogsonMaterials.ANDESITE_PERIWINKLE_BLOCK, TonslanBlocks.AQUAFELDMARINE_BLOCK);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(GreaskBlocks.GREASK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(GreaskBlocks.GREASK_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(CloudstoneBlocks.COBBLECLOUDSTONE_BRICKS, GreaskBlocks.GREASK_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.GREASK_BLOCK, GreaskBlocks.POLISHED_GREASK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.POLISHED_GREASK, GreaskBlocks.CUT_POLISHED_GREASK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.CUT_POLISHED_GREASK, GreaskBlocks.POLISHED_GREASK_PILLAR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.POLISHED_GREASK_PILLAR, GreaskBlocks.LARGE_GREASK_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.LARGE_GREASK_BRICKS, GreaskBlocks.MEDIUM_GREASK_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.MEDIUM_GREASK_BRICKS, GreaskBlocks.SMALL_GREASK_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.SMALL_GREASK_BRICKS, GreaskBlocks.GREASKOT_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(GreaskBlocks.GREASKOT_BRICKS, GreaskBlocks.GREASKOTIN_BRICKS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.GREASKNEDNUM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.ENDELIESK_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.ENDELIESK_PEARL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.ENDENSKIAL_ORB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.ENDLIESKINDAEL_INGOT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.ENDLIESKINDAEL_NUGGET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.TENTILIMUNELIESK_INGOT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.TENTILIMUNELIESK_NUGGET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.TENTILIMUNELIESK_PAPER);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.TENTILIMUNELIESK_POWDER);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(Items.DIAMOND_SHOVEL, AmethystSet.AMETHYST_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(AmethystSet.AMETHYST_SHOVEL, AmethystSet.AMETHYST_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(AmethystSet.AMETHYST_PICKAXE, AmethystSet.AMETHYST_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(AmethystSet.AMETHYST_AXE, AmethystSet.AMETHYST_HOE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(Items.DIAMOND_SWORD, AmethystSet.AMETHYST_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(Items.DIAMOND_AXE, AmethystSet.AMETHYST_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(Items.DIAMOND_BOOTS, AmethystSet.AMETHYST_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(AmethystSet.AMETHYST_HELMET, AmethystSet.AMETHYST_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(AmethystSet.AMETHYST_CHESTPLATE, AmethystSet.AMETHYST_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(AmethystSet.AMETHYST_LEGGINGS, AmethystSet.AMETHYST_BOOTS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(AmethystSet.AMETHYST_HOE, RoseQuartzSet.ROSE_QUARTZ_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_SHOVEL, RoseQuartzSet.ROSE_QUARTZ_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_PICKAXE, RoseQuartzSet.ROSE_QUARTZ_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_AXE, RoseQuartzSet.ROSE_QUARTZ_HOE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(AmethystSet.AMETHYST_SWORD, RoseQuartzSet.ROSE_QUARTZ_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(AmethystSet.AMETHYST_AXE, RoseQuartzSet.ROSE_QUARTZ_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(AmethystSet.AMETHYST_BOOTS, RoseQuartzSet.ROSE_QUARTZ_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_HELMET, RoseQuartzSet.ROSE_QUARTZ_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_CHESTPLATE, RoseQuartzSet.ROSE_QUARTZ_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_LEGGINGS, RoseQuartzSet.ROSE_QUARTZ_BOOTS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_HOE, MalachiteSet.MALACHITE_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteSet.MALACHITE_SHOVEL, MalachiteSet.MALACHITE_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteSet.MALACHITE_PICKAXE, MalachiteSet.MALACHITE_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteSet.MALACHITE_AXE, MalachiteSet.MALACHITE_HOE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_SWORD, MalachiteSet.MALACHITE_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_AXE, MalachiteSet.MALACHITE_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RoseQuartzSet.ROSE_QUARTZ_BOOTS, MalachiteSet.MALACHITE_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteSet.MALACHITE_HELMET, MalachiteSet.MALACHITE_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteSet.MALACHITE_CHESTPLATE, MalachiteSet.MALACHITE_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteSet.MALACHITE_LEGGINGS, MalachiteSet.MALACHITE_BOOTS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteSet.MALACHITE_HOE, RainbowIronSet.RAINBOW_IRON_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RainbowIronSet.RAINBOW_IRON_SHOVEL, RainbowIronSet.RAINBOW_IRON_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RainbowIronSet.RAINBOW_IRON_PICKAXE, RainbowIronSet.RAINBOW_IRON_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(RainbowIronSet.RAINBOW_IRON_AXE, RainbowIronSet.RAINBOW_IRON_HOE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteSet.MALACHITE_SWORD, RainbowIronSet.RAINBOW_IRON_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteSet.MALACHITE_AXE, RainbowIronSet.RAINBOW_IRON_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteSet.MALACHITE_BOOTS, RainbowIronSet.RAINBOW_IRON_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RainbowIronSet.RAINBOW_IRON_HELMET, RainbowIronSet.RAINBOW_IRON_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RainbowIronSet.RAINBOW_IRON_CHESTPLATE, RainbowIronSet.RAINBOW_IRON_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(RainbowIronSet.RAINBOW_IRON_LEGGINGS, RainbowIronSet.RAINBOW_IRON_BOOTS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(Items.NETHERITE_SHOVEL, TentilimunelieskSet.TENTILIMUNELIESK_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_SHOVEL, TentilimunelieskSet.TENTILIMUNELIESK_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_PICKAXE, TentilimunelieskSet.TENTILIMUNELIESK_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_AXE, TentilimunelieskSet.TENTILIMUNELIESK_HOE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(Items.NETHERITE_SWORD, TentilimunelieskSet.TENTILIMUNELIESK_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(Items.NETHERITE_AXE, TentilimunelieskSet.TENTILIMUNELIESK_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(Items.NETHERITE_BOOTS, TentilimunelieskSet.TENTILIMUNELIESK_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_HELMET, TentilimunelieskSet.TENTILIMUNELIESK_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_CHESTPLATE, TentilimunelieskSet.TENTILIMUNELIESK_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_LEGGINGS, TentilimunelieskSet.TENTILIMUNELIESK_BOOTS);});
;
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_HOE, MalachiteRoseSet.MALACHHITE_ROSE_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteRoseSet.MALACHHITE_ROSE_SHOVEL, MalachiteRoseSet.MALACHHITE_ROSE_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteRoseSet.MALACHHITE_ROSE_PICKAXE, MalachiteRoseSet.MALACHHITE_ROSE_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.addAfter(MalachiteRoseSet.MALACHHITE_ROSE_AXE, MalachiteRoseSet.MALACHHITE_ROSE_HOE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_SWORD, MalachiteRoseSet.MALACHHITE_ROSE_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_AXE, MalachiteRoseSet.MALACHHITE_ROSE_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(TentilimunelieskSet.TENTILIMUNELIESK_BOOTS, MalachiteRoseSet.MALACHHITE_ROSE_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteRoseSet.MALACHHITE_ROSE_HELMET, MalachiteRoseSet.MALACHHITE_ROSE_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteRoseSet.MALACHHITE_ROSE_CHESTPLATE, MalachiteRoseSet.MALACHHITE_ROSE_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {content.addAfter(MalachiteRoseSet.MALACHHITE_ROSE_LEGGINGS, MalachiteRoseSet.MALACHHITE_ROSE_BOOTS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.QUANTENDIUM_INGOT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.QUANTENDIUM_NUGGET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.QUANTENDIUM_PLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.QUANTENDIUM_ROD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.MALACHITE_ROSE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.TESSKELTINIAL_EYE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.RAW_ENDENSKIAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.ENDENSKIAL_INGOT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.ENDENSKIAL_NUGGET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.ENDENSKIAL_ORE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.RAW_ENDENSKIAL_BLOCK);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.OBSIDIAN_ROSE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(FrogsonMaterials.OBSIDIAN_ROSE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonMaterials.ANDESITE_PERIWINKLE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(CloudstoneBlocks.CLOUDSTONE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Blocks.REINFORCED_DEEPSLATE, CloudstoneBlocks.CLOUDSTONE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(CloudstoneBlocks.CLOUDSTONE, CloudstoneBlocks.COBBLECLOUDSTONE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(CloudstoneBlocks.COBBLECLOUDSTONE, CloudstoneBlocks.CLOUDSTONE_BRICKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(CloudstoneBlocks.CLOUDSTONE_BRICKS, CloudstoneBlocks.COBBLECLOUDSTONE_BRICKS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Blocks.DRAGON_EGG, DecorationBlocks.BOOK_STACK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(DecorationBlocks.BOOK_STACK, DecorationBlocks.DECORATED_PYRAMID);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(DecorationBlocks.DECORATED_PYRAMID, DecorationBlocks.DECORATED_CASTLE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Items.PAINTING, Painteds.CANVAS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Painteds.CANVAS, Painteds.PAINTED_BUMPY_WINDS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Painteds.PAINTED_BUMPY_WINDS, Painteds.PAINTED_CLOUD_LIGHT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Painteds.PAINTED_CLOUD_LIGHT, Painteds.PAINTED_DISTANCED_LAYERS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Painteds.PAINTED_DISTANCED_LAYERS, Painteds.PAINTED_ODD_FOG);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Painteds.PAINTED_ODD_FOG, Painteds.PAINTED_PERSON);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Painteds.PAINTED_PERSON, Painteds.PAINTED_SHAPE_COLORS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.AZALEAS_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.EDELIS_LAVENDAR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.DEADYNELOS_CRYSTALS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.SMOOTH_MOSS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.MOLTEN_BLOOD_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.LAPIS_MALACHETS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.ROTTENZIANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.EDELIS_TEAR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.LOTAKELI_DUST);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.TOPERITIS_PEARL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.EDELIS_LILAC);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.QUANTE_MALACHITE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(FrogsonIngredients.BLOODY_EDELIS_LAVENDAR);});


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.COARSE_OLZHANZ);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.OLZHANZ);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.LIGHT_FOLTISNAM_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.FOLTISNAM_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.FOLTISNAM_CARPET);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.AGELISTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(WoodBlocks.FLONSAGAL_TRAPDOOR, TonslanBlocks.AGELISTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.AGELISTEM, TonslanBlocks.AGELISTEM_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.AGELISTEM_WOOD, TonslanBlocks.STRIPPED_AGELISTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_AGELISTEM, TonslanBlocks.STRIPPED_AGELISTEM_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_AGELISTEM_WOOD, TonslanBlocks.HOLLOWED_AGELISTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.HOLLOWED_AGELISTEM, TonslanBlocks.STRIPPED_HOLLOWED_AGELISTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_HOLLOWED_AGELISTEM, TonslanBlocks.AGELISTEM_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.AGELIKEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.AGELIKEM_CARPET);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.GELEMSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.AGELISTEM_PLANKS, TonslanBlocks.GELEMSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.GELEMSTEM, TonslanBlocks.GELEMSTEM_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.GELEMSTEM_WOOD, TonslanBlocks.STRIPPED_GELEMSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_GELEMSTEM, TonslanBlocks.STRIPPED_GELEMSTEM_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_GELEMSTEM_WOOD, TonslanBlocks.HOLLOWED_GELEMSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.HOLLOWED_GELEMSTEM, TonslanBlocks.STRIPPED_HOLLOWED_GELEMSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_HOLLOWED_GELEMSTEM, TonslanBlocks.GELEMSTEM_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.GELEMKEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.GELEMKEM_CARPET);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.EMELSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.GELEMSTEM_PLANKS, TonslanBlocks.EMELSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.EMELSTEM, TonslanBlocks.EMELSTEM_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.EMELSTEM_WOOD, TonslanBlocks.STRIPPED_EMELSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_EMELSTEM, TonslanBlocks.STRIPPED_EMELSTEM_WOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_EMELSTEM_WOOD, TonslanBlocks.HOLLOWED_EMELSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.HOLLOWED_EMELSTEM, TonslanBlocks.STRIPPED_HOLLOWED_EMELSTEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(TonslanBlocks.STRIPPED_HOLLOWED_EMELSTEM, TonslanBlocks.EMELSTEM_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.EMELKEM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.EMELKEM_CARPET);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Blocks.PEARLESCENT_FROGLIGHT, TonslanBlocks.AGARTUNS_LIGHT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(TonslanBlocks.AGARTUNS_LIGHT, TonslanBlocks.FELMOND_LIGHT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.FELMOND_LIGHT);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.AGARTUNS_LIGHT);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.add(TonslanBlocks.AQUAFELDMARINE_ORE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.add(TonslanItems.AQUAFELDMARINE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(Blocks.WARPED_FUNGUS, TonslanBlocks.LENELS_MUSHROOM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.LENELS_MUSHROOM, TonslanBlocks.EMDETIS_MUSHROOM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.EMDETIS_MUSHROOM, TonslanBlocks.MOLZHENSS_MUSHROOM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.MOLZHENSS_MUSHROOM, TonslanBlocks.AQELIONOS_MUSHROOM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.AQELIONOS_MUSHROOM, TonslanBlocks.POKIPAN_MUSHROOM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.POKIPAN_MUSHROOM, TonslanBlocks.POMZ_MUSHROOM);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.POMZ_MUSHROOM, TonslanBlocks.WANZEE_MUSHROOMS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.WANZEE_MUSHROOMS, TonslanBlocks.POSTEN_FLOWERS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {content.addAfter(TonslanBlocks.POSTEN_FLOWERS, TonslanBlocks.LEMZU);});


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(Items.APPLE, FrogsonFoods.POISON_APPLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(FrogsonFoods.POISON_APPLE, FrogsonFoods.FROZEN_APPLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(FrogsonFoods.FROZEN_APPLE, FrogsonFoods.GREEN_APPLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(FrogsonFoods.GREEN_APPLE, FrogsonFoods.YELLOW_APPLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(FrogsonFoods.YELLOW_APPLE, FrogsonFoods.NIGHT_APPLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(FrogsonFoods.NIGHT_APPLE, FrogsonFoods.XP_APPLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(Items.COOKED_BEEF, FrogsonFoods.EQUINE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(FrogsonFoods.EQUINE, FrogsonFoods.COOKED_EQUINE);});
    }
}

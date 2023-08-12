package net.adelheideatsalliums.frogson.Block;

import net.adelheideatsalliums.frogson.Block.classes.*;
import net.adelheideatsalliums.frogson.Registry.Effects;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class TonslanBlocks {
    public static final Block OLZHANZ = new Block(FabricBlockSettings.create()
            .strength(1.0f, 1.5f).sounds(BlockSoundGroup.CORAL).requiresTool().mapColor(MapColor.TERRACOTTA_RED));
    public static final Block COARSE_OLZHANZ = new Block(FabricBlockSettings.create()
            .strength(1.0f, 1.5f).sounds(BlockSoundGroup.CORAL).requiresTool().mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final Block FOLTISNAM_BLOCK = new FoltisnamBlock(AbstractBlock.Settings.create()
            .strength(1.0f, 1.5f).sounds(BlockSoundGroup.MOSS_BLOCK).requiresTool().mapColor(MapColor.TERRACOTTA_GREEN));
    public static final Block LIGHT_FOLTISNAM_BLOCK = new FoltisnamBlock(AbstractBlock.Settings.create()
            .strength(1.0f, 1.5f).sounds(BlockSoundGroup.MOSS_BLOCK).requiresTool().mapColor(MapColor.SPRUCE_BROWN));
    public static final Block FOLTISNAM_CARPET = new CarpetBlock(FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET).mapColor(MapColor.TERRACOTTA_GREEN));
    public static final Block ABALONIN_SPROUTS = new AbaloninSproutsBlock(AbstractBlock.Settings.create()
            .breakInstantly().noCollision().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_GREEN));
    public static final Block KITENS_FERN = new KitensFernBlock(AbstractBlock.Settings.create()
            .breakInstantly().noCollision().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_GREEN));
    public static final Block OLETSEK_FERN = new OletsekFernBlock(AbstractBlock.Settings.create()
            .breakInstantly().noCollision().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_YELLOW));
    public static final Block POSTEN_FLOWERS = new TonslanFlowerbedBlock(AbstractBlock.Settings.create()
            .noCollision().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.PINK_PETALS).mapColor(MapColor.PURPLE));
    public static final Block FELMOND_LIGHT = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.DESTROY).luminance(value -> 13).strength(0.4f).sounds(BlockSoundGroup.FROGLIGHT).mapColor(MapColor.PALE_PURPLE));
    public static final Block AGARTUNS_LIGHT = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.DESTROY).luminance(value -> 6).strength(0.4f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.TERRACOTTA_BLACK));
    public static final Block EMELSTEM = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block GELEMSTEM = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block AGELISTEM = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block FOLTISNAM_EMELSTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block FOLTISNAM_GELEMSTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block FOLTISNAM_AGELISTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block EMELSTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block GELEMSTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block AGELISTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_EMELSTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block STRIPPED_GELEMSTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_AGELISTEM_WOOD = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_EMELSTEM = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block STRIPPED_GELEMSTEM = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_AGELISTEM = new PillarBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.CYAN));
    public static final Block HOLLOWED_EMELSTEM = new HollowLogBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block HOLLOWED_GELEMSTEM = new HollowLogBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block HOLLOWED_AGELISTEM = new HollowLogBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.CYAN));
    public static final Block STRIPPED_HOLLOWED_EMELSTEM = new HollowLogBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.PURPLE));
    public static final Block STRIPPED_HOLLOWED_GELEMSTEM = new HollowLogBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_HOLLOWED_AGELISTEM = new HollowLogBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_STEM).mapColor(MapColor.CYAN));
    public static final Block EMELKEM = new FrogsonLeavesBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.5f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.PURPLE));
    public static final Block GELEMKEM = new FrogsonLeavesBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.5f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block AGELIKEM = new FrogsonLeavesBlock(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.5f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.CYAN));
    public static final Block EMELSTEM_PLANKS = new Block(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_WOOD).mapColor(MapColor.PURPLE));
    public static final Block GELEMSTEM_PLANKS = new Block(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_WOOD).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block AGELISTEM_PLANKS = new Block(AbstractBlock.Settings.create()
            .pistonBehavior(PistonBehavior.NORMAL).strength(2.2f).sounds(BlockSoundGroup.NETHER_WOOD).mapColor(MapColor.CYAN));
    public static final Block EMELKEM_CARPET = new CarpetBlock(FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.1f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.PURPLE));
    public static final Block GELEMKEM_CARPET = new CarpetBlock(FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.1f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block AGELIKEM_CARPET = new CarpetBlock(FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).strength(0.1f).sounds(BlockSoundGroup.SCULK).mapColor(MapColor.CYAN));
    public static final Block AQUAFELDMARINE_ORE = new Block(FabricBlockSettings.create()
            .strength(3.5f, 9.0f).requiresTool().mapColor(MapColor.PALE_YELLOW));
    public static final Block AQUAFELDMARINE_BLOCK = new Block(FabricBlockSettings.create()
            .strength(5.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().mapColor(MapColor.TERRACOTTA_GREEN));
    public static final Block LENELS_MUSHROOM = new TonslanFlowerBlock(StatusEffects.BLINDNESS, 7, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_BLUE));
    public static final Block EMDETIS_MUSHROOM = new TonslanFlowerBlock(StatusEffects.HEALTH_BOOST, 8, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_PINK));
    public static final Block MOLZHENSS_MUSHROOM = new TonslanFlowerBlock(StatusEffects.HASTE, 33, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.PALE_PURPLE));
    public static final Block AQELIONOS_MUSHROOM = new TonslanFlowerBlock(StatusEffects.CONDUIT_POWER, 22, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block POKIPAN_MUSHROOM = new TonslanFlowerBlock(StatusEffects.DARKNESS, 20, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block POMZ_MUSHROOM = new TonslanFlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE, 256, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block WANZEE_MUSHROOMS = new TonslanFlowerBlock(StatusEffects.LUCK, 128, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block LEMZU = new TonslanFlowerBlock(Effects.EXPERIENCED, 1, FabricBlockSettings.create()
            .pistonBehavior(PistonBehavior.DESTROY).breakInstantly().noCollision().sounds(BlockSoundGroup.HANGING_ROOTS).mapColor(MapColor.TERRACOTTA_RED));


    public static void registerTonslanBlocks() {

        Registry.register(Registries.BLOCK, new Identifier("frogson", "olzhanz"), OLZHANZ);
        Registry.register(Registries.ITEM, new Identifier("frogson", "olzhanz"), new BlockItem(OLZHANZ, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "coarse_olzhanz"), COARSE_OLZHANZ);
        Registry.register(Registries.ITEM, new Identifier("frogson", "coarse_olzhanz"), new BlockItem(COARSE_OLZHANZ, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "foltisnam_block"), FOLTISNAM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "foltisnam_block"), new BlockItem(FOLTISNAM_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "light_foltisnam_block"), LIGHT_FOLTISNAM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "light_foltisnam_block"), new BlockItem(LIGHT_FOLTISNAM_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "foltisnam_carpet"), FOLTISNAM_CARPET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "foltisnam_carpet"), new BlockItem(FOLTISNAM_CARPET, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "abalonin_sprouts"), ABALONIN_SPROUTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "abalonin_sprouts"), new BlockItem(ABALONIN_SPROUTS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "kitens_fern"), KITENS_FERN);
        Registry.register(Registries.ITEM, new Identifier("frogson", "kitens_fern"), new BlockItem(KITENS_FERN, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "oletsek_fern"), OLETSEK_FERN);
        Registry.register(Registries.ITEM, new Identifier("frogson", "oletsek_fern"), new BlockItem(OLETSEK_FERN, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "posten_flowers"), POSTEN_FLOWERS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "posten_flowers"), new BlockItem(POSTEN_FLOWERS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "felmond_light"), FELMOND_LIGHT);
        Registry.register(Registries.ITEM, new Identifier("frogson", "felmond_light"), new BlockItem(FELMOND_LIGHT, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "agartuns_light"), AGARTUNS_LIGHT);
        Registry.register(Registries.ITEM, new Identifier("frogson", "agartuns_light"), new BlockItem(AGARTUNS_LIGHT, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "emelstem"), EMELSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "emelstem"), new BlockItem(EMELSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "gelemstem"), GELEMSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "gelemstem"), new BlockItem(GELEMSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "agelistem"), AGELISTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "agelistem"), new BlockItem(AGELISTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "emelstem_wood"), EMELSTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "emelstem_wood"), new BlockItem(EMELSTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "gelemstem_wood"), GELEMSTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "gelemstem_wood"), new BlockItem(GELEMSTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "agelistem_wood"), AGELISTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "agelistem_wood"), new BlockItem(AGELISTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "foltisnam_emelstem_wood"), FOLTISNAM_EMELSTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "foltisnam_emelstem_wood"), new BlockItem(FOLTISNAM_EMELSTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "foltisnam_gelemstem_wood"), FOLTISNAM_GELEMSTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "foltisnam_gelemstem_wood"), new BlockItem(FOLTISNAM_GELEMSTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "foltisnam_agelistem_wood"), FOLTISNAM_AGELISTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "foltisnam_agelistem_wood"), new BlockItem(FOLTISNAM_AGELISTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_emelstem_wood"), STRIPPED_EMELSTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_emelstem_wood"), new BlockItem(STRIPPED_EMELSTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_gelemstem_wood"), STRIPPED_GELEMSTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_gelemstem_wood"), new BlockItem(STRIPPED_GELEMSTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_agelistem_wood"), STRIPPED_AGELISTEM_WOOD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_agelistem_wood"), new BlockItem(STRIPPED_AGELISTEM_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_emelstem"), STRIPPED_EMELSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_emelstem"), new BlockItem(STRIPPED_EMELSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_gelemstem"), STRIPPED_GELEMSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_gelemstem"), new BlockItem(STRIPPED_GELEMSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_agelistem"), STRIPPED_AGELISTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_agelistem"), new BlockItem(STRIPPED_AGELISTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "hollowed_emelstem"), HOLLOWED_EMELSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "hollowed_emelstem"), new BlockItem(HOLLOWED_EMELSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "hollowed_gelemstem"), HOLLOWED_GELEMSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "hollowed_gelemstem"), new BlockItem(HOLLOWED_GELEMSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "hollowed_agelistem"), HOLLOWED_AGELISTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "hollowed_agelistem"), new BlockItem(HOLLOWED_AGELISTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_hollowed_emelstem"), STRIPPED_HOLLOWED_EMELSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_hollowed_emelstem"), new BlockItem(STRIPPED_HOLLOWED_EMELSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_hollowed_gelemstem"), STRIPPED_HOLLOWED_GELEMSTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_hollowed_gelemstem"), new BlockItem(STRIPPED_HOLLOWED_GELEMSTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "stripped_hollowed_agelistem"), STRIPPED_HOLLOWED_AGELISTEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "stripped_hollowed_agelistem"), new BlockItem(STRIPPED_HOLLOWED_AGELISTEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "emelkem"), EMELKEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "emelkem"), new BlockItem(EMELKEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "gelemkem"), GELEMKEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "gelemkem"), new BlockItem(GELEMKEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "agelikem"), AGELIKEM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "agelikem"), new BlockItem(AGELIKEM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "emelkem_carpet"), EMELKEM_CARPET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "emelkem_carpet"), new BlockItem(EMELKEM_CARPET, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "gelemkem_carpet"), GELEMKEM_CARPET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "gelemkem_carpet"), new BlockItem(GELEMKEM_CARPET, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "agelikem_carpet"), AGELIKEM_CARPET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "agelikem_carpet"), new BlockItem(AGELIKEM_CARPET, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "aquafeldmarine_ore"), AQUAFELDMARINE_ORE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "aquafeldmarine_ore"), new BlockItem(AQUAFELDMARINE_ORE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "aquafeldmarine_block"), AQUAFELDMARINE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "aquafeldmarine_block"), new BlockItem(AQUAFELDMARINE_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "lenels_mushroom"), LENELS_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "lenels_mushroom"), new BlockItem(LENELS_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "emdetis_mushroom"), EMDETIS_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "emdetis_mushroom"), new BlockItem(EMDETIS_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "molzhenss_mushroom"), MOLZHENSS_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "molzhenss_mushroom"), new BlockItem(MOLZHENSS_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "aqelionos_mushroom"), AQELIONOS_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "aqelionos_mushroom"), new BlockItem(AQELIONOS_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "pokipan_mushroom"), POKIPAN_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "pokipan_mushroom"), new BlockItem(POKIPAN_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "pomz_mushroom"), POMZ_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "pomz_mushroom"), new BlockItem(POMZ_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "wanzee_mushrooms"), WANZEE_MUSHROOMS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "wanzee_mushrooms"), new BlockItem(WANZEE_MUSHROOMS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "emelstem_planks"), EMELSTEM_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "emelstem_planks"), new BlockItem(EMELSTEM_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "gelemstem_planks"), GELEMSTEM_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "gelemstem_planks"), new BlockItem(GELEMSTEM_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "agelistem_planks"), AGELISTEM_PLANKS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "agelistem_planks"), new BlockItem(AGELISTEM_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "lemzu"), LEMZU);
        Registry.register(Registries.ITEM, new Identifier("frogson", "lemzu"), new BlockItem(LEMZU, new FabricItemSettings()));

    }
}

package net.adelheideatsalliums.frogson.Block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FrogsonMaterials {
    public static final Item ROSE_QUARTZ = new Item(new FabricItemSettings());
    public static final Block ROSE_QUARTZ_ORE = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool());
    public static final Block ROSE_QUARTZ_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Item MALACHITE = new Item(new FabricItemSettings());
    public static final Block MALACHITE_ORE = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool());
    public static final Block MALACHITE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Item RAINBOW_IRON_INGOT = new Item(new FabricItemSettings());
    public static final Item RAINBOW_IRON_NUGGET = new Item(new FabricItemSettings());
    public static final Item RAW_RAINBOW_IRON = new Item(new FabricItemSettings());
    public static final Block RAINBOW_IRON_ORE = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool());
    public static final Block RAW_RAINBOW_IRON_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Block RAINBOW_IRON_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Item ENDENSKIAL_INGOT = new Item(new FabricItemSettings());
    public static final Item ENDENSKIAL_NUGGET = new Item(new FabricItemSettings());
    public static final Item RAW_ENDENSKIAL = new Item(new FabricItemSettings());
    public static final Block ENDENSKIAL_ORE = new Block(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(4.5F, 3.0F).requiresTool());
    public static final Block RAW_ENDENSKIAL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Block ENDENSKIAL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Block OBSIDIAN_ROSE = new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).hardness(55).requiresTool());
    public static final Item ANDESITE_PERIWINKLE = new Item(new FabricItemSettings());
    public static final Block ANDESITE_PERIWINKLE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.ANDESITE).hardness(2F).requiresTool());


    public static void registerFrogsonMaterials() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz"), ROSE_QUARTZ);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "rose_quartz_ore"), ROSE_QUARTZ_ORE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_ore"), new BlockItem(ROSE_QUARTZ_ORE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "rose_quartz_block"), ROSE_QUARTZ_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_block"), new BlockItem(ROSE_QUARTZ_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite"), MALACHITE);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "malachite_ore"), MALACHITE_ORE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_ore"), new BlockItem(MALACHITE_ORE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "malachite_block"), MALACHITE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_block"), new BlockItem(MALACHITE_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("frogson", "raw_rainbow_iron"), RAW_RAINBOW_IRON);

        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_ingot"), RAINBOW_IRON_INGOT);

        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_nugget"), RAINBOW_IRON_NUGGET);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "rainbow_iron_ore"), RAINBOW_IRON_ORE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_ore"), new BlockItem(RAINBOW_IRON_ORE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "raw_rainbow_iron_block"), RAW_RAINBOW_IRON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "raw_rainbow_iron_block"), new BlockItem(RAW_RAINBOW_IRON_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "rainbow_iron_block"), RAINBOW_IRON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_block"), new BlockItem(RAINBOW_IRON_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("frogson", "raw_endenskial"), RAW_ENDENSKIAL);

        Registry.register(Registries.ITEM, new Identifier("frogson", "endenskial_ingot"), ENDENSKIAL_INGOT);

        Registry.register(Registries.ITEM, new Identifier("frogson", "endenskial_nugget"), ENDENSKIAL_NUGGET);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "endenskial_ore"), ENDENSKIAL_ORE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endenskial_ore"), new BlockItem(ENDENSKIAL_ORE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "raw_endenskial_block"), RAW_ENDENSKIAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "raw_endenskial_block"), new BlockItem(RAW_ENDENSKIAL_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "endenskial_block"), ENDENSKIAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endenskial_block"), new BlockItem(ENDENSKIAL_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "obsidian_rose"), OBSIDIAN_ROSE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "obsidian_rose"), new BlockItem(OBSIDIAN_ROSE, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("frogson", "andesite_periwinkle"), ANDESITE_PERIWINKLE);

        Registry.register(Registries.BLOCK, new Identifier("frogson", "andesite_periwinkle_block"), ANDESITE_PERIWINKLE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "andesite_periwinkle_block"), new BlockItem(ANDESITE_PERIWINKLE_BLOCK, new FabricItemSettings()));

    }
}

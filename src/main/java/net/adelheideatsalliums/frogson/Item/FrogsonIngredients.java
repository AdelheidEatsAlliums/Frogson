package net.adelheideatsalliums.frogson.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FrogsonIngredients {
    public static final Item GREASKNEDNUM = new Item(new FabricItemSettings());
    public static final Item ENDELIESK_CRYSTAL = new Item(new FabricItemSettings());
    public static final Item TENTILIMUNELIESK_POWDER = new Item(new FabricItemSettings());
    public static final Item TENTILIMUNELIESK_PAPER = new Item(new FabricItemSettings());
    public static final Item ENDELIESK_PEARL = new Item(new FabricItemSettings());
    public static final Item ENDLIESKINDAEL_INGOT = new Item(new FabricItemSettings());
    public static final Item ENDLIESKINDAEL_NUGGET = new Item(new FabricItemSettings());
    public static final Block ENDLIESKINDAEL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool());
    public static final Item TENTILIMUNELIESK_INGOT = new Item(new FabricItemSettings());
    public static final Item TENTILIMUNELIESK_NUGGET = new Item(new FabricItemSettings());
    public static final Block TENTILIMUNELIESK_BLOCK = new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool());
    public static final Item QUANTENDIUM_INGOT = new Item(new FabricItemSettings());
    public static final Item QUANTENDIUM_NUGGET = new Item(new FabricItemSettings());
    public static final Item QUANTENDIUM_ROD = new Item(new FabricItemSettings());
    public static final Block QUANTENDIUM_BLOCK = new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool());
    public static final Item QUANTENDIUM_PLATE = new Item(new FabricItemSettings());
    public static final Item MALACHITE_ROSE = new Item(new FabricItemSettings());
    public static final Block MALACHITE_ROSE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).hardness(60F).requiresTool());
    public static final Item TESSKELTINIAL_EYE = new Item(new FabricItemSettings());
    public static final Item ENDENSKIAL_ORB = new Item(new FabricItemSettings());
    public static final Item AZALEAS_CRYSTAL = new Item(new FabricItemSettings());
    public static final Item EDELIS_LAVENDAR = new Item(new FabricItemSettings());
    public static final Item DEADYNELOS_CRYSTALS = new Item(new FabricItemSettings());
    public static final Item SMOOTH_MOSS = new Item(new FabricItemSettings());
    public static final Item BLOODY_EDELIS_LAVENDAR = new Item(new FabricItemSettings());
    public static final Item QUANTE_MALACHITE = new Item(new FabricItemSettings());
    public static final Item EDELIS_LILAC = new Item(new FabricItemSettings());
    public static final Item TOPERITIS_PEARL = new Item(new FabricItemSettings());
    public static final Item LOTAKELI_DUST = new Item(new FabricItemSettings());
    public static final Item EDELIS_TEAR = new Item(new FabricItemSettings());
    public static final Item ROTTENZIANEL = new Item(new FabricItemSettings());
    public static final Item LAPIS_MALACHETS = new Item(new FabricItemSettings());
    public static final Item MOLTEN_BLOOD_CRYSTAL = new Item(new FabricItemSettings());

    public static void registerFrogsonIngredients() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "greasknednum"), GREASKNEDNUM);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endeliesk_crystal"), ENDELIESK_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_powder"), TENTILIMUNELIESK_POWDER);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_paper"), TENTILIMUNELIESK_PAPER);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endeliesk_pearl"), ENDELIESK_PEARL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endlieskindael_ingot"), ENDLIESKINDAEL_INGOT);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endlieskindael_nugget"), ENDLIESKINDAEL_NUGGET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_ingot"), TENTILIMUNELIESK_INGOT);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_nugget"), TENTILIMUNELIESK_NUGGET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "quantendium_nugget"), QUANTENDIUM_NUGGET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "quantendium_ingot"), QUANTENDIUM_INGOT);
        Registry.register(Registries.ITEM, new Identifier("frogson", "quantendium_rod"), QUANTENDIUM_ROD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "quantendium_plate"), QUANTENDIUM_PLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose"), MALACHITE_ROSE);
        Registry.register(Registries.BLOCK, new Identifier("frogson", "malachite_rose_block"), MALACHITE_ROSE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_block"), new BlockItem(MALACHITE_ROSE_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("frogson", "tesskeltinial_eye"), TESSKELTINIAL_EYE);
        Registry.register(Registries.BLOCK, new Identifier("frogson", "endlieskindael_block"), ENDLIESKINDAEL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "endlieskindael_block"), new BlockItem(ENDLIESKINDAEL_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier("frogson", "tentilimuneliesk_block"), TENTILIMUNELIESK_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_block"), new BlockItem(TENTILIMUNELIESK_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier("frogson", "quantendium_block"), QUANTENDIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "quantendium_block"), new BlockItem(QUANTENDIUM_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("frogson", "endenskial_orb"), ENDENSKIAL_ORB);
        Registry.register(Registries.ITEM, new Identifier("frogson", "azaleas_crystal"), AZALEAS_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "edelis_lavendar"), EDELIS_LAVENDAR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "deadynelos_crystals"), DEADYNELOS_CRYSTALS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "smooth_moss"), SMOOTH_MOSS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "bloody_edelis_lavendar"), BLOODY_EDELIS_LAVENDAR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "quante_malachite"), QUANTE_MALACHITE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "edelis_lilac"), EDELIS_LILAC);
        Registry.register(Registries.ITEM, new Identifier("frogson", "toperitis_pearl"), TOPERITIS_PEARL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "lotakeli_dust"), LOTAKELI_DUST);
        Registry.register(Registries.ITEM, new Identifier("frogson", "edelis_tear"), EDELIS_TEAR);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rottenzianel"), ROTTENZIANEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "lapis_malachets"), LAPIS_MALACHETS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "molten_blood_crystal"), MOLTEN_BLOOD_CRYSTAL);


    }
}
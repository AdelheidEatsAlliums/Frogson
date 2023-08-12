package net.adelheideatsalliums.frogson.Block;

import net.adelheideatsalliums.frogson.Block.classes.PaintedBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Painteds {
    public static final Block CANVAS = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static final Block PAINTED_BUMPY_WINDS = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static final Block PAINTED_CLOUD_LIGHT = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static final Block PAINTED_DISTANCED_LAYERS = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static final Block PAINTED_ODD_FOG = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static final Block PAINTED_PERSON = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static final Block PAINTED_SHAPE_COLORS = new
            PaintedBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOD));

    public static void registerPainteds() {

        Registry.register(Registries.BLOCK, new Identifier("frogson", "canvas"), CANVAS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "canvas"), new BlockItem(CANVAS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "painted_bumpy_winds"), PAINTED_BUMPY_WINDS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "painted_bumpy_winds"), new BlockItem(PAINTED_BUMPY_WINDS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "painted_cloud_light"), PAINTED_CLOUD_LIGHT);
        Registry.register(Registries.ITEM, new Identifier("frogson", "painted_cloud_light"), new BlockItem(PAINTED_CLOUD_LIGHT, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "painted_distanced_layers"), PAINTED_DISTANCED_LAYERS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "painted_distanced_layers"), new BlockItem(PAINTED_DISTANCED_LAYERS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "painted_odd_fog"), PAINTED_ODD_FOG);
        Registry.register(Registries.ITEM, new Identifier("frogson", "painted_odd_fog"), new BlockItem(PAINTED_ODD_FOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "painted_person"), PAINTED_PERSON);
        Registry.register(Registries.ITEM, new Identifier("frogson", "painted_person"), new BlockItem(PAINTED_PERSON, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "painted_shape_colors"), PAINTED_SHAPE_COLORS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "painted_shape_colors"), new BlockItem(PAINTED_SHAPE_COLORS, new FabricItemSettings()));

    }
}

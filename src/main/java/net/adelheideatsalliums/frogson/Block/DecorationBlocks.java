package net.adelheideatsalliums.frogson.Block;

import net.adelheideatsalliums.frogson.Block.classes.BookStack;
import net.adelheideatsalliums.frogson.Block.classes.DecorationBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class DecorationBlocks {
    public static final Block BOOK_STACK = new
            BookStack(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.WOOL));

    public static final Block DECORATED_PYRAMID = new
            DecorationBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.STONE));

    public static final Block DECORATED_CASTLE = new
            DecorationBlock(FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.STONE));
    public static void registerDecorationBlocks() {

        Registry.register(Registries.BLOCK, new Identifier("frogson", "book_stack"), BOOK_STACK);
        Registry.register(Registries.ITEM, new Identifier("frogson", "book_stack"), new BlockItem(BOOK_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "decorated_castle"), DECORATED_CASTLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "decorated_castle"), new BlockItem(DECORATED_CASTLE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("frogson", "decorated_pyramid"), DECORATED_PYRAMID);
        Registry.register(Registries.ITEM, new Identifier("frogson", "decorated_pyramid"), new BlockItem(DECORATED_PYRAMID, new FabricItemSettings()));

    }
}

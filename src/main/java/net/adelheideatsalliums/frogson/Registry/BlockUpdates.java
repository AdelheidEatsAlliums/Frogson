package net.adelheideatsalliums.frogson.Registry;

import net.adelheideatsalliums.frogson.Block.TonslanBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class BlockUpdates {

    public static void BlockUpdatesRegister(){

        StrippableBlockRegistry.register(TonslanBlocks.AGELISTEM, TonslanBlocks.STRIPPED_AGELISTEM);
        StrippableBlockRegistry.register(TonslanBlocks.EMELSTEM, TonslanBlocks.STRIPPED_EMELSTEM);
        StrippableBlockRegistry.register(TonslanBlocks.GELEMSTEM, TonslanBlocks.STRIPPED_GELEMSTEM);
        StrippableBlockRegistry.register(TonslanBlocks.AGELISTEM_WOOD, TonslanBlocks.STRIPPED_AGELISTEM_WOOD);
        StrippableBlockRegistry.register(TonslanBlocks.EMELSTEM_WOOD, TonslanBlocks.STRIPPED_EMELSTEM_WOOD);
        StrippableBlockRegistry.register(TonslanBlocks.GELEMSTEM_WOOD, TonslanBlocks.STRIPPED_GELEMSTEM_WOOD);

    }
}

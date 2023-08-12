package net.adelheideatsalliums.frogson;

import net.adelheideatsalliums.frogson.ArmorAndTool.*;
import net.adelheideatsalliums.frogson.Block.*;
import net.adelheideatsalliums.frogson.Item.FrogsonFoods;
import net.adelheideatsalliums.frogson.Item.FrogsonIngredients;
import net.adelheideatsalliums.frogson.Item.TonslanItems;
import net.adelheideatsalliums.frogson.Registry.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Frogson implements ModInitializer {
    public static final String FROGSON = "frogson";
    public static final Logger LOGGER = LoggerFactory.getLogger("FROGSON");

    @Override
    public void onInitialize() {
        ItemGroupPlacement.ItemGroupPlacementRegister();
        OreGen.OreGenRegister();
        BlockUpdates.BlockUpdatesRegister();

        Enchants.EnchantmentsRegister();
        Effects.EffectsRegister();

        WoodBlocks.registerWoodBlocks();
        FrogsonMaterials.registerFrogsonMaterials();
        FrogsonIngredients.registerFrogsonIngredients();
        RainbowIronSet.registerRainbowIronSet();
        MalachiteSet.registerMalachiteSet();
        RoseQuartzSet.registerRoseQuartzSet();
        ScheelchBlocks.registerScheelchBlocks();
        GreaskBlocks.registerGreaskBlocks();
        AmethystSet.registerAmethystSet();
        MalachiteRoseSet.registerMalachiteRoseSet();
        TentilimunelieskSet.registerTentilimunelieskSet();
        CloudstoneBlocks.registerCloudstoneBlocks();
        PackedBlocks.registerPackedBlocks();
        DecorationBlocks.registerDecorationBlocks();
        Painteds.registerPainteds();
        TonslanBlocks.registerTonslanBlocks();
        TonslanItems.registerTonslanItems();
        FrogsonFoods.registerFrogsonFoods();

    }
}
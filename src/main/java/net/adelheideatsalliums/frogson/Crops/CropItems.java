package net.adelheideatsalliums.frogson.Crops;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CropItems {
    public static final Item TOMATO_SEEDS = new Item(new FabricItemSettings());

    public static void throwSeeds() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "tomato_seeds"), TOMATO_SEEDS);

    }
}

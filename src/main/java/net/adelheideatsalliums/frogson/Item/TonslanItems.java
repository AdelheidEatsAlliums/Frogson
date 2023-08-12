package net.adelheideatsalliums.frogson.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TonslanItems {
    public static final Item AQUAFELDMARINE = new Item(new FabricItemSettings());

    public static void registerTonslanItems() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "aquafeldmarine"), AQUAFELDMARINE);

    }
}

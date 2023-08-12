package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.QuantendiumShield;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FrogsonShields {
    public static final Item QUANTENDIUM_SHIELD = new QuantendiumShield(new Item.Settings().maxDamage(1860));
    public static void registerFrogsonShields() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "quantendium_shield"), QUANTENDIUM_SHIELD);

    }
}

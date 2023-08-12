package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.AmethystArmorMaterial;
import net.adelheideatsalliums.frogson.ArmorAndTool.classes.AmethystToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystSet {
    public static final ArmorMaterial amethystArmorMaterial = new AmethystArmorMaterial();
    public static final ToolMaterial amethystToolMaterial = new AmethystToolMaterial();
    public static final Item AMETHYST_HELMET = new ArmorItem(amethystArmorMaterial, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item AMETHYST_CHESTPLATE = new ArmorItem(amethystArmorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item AMETHYST_LEGGINGS = new ArmorItem(amethystArmorMaterial, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item AMETHYST_BOOTS = new ArmorItem(amethystArmorMaterial, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem AMETHYST_SWORD = new SwordItem(amethystToolMaterial, 3, -2.4F, new Item.Settings());
    public static final ToolItem AMETHYST_PICKAXE = new PickaxeItem(amethystToolMaterial, 1, -2.8F, new Item.Settings());
    public static final ToolItem AMETHYST_AXE = new AxeItem(amethystToolMaterial, 5, -3.0F, new Item.Settings());
    public static final ToolItem AMETHYST_SHOVEL = new ShovelItem(amethystToolMaterial, 1.5F, -3.0F, new Item.Settings());
    public static final ToolItem AMETHYST_HOE = new HoeItem(amethystToolMaterial, -3, -0.0F, new Item.Settings());

    public static void registerAmethystSet() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_helmet"), AMETHYST_HELMET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_chestplate"), AMETHYST_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_leggings"), AMETHYST_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_boots"), AMETHYST_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_sword"), AMETHYST_SWORD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "amethyst_hoe"), AMETHYST_HOE);

    }
}

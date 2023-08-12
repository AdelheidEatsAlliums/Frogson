package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.RainbowIronArmorMaterial;
import net.adelheideatsalliums.frogson.ArmorAndTool.classes.RainbowIronToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RainbowIronSet {
    public static final ArmorMaterial rainbowIronArmorMaterial = new RainbowIronArmorMaterial();
    public static final ToolMaterial rainbowIronToolMaterial = new RainbowIronToolMaterial();
    public static final Item RAINBOW_IRON_HELMET = new ArmorItem(rainbowIronArmorMaterial, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item RAINBOW_IRON_CHESTPLATE = new ArmorItem(rainbowIronArmorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item RAINBOW_IRON_LEGGINGS = new ArmorItem(rainbowIronArmorMaterial, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item RAINBOW_IRON_BOOTS = new ArmorItem(rainbowIronArmorMaterial, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem RAINBOW_IRON_SWORD = new SwordItem(rainbowIronToolMaterial, 3, -2.4F, new Item.Settings());
    public static final ToolItem RAINBOW_IRON_PICKAXE = new PickaxeItem(rainbowIronToolMaterial, 1, -2.8F, new Item.Settings());
    public static final ToolItem RAINBOW_IRON_AXE = new AxeItem(rainbowIronToolMaterial, 5, -3.0F, new Item.Settings());
    public static final ToolItem RAINBOW_IRON_SHOVEL = new ShovelItem(rainbowIronToolMaterial, 1.5F, -3.0F, new Item.Settings());
    public static final ToolItem RAINBOW_IRON_HOE = new HoeItem(rainbowIronToolMaterial, -3, -0.0F, new Item.Settings());

    public static void registerRainbowIronSet() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_helmet"), RAINBOW_IRON_HELMET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_chestplate"), RAINBOW_IRON_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_leggings"), RAINBOW_IRON_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_boots"), RAINBOW_IRON_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_sword"), RAINBOW_IRON_SWORD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_pickaxe"), RAINBOW_IRON_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_axe"), RAINBOW_IRON_AXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_shovel"), RAINBOW_IRON_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rainbow_iron_hoe"), RAINBOW_IRON_HOE);

    }
}

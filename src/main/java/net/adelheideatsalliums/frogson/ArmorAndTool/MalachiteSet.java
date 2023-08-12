package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.MalachiteArmorMaterial;
import net.adelheideatsalliums.frogson.ArmorAndTool.classes.MalachiteToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MalachiteSet {
    public static final ArmorMaterial malchiteArmorMaterial = new MalachiteArmorMaterial();
    public static final ToolMaterial malachiteToolMaterial = new MalachiteToolMaterial();
    public static final Item MALACHITE_HELMET = new ArmorItem(malchiteArmorMaterial, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item MALACHITE_CHESTPLATE = new ArmorItem(malchiteArmorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item MALACHITE_LEGGINGS = new ArmorItem(malchiteArmorMaterial, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item MALACHITE_BOOTS = new ArmorItem(malchiteArmorMaterial, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem MALACHITE_SWORD = new SwordItem(malachiteToolMaterial, 3, -2.4F, new Item.Settings());
    public static final ToolItem MALACHITE_PICKAXE = new PickaxeItem(malachiteToolMaterial, 1, -2.8F, new Item.Settings());
    public static final ToolItem MALACHITE_AXE = new AxeItem(malachiteToolMaterial, 5, -3.0F, new Item.Settings());
    public static final ToolItem MALACHITE_SHOVEL = new ShovelItem(malachiteToolMaterial, 1.5F, -3.0F, new Item.Settings());
    public static final ToolItem MALACHITE_HOE = new HoeItem(malachiteToolMaterial, -3, -0.0F, new Item.Settings());

    public static void registerMalachiteSet() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_helmet"), MALACHITE_HELMET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_chestplate"), MALACHITE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_leggings"), MALACHITE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_boots"), MALACHITE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_sword"), MALACHITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_pickaxe"), MALACHITE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_axe"), MALACHITE_AXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_shovel"), MALACHITE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_hoe"), MALACHITE_HOE);

    }
}

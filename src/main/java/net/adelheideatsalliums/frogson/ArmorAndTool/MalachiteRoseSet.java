package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.MalachiteRoseArmorMaterial;
import net.adelheideatsalliums.frogson.ArmorAndTool.classes.MalachiteRoseToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MalachiteRoseSet {
    public static final ArmorMaterial malachiteRoseArmorMaterial = new MalachiteRoseArmorMaterial();
    public static final ToolMaterial malachkiteRoseToolMaterial = new MalachiteRoseToolMaterial();
    public static final Item MALACHHITE_ROSE_HELMET = new ArmorItem(malachiteRoseArmorMaterial, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item MALACHHITE_ROSE_CHESTPLATE = new ArmorItem(malachiteRoseArmorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item MALACHHITE_ROSE_LEGGINGS = new ArmorItem(malachiteRoseArmorMaterial, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item MALACHHITE_ROSE_BOOTS = new ArmorItem(malachiteRoseArmorMaterial, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem MALACHHITE_ROSE_SWORD = new SwordItem(malachkiteRoseToolMaterial, 6, -1.9F, new Item.Settings());
    public static final ToolItem MALACHHITE_ROSE_PICKAXE = new PickaxeItem(malachkiteRoseToolMaterial, 4, -2.3F, new Item.Settings());
    public static final ToolItem MALACHHITE_ROSE_AXE = new AxeItem(malachkiteRoseToolMaterial, 8, -2.5F, new Item.Settings());
    public static final ToolItem MALACHHITE_ROSE_SHOVEL = new ShovelItem(malachkiteRoseToolMaterial, 4.5F, -2.5F, new Item.Settings());
    public static final ToolItem MALACHHITE_ROSE_HOE = new HoeItem(malachkiteRoseToolMaterial, -2, 0.5F, new Item.Settings());

    public static void registerMalachiteRoseSet() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_helmet"), MALACHHITE_ROSE_HELMET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_chestplate"), MALACHHITE_ROSE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_leggings"), MALACHHITE_ROSE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_boots"), MALACHHITE_ROSE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_sword"), MALACHHITE_ROSE_SWORD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_pickaxe"), MALACHHITE_ROSE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_axe"), MALACHHITE_ROSE_AXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_shovel"), MALACHHITE_ROSE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "malachite_rose_hoe"), MALACHHITE_ROSE_HOE);

    }
}

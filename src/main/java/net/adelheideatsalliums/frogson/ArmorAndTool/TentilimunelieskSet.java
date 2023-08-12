package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.TentilimunelieskArmorMaterial;
import net.adelheideatsalliums.frogson.ArmorAndTool.classes.TentilimunelieskToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TentilimunelieskSet {
    public static final ArmorMaterial tentilimunelieskArmorMaterial = new TentilimunelieskArmorMaterial();
    public static final ToolMaterial tentilimunelieskToolMaterial = new TentilimunelieskToolMaterial();
    public static final Item TENTILIMUNELIESK_HELMET = new ArmorItem(tentilimunelieskArmorMaterial, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item TENTILIMUNELIESK_CHESTPLATE = new ArmorItem(tentilimunelieskArmorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item TENTILIMUNELIESK_LEGGINGS = new ArmorItem(tentilimunelieskArmorMaterial, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item TENTILIMUNELIESK_BOOTS = new ArmorItem(tentilimunelieskArmorMaterial, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem TENTILIMUNELIESK_SWORD = new SwordItem(tentilimunelieskToolMaterial, 5, -1.9F, new Item.Settings());
    public static final ToolItem TENTILIMUNELIESK_PICKAXE = new PickaxeItem(tentilimunelieskToolMaterial, 3, -2.3F, new Item.Settings());
    public static final ToolItem TENTILIMUNELIESK_AXE = new AxeItem(tentilimunelieskToolMaterial, 7, -2.5F, new Item.Settings());
    public static final ToolItem TENTILIMUNELIESK_SHOVEL = new ShovelItem(tentilimunelieskToolMaterial, 3.5F, -2.5F, new Item.Settings());
    public static final ToolItem TENTILIMUNELIESK_HOE = new HoeItem(tentilimunelieskToolMaterial, -3, 0.5F, new Item.Settings());

    public static void registerTentilimunelieskSet() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_helmet"), TENTILIMUNELIESK_HELMET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_chestplate"), TENTILIMUNELIESK_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_leggings"), TENTILIMUNELIESK_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_boots"), TENTILIMUNELIESK_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_sword"), TENTILIMUNELIESK_SWORD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_pickaxe"), TENTILIMUNELIESK_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_axe"), TENTILIMUNELIESK_AXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_shovel"), TENTILIMUNELIESK_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "tentilimuneliesk_hoe"), TENTILIMUNELIESK_HOE);

    }
}

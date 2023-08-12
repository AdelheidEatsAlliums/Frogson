package net.adelheideatsalliums.frogson.ArmorAndTool;

import net.adelheideatsalliums.frogson.ArmorAndTool.classes.RoseQuartzArmorMaterial;
import net.adelheideatsalliums.frogson.ArmorAndTool.classes.RoseQuartzToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RoseQuartzSet {
    public static final ArmorMaterial roseQuartzArmorMaterial = new RoseQuartzArmorMaterial();
    public static final ToolMaterial roseQuartzToolMaterial = new RoseQuartzToolMaterial();
    public static final Item ROSE_QUARTZ_HELMET = new ArmorItem(roseQuartzArmorMaterial, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item ROSE_QUARTZ_CHESTPLATE = new ArmorItem(roseQuartzArmorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item ROSE_QUARTZ_LEGGINGS = new ArmorItem(roseQuartzArmorMaterial, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item ROSE_QUARTZ_BOOTS = new ArmorItem(roseQuartzArmorMaterial, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem ROSE_QUARTZ_SWORD = new SwordItem(roseQuartzToolMaterial, 3, -2.4F, new Item.Settings());
    public static final ToolItem ROSE_QUARTZ_PICKAXE = new PickaxeItem(roseQuartzToolMaterial, 1, -2.8F, new Item.Settings());
    public static final ToolItem ROSE_QUARTZ_AXE = new AxeItem(roseQuartzToolMaterial, 5, -3.0F, new Item.Settings());
    public static final ToolItem ROSE_QUARTZ_SHOVEL = new ShovelItem(roseQuartzToolMaterial, 1.5F, -3.0F, new Item.Settings());
    public static final ToolItem ROSE_QUARTZ_HOE = new HoeItem(roseQuartzToolMaterial, -3, -0.0F, new Item.Settings());

    public static void registerRoseQuartzSet() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_helmet"), ROSE_QUARTZ_HELMET);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_chestplate"), ROSE_QUARTZ_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_leggings"), ROSE_QUARTZ_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_boots"), ROSE_QUARTZ_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_sword"), ROSE_QUARTZ_SWORD);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_pickaxe"), ROSE_QUARTZ_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_axe"), ROSE_QUARTZ_AXE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_shovel"), ROSE_QUARTZ_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("frogson", "rose_quartz_hoe"), ROSE_QUARTZ_HOE);

    }
}

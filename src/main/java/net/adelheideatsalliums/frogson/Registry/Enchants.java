package net.adelheideatsalliums.frogson.Registry;

import net.adelheideatsalliums.frogson.Enchantment.FrostedEnchantment;
import net.adelheideatsalliums.frogson.Enchantment.HealthStealEnchantment;
import net.adelheideatsalliums.frogson.Enchantment.PoisonedEdgeEnchantment;
import net.adelheideatsalliums.frogson.Enchantment.WitherdEdgeEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Enchants {
    public static Enchantment POISONED_EDGE = new PoisonedEdgeEnchantment();
    public static Enchantment WITHERED_EDGE = new WitherdEdgeEnchantment();
    public static Enchantment FROSTED = new FrostedEnchantment();
    public static Enchantment HEALTH_STEAL = new HealthStealEnchantment();

    public static void EnchantmentsRegister(){
        Registry.register(Registries.ENCHANTMENT, new Identifier("frogson", "poisoned_edge"), POISONED_EDGE);
        Registry.register(Registries.ENCHANTMENT, new Identifier("frogson", "withered_edge"), WITHERED_EDGE);
        Registry.register(Registries.ENCHANTMENT, new Identifier("frogson", "frosted"), FROSTED);
        Registry.register(Registries.ENCHANTMENT, new Identifier("frogson", "health_steal"), HEALTH_STEAL);

    }
}

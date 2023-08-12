package net.adelheideatsalliums.frogson.Enchantment;

import net.adelheideatsalliums.frogson.Registry.Enchants;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class WitherdEdgeEnchantment extends Enchantment {
    public WitherdEdgeEnchantment(){
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
    public boolean isTreasure() {
        return true;
    }

    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    public boolean isAvailableForRandomSelection() {
        return false;
    }
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(
                    new StatusEffectInstance(StatusEffects.WITHER, 20 * 2 * level, level - 1));
        }

        super.onTargetDamaged(user, target, level);
    }

    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchants.POISONED_EDGE;
    }
}

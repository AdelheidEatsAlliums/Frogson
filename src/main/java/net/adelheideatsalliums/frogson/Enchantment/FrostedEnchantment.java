package net.adelheideatsalliums.frogson.Enchantment;

import net.adelheideatsalliums.frogson.Registry.Effects;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostedEnchantment extends Enchantment {
    public FrostedEnchantment(){
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR,
                new EquipmentSlot[] {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
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

    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (attacker != null) {
            ((LivingEntity) attacker).addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SLOWNESS, 10 * 5 * level, level - 1));
        }
        if (attacker != null) {
            ((LivingEntity) attacker).addStatusEffect(
                    new StatusEffectInstance(Effects.FROSTBITE, 10 * 4 * level, level - 1));
        }

        super.onTargetDamaged(user, attacker, level);
    }
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.THORNS;
    }
}

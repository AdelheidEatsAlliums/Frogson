package net.adelheideatsalliums.frogson.Enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class HealthStealEnchantment extends Enchantment {
    public static final int ALL_INDEX = 0;
    public static final int UNDEAD_INDEX = 1;
    public static final int ALIVE_INDEX = 2;
    private static final String[] TYPE_NAMES = new String[]{"all", "undead", "alive"};
    private static final int[] BASE_POWERS = new int[]{1, 5, 5};
    private static final int[] POWERS_PER_LEVEL = new int[]{11, 8, 8};
    private static final int[] MIN_MAX_POWER_DIFFERENCES = new int[]{20, 20, 20};
    public int typeIndex = 0;

    public HealthStealEnchantment(){
        super(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return BASE_POWERS[this.typeIndex] + (level - 1) * POWERS_PER_LEVEL[this.typeIndex];
    }

    public int getMaxPower(int level) {
        return this.getMinPower(level) + MIN_MAX_POWER_DIFFERENCES[this.typeIndex];
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

    @Override
    public int getMaxLevel() {
        return 4;
    }
    public float getAttackDamage(int level, EntityGroup group) {
        if (this.typeIndex == 0) {
            return 1.0F + (float)Math.max(0, level - 1) * 0.5F;
        } else if (this.typeIndex == 1 && group == EntityGroup.UNDEAD) {
            return (float)level * 2.5F;
        } else {
            return this.typeIndex == 2 && group == EntityGroup.DEFAULT ? (float)level * 2.5F : 0.0F;
        }
    }
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            user.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, level - 1));
        }

        super.onTargetDamaged(user, target, level);
    }

    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FIRE_ASPECT;
    }

}

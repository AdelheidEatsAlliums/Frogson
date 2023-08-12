package net.adelheideatsalliums.frogson.Effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class InecperiencedEffect extends StatusEffect {
    public InecperiencedEffect() {
        super(
                StatusEffectCategory.HARMFUL, 0x969992);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).addExperience(-1 << amplifier);
        }
    }
}
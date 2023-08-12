package net.adelheideatsalliums.frogson.Effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FrostbiteEffect extends StatusEffect {
    public FrostbiteEffect() {
        super(
                StatusEffectCategory.HARMFUL, 0x7FB5B5);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getDamageSources().freeze(), 1.0F);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i;
        i = 40 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }

}
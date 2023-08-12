package net.adelheideatsalliums.frogson.Registry;

import net.adelheideatsalliums.frogson.Effect.ExperiencedEffect;
import net.adelheideatsalliums.frogson.Effect.FrostbiteEffect;
import net.adelheideatsalliums.frogson.Effect.InecperiencedEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Effects {
    public static final StatusEffect FROSTBITE = new FrostbiteEffect();
    public static final StatusEffect EXPERIENCED = new ExperiencedEffect();
    public static final StatusEffect INEXPERIENCED = new InecperiencedEffect();

    public static void EffectsRegister() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("frogson", "frostbite"), FROSTBITE);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("frogson", "experienced"), EXPERIENCED);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("frogson", "inexperienced"), INEXPERIENCED);

    }

}

package imexoodeex.squirtingsyringe.effects;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class focuseeffect extends StatusEffect {
    public focuseeffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x98D982);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int i) {
        // code in mixins
    }
}
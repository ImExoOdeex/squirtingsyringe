package imexoodeex.squirtingsyringe.effects;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import imexoodeex.squirtingsyringe.mixin.ExpOrb;

public class focuseeffect extends StatusEffect {
    public focuseeffect() {
        super(
                StatusEffectCategory.BENEFICIAL,
                0x98D982);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int i) {
//        if (entity instanceof PlayerEntity) {
//            PlayerEntity p = (PlayerEntity) entity;
//            if (!p.world.isClient && !p.isSpectator()) {
//                p.world.getEntitiesByClass(ExperienceOrbEntity.class, p.getBoundingBox().expand(2 + i * 2), null).forEach(orb -> {
//                    orb.onPlayerCollision(p);
//                    p.experiencePickUpDelay = 0;
//                });
//            }
//        }
    }
}
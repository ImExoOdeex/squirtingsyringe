package imexoodeex.squirtingsyringe.mixin;

import imexoodeex.squirtingsyringe.Squirtingsyringe;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ExperienceOrbEntity.class)
public abstract class ExperienceOrbEntityMixin {

    @Inject(at = @At("TAIL"), method = "onPlayerCollision")
    public void onPlayerCollision(PlayerEntity player, CallbackInfo ci) {
        if (player.hasStatusEffect(Squirtingsyringe.FOCUS)) {
            int i = player.experienceLevel;
            player.addExperience(i * 2);
        }
    }
}

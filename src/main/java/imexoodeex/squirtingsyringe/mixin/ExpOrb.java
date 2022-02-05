package imexoodeex.squirtingsyringe.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.entity.ExperienceOrbEntity;

@Mixin(ExperienceOrbEntity.class)
public interface ExpOrb {

    @Accessor("amount")
    public void setAmount(int amt);

}
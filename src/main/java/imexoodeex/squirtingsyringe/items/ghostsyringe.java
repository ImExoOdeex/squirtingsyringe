package imexoodeex.squirtingsyringe.items;

import imexoodeex.squirtingsyringe.sounds.Sounds;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ghostsyringe extends Item {

    public ghostsyringe(Settings settings) {
        super(settings);
    }

    private boolean isUsed = false;

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(getClass().getSimpleName()));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        isUsed = true;

        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, (1200), (1), true, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, (1200), (2), true, false));
        user.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);

        ItemStack itemStack = user.getStackInHand(hand);
        itemStack.damage(1, user, (p) -> {
            p.sendToolBreakStatus(hand);
        });

        isUsed = false;
        return ActionResult.SUCCESS;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (isUsed) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, (1200), (1), true, false));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, (1200), (2), true, false));

        user.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);
        ItemStack itemStack = user.getStackInHand(hand);
        itemStack.damage(1, user, (p) -> {
            p.sendToolBreakStatus(hand);
        });
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
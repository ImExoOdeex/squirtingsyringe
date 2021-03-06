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
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class miningsyringe extends Item {

    public miningsyringe(Settings settings) {
        super(settings);
    }

    private boolean isUsed = false;

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(getClass().getSimpleName()));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity playerEntity, LivingEntity entity, Hand hand) {
        isUsed = true;

        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, (6000), (1), true, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, (6000), (0), true, false));
        playerEntity.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);

        ItemStack itemStack = playerEntity.getStackInHand(hand);
        itemStack.damage(1, playerEntity, (p) -> {
            p.sendToolBreakStatus(hand);
        });

        isUsed = false;
        return ActionResult.SUCCESS;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (isUsed) {
            return TypedActionResult.pass(playerEntity.getStackInHand(hand));
        }
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, (6000), (1), true, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, (6000), (0), true, false));
        playerEntity.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        itemStack.damage(1, playerEntity, (p) -> {
            p.sendToolBreakStatus(hand);
        });
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
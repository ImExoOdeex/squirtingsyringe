package imexoodeex.squirtingsyringe.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import imexoodeex.squirtingsyringe.sounds.Sounds;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import static imexoodeex.squirtingsyringe.Squirtingsyringe.LOGGER;

import java.util.List;


public class warriorsyringe extends Item {

    public warriorsyringe(Settings settings) {
        super(settings);
    }

    private boolean isUsed = false;

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(new TranslatableText(getClass().getSimpleName()));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        PlayerEntity playerEntity = user;
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, (1200), (1), true, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, (1200), (0), true, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, (1200), (0), true, false));
        playerEntity.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);

        isUsed = true;

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

        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, (1200), (1), true, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, (1200), (0), true, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, (1200), (0), true, false));
        playerEntity.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);

        ItemStack itemStack = playerEntity.getStackInHand(hand);
        itemStack.damage(1, playerEntity, (p) -> {
            p.sendToolBreakStatus(hand);
        });

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

}
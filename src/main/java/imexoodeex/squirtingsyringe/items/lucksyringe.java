package imexoodeex.squirtingsyringe.items;

import imexoodeex.squirtingsyringe.sounds.Sounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class lucksyringe extends Item {

    public lucksyringe(Settings settings) {
        super(settings);
    }

    public static final lucksyringe LUCK_SYRINGE = new lucksyringe(
            new FabricItemSettings().group(ModItemGroup.SQUIRTINGSYRINGE).maxDamage(4)
                    .rarity(Rarity.COMMON));

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.squirtingsyringe.lucksyringe.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.squirtingsyringe.lucksyringe.tooltip"));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, (60 * 3 * 20), (0), true, false));
        ItemStack itemStack = playerEntity.getStackInHand(hand);

        playerEntity.playSound(Sounds.SOUND_EVENT, 0.5f, 1.0f);

        itemStack.damage(1, playerEntity, (p) -> {
            p.sendToolBreakStatus(hand);
        });
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
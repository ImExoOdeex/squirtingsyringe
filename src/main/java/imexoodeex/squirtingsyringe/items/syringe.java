package imexoodeex.squirtingsyringe.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Rarity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class syringe extends Item {

    public syringe(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("shift"));
        } else {
            tooltip.add(new TranslatableText(getClass().getSimpleName()));
        }
    }

}


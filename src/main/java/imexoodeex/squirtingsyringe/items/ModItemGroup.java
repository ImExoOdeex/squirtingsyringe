package imexoodeex.squirtingsyringe.items;

import imexoodeex.squirtingsyringe.Squirtingsyringe;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import imexoodeex.squirtingsyringe.registers.itemRegister;

public class ModItemGroup {

    public static final ItemGroup SQUIRTINGSYRINGE = FabricItemGroup.builder(new Identifier(Squirtingsyringe.MOD_ID, "group"))
            .icon(() -> new ItemStack(itemRegister.warrior_syringe)).displayName(Text.literal("Squirting syringe")).build();
}

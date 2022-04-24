package imexoodeex.squirtingsyringe.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import imexoodeex.squirtingsyringe.Squirtingsyringe;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import imexoodeex.squirtingsyringe.registers.itemRegister;

public class ModItemGroup {
    public static final ItemGroup SQUIRTINGSYRINGE = FabricItemGroupBuilder.build(
            new Identifier(Squirtingsyringe.MOD_ID, "squirtingsyringe"),
            () -> new ItemStack(itemRegister.warrior_syringe));
}

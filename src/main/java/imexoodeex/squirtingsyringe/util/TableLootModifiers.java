package imexoodeex.squirtingsyringe.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import imexoodeex.squirtingsyringe.items.healsyringe;

public class TableLootModifiers {
    private static final Identifier GRASS_BLOCK_ID = new Identifier("minecraft", "blocks/grass");

    private static final Identifier IGLOO_STRUCTURE_CHEST_ID = new Identifier("minecraft", "chests/igloo_chest");

    public static void modifyLootTables() {

    }
}

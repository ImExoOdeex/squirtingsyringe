package imexoodeex.squirtingsyringe.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static imexoodeex.squirtingsyringe.Squirtingsyringe.MOD_ID;

public class SSItems extends Item {
    public SSItems(Item.Settings settings) {
        super(settings);
    }

    public static Item registerItem(String itemName, Item item) {
        Registry.register(Registries.ITEM, createIdentifier(itemName), item);
        return item;
    }

    public static Identifier createIdentifier(String name) {
        return new Identifier(MOD_ID, name);
    }

}

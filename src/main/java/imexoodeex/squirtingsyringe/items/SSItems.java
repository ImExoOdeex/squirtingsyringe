package imexoodeex.squirtingsyringe.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static imexoodeex.squirtingsyringe.Squirtingsyringe.MOD_ID;

public class SSItems extends Item {
    public SSItems(Item.Settings settings) {
        super(settings);
    }

    public static Item registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, createIdentifier(itemName), item);
        return item;
    }

    public static Identifier createIdentifier(String name) {
        return new Identifier(MOD_ID, name);
    }

}

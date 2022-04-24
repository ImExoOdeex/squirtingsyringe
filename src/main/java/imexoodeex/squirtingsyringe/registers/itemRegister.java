package imexoodeex.squirtingsyringe.registers;

import imexoodeex.squirtingsyringe.items.*;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static imexoodeex.squirtingsyringe.items.SSItems.registerItem;

public class itemRegister {

    private static final Item.Settings createGroup = new Item.Settings().group(ModItemGroup.SQUIRTINGSYRINGE).maxCount(1).rarity(Rarity.UNCOMMON);

    public static Item heal_syringe = new healsyringe(createGroup.maxDamage(4));
    public static Item ghost_syringe = new ghostsyringe(createGroup.maxDamage(1));
    public static Item warrior_syringe = new warriorsyringe(createGroup.maxDamage(2));
    public static Item mining_syringe = new miningsyringe(createGroup.maxDamage(1));
    public static Item mushroom_syringe = new mushroomsyringe(createGroup.maxDamage(2));
    public static Item falling_syringe = new fallingsyringe(createGroup.maxDamage(2));
    public static Item fire_syringe = new firesyringe(createGroup.maxDamage(2));
    public static Item luck_syringe = new lucksyringe(createGroup.maxDamage(4));
    public static Item remove_syringe = new removesyringe(createGroup.maxDamage(1));
    public static Item focus_syringe = new focussyringe(createGroup.maxDamage(2));
    public static Item syringe = new syringe(new Item.Settings().group(ModItemGroup.SQUIRTINGSYRINGE).maxCount(64).rarity(Rarity.COMMON));

    public static void registerItems() {
        registerItem("heal_syringe", heal_syringe);
        registerItem("ghost_syringe", ghost_syringe);
        registerItem("warrior_syringe", warrior_syringe);
        registerItem("mining_syringe", mining_syringe);
        registerItem("mushroom_syringe", mushroom_syringe);
        registerItem("falling_syringe", falling_syringe);
        registerItem("fire_syringe", fire_syringe);
        registerItem("luck_syringe", luck_syringe);
        registerItem("remove_syringe", remove_syringe);
        registerItem("focus_syringe", focus_syringe);
        registerItem("syringe", syringe);
    }
}
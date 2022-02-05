package imexoodeex.squirtingsyringe;

import imexoodeex.squirtingsyringe.effects.focuseeffect;
import imexoodeex.squirtingsyringe.items.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// import net.minecraft.entity.effect.StatusEffect;
import imexoodeex.squirtingsyringe.sounds.Sounds;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Squirtingsyringe implements ModInitializer {

    public static final String MOD_ID = "squirtingsyringe";
    public static final Logger LOGGER = LogManager.getLogger("");

    public static final StatusEffect FOCUS = new focuseeffect();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "heal_syringe"),
                healsyringe.HEAL_SYRINGE);
        // ghost
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ghost_syringe"),
                ghostsyringe.GHOST_SYRINGE);
        // warrior
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warrior_syringe"),
                warriorsyringe.WARRIOR_SYRINGE);
        // mining
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mining_syringe"),
                miningsyringe.MINING_SYRINGE);
        // mushroom
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mushroom_syringe"),
                mushroomsyringe.MOOSHROOM_SYRINGE);
        // falling
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "falling_syringe"),
                fallingsyringe.FALLING_SYRINGE);
        // fire
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_syringe"),
                firesyringe.FIRE_SYRINGE);
        // luck
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "luck_syringe"),
                lucksyringe.LUCK_SYRINGE);
        // syringe
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "syringe"),
                syringe.SYRINGE);
        // focus effect
        Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, "focus_effect"), FOCUS);
        // sound
        Registry.register(Registry.SOUND_EVENT, Sounds.SOUND_ID, Sounds.SOUND_EVENT);
        LOGGER.info("loaded");
    }
}

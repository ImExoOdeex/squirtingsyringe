package imexoodeex.squirtingsyringe;

import imexoodeex.squirtingsyringe.effects.focuseeffect;
import imexoodeex.squirtingsyringe.registers.itemRegister;
import imexoodeex.squirtingsyringe.util.TableLootModifiers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import imexoodeex.squirtingsyringe.sounds.Sounds;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Squirtingsyringe implements ModInitializer {

    public static final String MOD_ID = "squirtingsyringe";
    public static final Logger LOGGER = LogManager.getLogger("");

    public static final StatusEffect FOCUS = new focuseeffect();

    @Override
    public void onInitialize() {
        //items
        itemRegister.registerItems();
        // focus effect
        Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, "focus_effect"), FOCUS);
        // sound
        Registry.register(Registry.SOUND_EVENT, Sounds.SOUND_ID, Sounds.SOUND_EVENT);
        TableLootModifiers.modifyLootTables();
    }
}

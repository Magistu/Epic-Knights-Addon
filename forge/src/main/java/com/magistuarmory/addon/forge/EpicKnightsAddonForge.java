package com.magistuarmory.addon.forge;

import com.magistuarmory.addon.EpicKnightsAddon;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EpicKnightsAddon.ID)
public class EpicKnightsAddonForge
{
    public EpicKnightsAddonForge()
    {
        System.out.println("zaebok");
        EventBuses.registerModEventBus(EpicKnightsAddon.ID, FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);

        EpicKnightsAddon.init();
    }
}

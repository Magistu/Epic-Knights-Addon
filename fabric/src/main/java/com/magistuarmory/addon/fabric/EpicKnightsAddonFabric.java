package com.magistuarmory.addon.fabric;

import com.magistuarmory.addon.EpicKnightsAddon;
import net.fabricmc.api.ModInitializer;

public class EpicKnightsAddonFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        EpicKnightsAddon.init();
    }
}

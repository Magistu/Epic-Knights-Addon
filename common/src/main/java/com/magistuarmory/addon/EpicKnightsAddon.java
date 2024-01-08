package com.magistuarmory.addon;

import com.magistuarmory.addon.client.render.model.AddonModels;
import com.magistuarmory.addon.item.AddonItems;
import dev.architectury.platform.Platform;
import net.fabricmc.api.EnvType;

public class EpicKnightsAddon
{
	public static final String ID = "magistuarmoryaddon";
    
    public static void init()
    {
		System.out.println("Hello from Epic Knights Addon init!");
	    AddonItems.INSTANCE.init();
		if (Platform.getEnv() == EnvType.CLIENT)
			AddonModels.INSTANCE.init(AddonItems.INSTANCE);
    }
}

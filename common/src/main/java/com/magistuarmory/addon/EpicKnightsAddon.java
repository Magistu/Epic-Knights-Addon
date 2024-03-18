package com.magistuarmory.addon;

import com.magistuarmory.addon.client.render.model.AddonModels;
import com.magistuarmory.addon.config.AddonConfig;
import com.magistuarmory.addon.item.AddonItems;
import com.magistuarmory.addon.misc.AddonMerchOffers;
import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.EnvType;

public class EpicKnightsAddon
{
	public static final String ID = "magistuarmoryaddon";
	public static AddonConfig CONFIG;
	
	static
	{
		AutoConfig.register(AddonConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(AddonConfig.class).getConfig();
	}
    
    public static void init()
    {
		System.out.println("Hello from Epic Knights Addon init!");
	    AddonItems.INSTANCE.init();
	    AddonMerchOffers.init();
		if (Platform.getEnv() == EnvType.CLIENT)
			AddonModels.INSTANCE.init(AddonItems.INSTANCE);
    }
}

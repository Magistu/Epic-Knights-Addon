package com.magistuarmory.addon.item;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.config.ShieldsConfig;
import com.magistuarmory.item.ShieldType;

public class AddonShieldTypes
{
	public static final ShieldsConfig SHIELDS_CONFIG = EpicKnightsAddon.CONFIG.shields;
	
	public static final ShieldType DUELING_SHIELD = new ShieldType(480, 1.5f, 7.0f, 14.0f, SHIELDS_CONFIG.enableDuelingShield).setRepairable();
}

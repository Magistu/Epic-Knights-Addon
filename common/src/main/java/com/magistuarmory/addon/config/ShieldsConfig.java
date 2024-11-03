package com.magistuarmory.addon.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

@Config(name = "shields")
public class ShieldsConfig implements ConfigData
{
	@ConfigEntry.Gui.RequiresRestart
    public boolean enableDuelingShield;


    public ShieldsConfig() {
		this.enableDuelingShield = true;
	}

}

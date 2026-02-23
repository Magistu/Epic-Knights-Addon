package com.magistuarmory.addon.config;

import com.magistuarmory.item.ShieldType;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "shields")
public class ShieldsConfig implements ConfigData
{
	@ConfigEntry.Gui.CollapsibleObject
	private Map<String, ShieldType> shields = new LinkedHashMap<>() {{
		put("duelingShield", ShieldType.of(480, 1.5f, 7.0f, 14.0f, true, true));
	}};

	public ShieldType get(String name) {
		return this.shields.get(name);
	}
}

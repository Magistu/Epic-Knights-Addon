// 
// Decompiled by Procyon v0.5.36
// 

package com.magistuarmory.addon.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

@Config(name = "epicknightsaddon")
public class AddonConfig extends PartitioningSerializer.GlobalData
{
    @ConfigEntry.Gui.CollapsibleObject
    public WeaponsConfig weapons;
    
    @ConfigEntry.Gui.CollapsibleObject
    public ArmorConfig armor;
    
    public AddonConfig() {
        this.weapons = new WeaponsConfig();
        this.armor = new ArmorConfig();
    }
}

package com.magistuarmory.addon.config;

import com.magistuarmory.item.WeaponType;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "weapons")
public class WeaponsConfig implements ConfigData
{
    @ConfigEntry.Gui.CollapsibleObject
    private Map<String, WeaponType> meleeWeapons = new LinkedHashMap<>() {{
        put("barMace", WeaponType.of(4.55f, 1.18f, 0.00f, 0.05f, 2.6f, 0, true));
        put("battleaxe", WeaponType.of(5.30f, 1.05f, 0.00f, 0.02f, 2.3f, 0, true));
        put("broadaxe", WeaponType.of(6.80f, 1.04f, 0.80f, 0.05f, 3.5f, 0, true, 2, 3.00f, true, false, false));
        put("crowBeak", WeaponType.of(4.20f, 1.26f, 0.00f, 0.03f, 2.0f, 15, true));
        put("franciscaAxe", WeaponType.of(4.30f, 1.20f, 0.00f, 0.00f, 2.4f, 0, true));
        put("roundMace", WeaponType.of(4.70f, 1.25f, 0.00f, 0.05f, 2.0f, 0, true));
        put("warAxe", WeaponType.of(5.30f, 1.05f, 0.00f, 0.02f, 2.3f, 0, true));
        put("warHammer", WeaponType.of(4.60f, 1.20f, 0.00f, 0.03f, 2.0f, 5, true));
        put("bollockDagger", WeaponType.of(2.80f, 1.80f, 0.00f, 0.00f, 0.6f, 0, true));
        put("dagger", WeaponType.of(2.80f, 1.80f, 0.00f, 0.00f, 0.6f, 0, true));
        put("parryingDagger", WeaponType.of(2.50f, 1.97f, 0.00f, 0.00f, 0.6f, 0, true));
        put("rondelDagger", WeaponType.of(2.30f, 1.65f, 0.00f, 0.00f, 0.6f, 8, true));
        put("sickle", WeaponType.of(1.50f, 1.60f, 0.00f, 0.00f, 0.6f, 0, true));
        put("executionersSword", WeaponType.of(6.00f, 1.12f, 0.20f, 0.05f, 3.9f, 0, true, 2, 4.00f, true, false, false));
        put("germanGreatsword", WeaponType.of(5.90f, 1.15f, 0.50f, 0.05f, 3.9f, 0, true, 2, 3.00f, true, false, false));
        put("twoHandedMesser", WeaponType.of(5.60f, 1.15f, 0.50f, 0.05f, 3.8f, 0, true, 2, 3.00f, true, false, false));
        put("englishPoleaxe", WeaponType.of(7.60f, 0.85f, 1.00f, 0.05f, 4.0f, 1, true, 2, 4.00f, true, false, true));
        put("frenchHalberd", WeaponType.of(7.15f, 0.90f, 1.00f, 0.05f, 4.1f, 3, true, 2, 2.00f, true, false, true));
        put("italianPoleaxe", WeaponType.of(7.40f, 0.90f, 1.00f, 0.04f, 3.8f, 0, true, 2, 4.00f, true, false, true));
        put("swissHalberd", WeaponType.of(7.35f, 0.92f, 1.00f, 0.04f, 3.8f, 0, true, 2, 2.00f, true, false, true));
        put("lance", WeaponType.of(2.00f, 1.00f, 2.00f, 0.00f, 3.0f, 0, true));
        put("daneaxe", WeaponType.of(7.20f, 0.94f, 0.90f, 0.05f, 2.5f, 0, true, 2, 4.00f, true, false, false));
        put("gallowglassAxe", WeaponType.of(7.20f, 0.94f, 0.90f, 0.05f, 2.5f, 0, true, 2, 4.00f, true, false, false));
        put("hammerSpear", WeaponType.of(7.20f, 1.00f, 0.80f, 0.05f, 3.5f, 0, true, 2, 3.00f, true, false, false));
        put("twoHandedEveningStar", WeaponType.of(7.20f, 1.00f, 0.80f, 0.05f, 3.5f, 0, true, 2, 3.00f, true, false, false));
        put("cavalrySabre", WeaponType.of(3.58f, 1.53f, 0.00f, 0.00f, 1.6f, 0, true, 0, 4.00f, true, false, false));
        put("cutlass", WeaponType.of(3.80f, 1.53f, 0.00f, 0.04f, 1.2f, 0, true, 1, 4.00f, true, false, false));
        put("falchion", WeaponType.of(3.55f, 1.55f, 0.00f, 0.00f, 1.6f, 0, true, 0, 4.00f, true, false, false));
        put("feder", WeaponType.of(0.00f, 1.50f, 0.20f, 0.02f, 1.6f, 2, true, 1, 4.00f, true, false, false));
        put("grandFalchion", WeaponType.of(5.91f, 1.06f, 0.00f, 0.06f, 2.3f, 0, true, 2, 4.00f, true, false, false));
        put("kingSword", WeaponType.of(4.50f, 1.36f, 0.00f, 0.02f, 1.8f, 0, true, 1, 5.00f, true, false, false));
        put("longsword", WeaponType.of(4.20f, 1.42f, 0.00f, 0.02f, 2.5f, 0, true, 1, 5.00f, true, false, false));
        put("longSeax", WeaponType.of(4.00f, 1.46f, 0.00f, 0.02f, 2.1f, 0, true, 0, 3.00f, true, false, false));
        put("maciejowskiMesser", WeaponType.of(3.50f, 1.48f, 0.00f, 0.00f, 1.6f, 0, true, 0, 4.00f, true, false, false));
        put("messerSword", WeaponType.of(3.45f, 1.50f, 0.00f, 0.02f, 1.2f, 0, true, 0, 5.00f, true, false, false));
        put("rapier", WeaponType.of(3.40f, 1.60f, 0.00f, 0.00f, 1.2f, 5, true, 0, 6.00f, true, false, false));
        put("scimitar", WeaponType.of(3.90f, 1.50f, 0.00f, 0.04f, 2.1f, 0, true, 1, 4.00f, true, false, false));
        put("sidesword", WeaponType.of(3.68f, 1.46f, 0.10f, 0.00f, 1.5f, 2, true, 0, 6.00f, true, false, false));
        put("billhook", WeaponType.of(2.53f, 1.35f, 1.50f, 0.00f, 3.0f, 0, true, 1, 2.00f, true, false, true));
        put("boarSpear", WeaponType.of(3.00f, 1.15f, 1.50f, 0.00f, 1.8f, 0, true, 1, 2.00f, true, false, false));
        put("fauchard", WeaponType.of(3.15f, 1.10f, 2.00f, 0.01f, 3.0f, 0, true, 1, 1.00f, true, false, false));
        put("glaive", WeaponType.of(3.10f, 1.15f, 2.00f, 0.00f, 2.5f, 0, true, 1, 3.00f, true, false, false));
        put("goedendag", WeaponType.of(3.90f, 1.10f, 1.00f, 0.00f, 2.5f, 16, true, 2, 0.0f, false, false, false));
        put("militaryFork", WeaponType.of(2.90f, 1.12f, 1.80f, 0.05f, 2.2f, 0, true));
        put("partisan", WeaponType.of(3.35f, 1.17f, 1.90f, 0.00f, 2.5f, 0, true, 1, 5.00f, true, false, false));
        put("scythe", WeaponType.of(5.00f, 0.85f, 1.20f, 0.04f, 3.0f, 0, true, 2, 0.0f, false, false, false));
        put("shortSpear", WeaponType.of(3.00f, 1.20f, 1.45f, 0.00f, 1.7f, 0, true, 1, 2.00f, true, false, false));
        put("voulge", WeaponType.of(3.20f, 1.15f, 1.60f, 0.00f, 2.5f, 0, true, 1, 1.00f, true, false, true));
        put("welshGuisarme", WeaponType.of(3.50f, 1.07f, 1.90f, 0.00f, 2.5f, 0, true, 1, 3.00f, true, false, false));
        put("armingSwordTypeXiii", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.1f, 0, true));
        put("armingSwordTypeXiv", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.1f, 0, true));
        put("armingSwordTypeXv", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.1f, 0, true));
        put("richSaxonSword", WeaponType.of(3.38f, 1.65f, 0.00f, 0.00f, 1.1f, 0, true));
        put("sabre", WeaponType.of(3.61f, 1.58f, 0.00f, 0.00f, 1.5f, 0, true, 0, 4.00f, true, false, false));
        put("saxonSword", WeaponType.of(3.50f, 1.60f, 0.00f, 0.00f, 1.1f, 0, true));
        put("shortSeax", WeaponType.of(3.25f, 1.68f, 0.00f, 0.00f, 0.9f, 0, true));
        put("swordbreaker", WeaponType.of(3.00f, 1.60f, 0.00f, 0.00f, 1.3f, 0, true, 0, 10.00f, true, false, false));
        put("trainingSword", WeaponType.of(0.00f, 1.40f, 0.00f, 0.02f, 1.6f, 0, true, 1, 4.00f, true, false, false));
    }};

    public WeaponType getMelee(String name) {
        return this.meleeWeapons.get(name);
    }
}

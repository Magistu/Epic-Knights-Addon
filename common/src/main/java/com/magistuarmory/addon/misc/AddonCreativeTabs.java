package com.magistuarmory.addon.misc;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.addon.item.AddonItems;
import com.magistuarmory.item.ArmorDecoration;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class AddonCreativeTabs
{
	public static final ResourceKey<CreativeModeTab> PARTICULAR_WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "particular_weapons"));
	public static final ResourceKey<CreativeModeTab> ARMOR_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "armor"));
	public static final ResourceKey<CreativeModeTab> ARMOR_DECORATIONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "armor_decorations"));
	public static final ResourceKey<CreativeModeTab> INGREDIENTS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, CreativeModeTabs.INGREDIENTS.location());

	public static void init()
	{
		for (RegistrySupplier<? extends Item> item : AddonItems.INSTANCE.weaponItems)
			append(PARTICULAR_WEAPONS_RESOURCE_KEY, item);
		
		for (RegistrySupplier<? extends Item> item : AddonItems.INSTANCE.armorItems)
			append(ARMOR_RESOURCE_KEY, item);
		
		for (RegistrySupplier<? extends ArmorDecoration> item : AddonItems.INSTANCE.armorDecorationItems)
			append(ARMOR_DECORATIONS_RESOURCE_KEY, item);

		for (RegistrySupplier<? extends Item> item : AddonItems.INSTANCE.ingredientItems)
			append(INGREDIENTS_RESOURCE_KEY, item);

		append(ARMOR_RESOURCE_KEY, AddonItems.DARK_BARDING);
	}

	@SafeVarargs
	public static <I extends ItemLike, T extends Supplier<I>> void append(ResourceKey<CreativeModeTab> tab, T... items)
	{
		Arrays.stream(items).filter(Objects::nonNull).forEach((item) -> CreativeTabRegistry.append(tab, item));
	}
}

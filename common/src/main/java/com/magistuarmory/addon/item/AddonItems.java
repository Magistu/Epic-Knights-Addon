package com.magistuarmory.addon.item;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.item.armor.AddonArmorTypes;
import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.*;
import com.magistuarmory.item.armor.DyeableWearableArmorDecorationItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import com.magistuarmory.item.armor.MedievalHorseArmorItem;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.armor.WearableArmorDecorationItem;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class AddonItems extends ModItemsProvider
{
	public static AddonItems INSTANCE = new AddonItems();

	// Weapons
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BAR_MACE = INSTANCE.addMedievalWeaponItem("steel_bar_mace", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BAR_MACE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BATTLEAXE = INSTANCE.addMedievalWeaponItem("steel_battleaxe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BATTLEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_CROW_BEAK = INSTANCE.addMedievalWeaponItem("steel_crow_beak", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.CROW_BEAK);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FRANCISCA_AXE = INSTANCE.addMedievalWeaponItem("steel_francisca_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.FRANCISCA_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ROUND_MACE = INSTANCE.addMedievalWeaponItem("steel_round_mace", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.ROUND_MACE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_WAR_AXE = INSTANCE.addMedievalWeaponItem("steel_war_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.WAR_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_WAR_HAMMER = INSTANCE.addMedievalWeaponItem("steel_war_hammer", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.WAR_HAMMER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BOLLOCK_DAGGER = INSTANCE.addMedievalWeaponItem("steel_bollock_dagger", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BOLLOCK_DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_DAGGER = INSTANCE.addMedievalWeaponItem("steel_dagger", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_PARRYING_DAGGER = INSTANCE.addMedievalWeaponItem("steel_parrying_dagger", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.PARRYING_DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RONDEL_DAGGER = INSTANCE.addMedievalWeaponItem("steel_rondel_dagger", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.RONDEL_DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SICKLE = INSTANCE.addMedievalWeaponItem("steel_sickle", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SICKLE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_EXECUTIONERS_SWORD = INSTANCE.addMedievalWeaponItem("steel_executioners_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.EXECUTIONERS_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GERMAN_GREATSWORD = INSTANCE.addMedievalWeaponItem("steel_german_greatsword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.GERMAN_GREATSWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_TWO_HANDED_MESSER = INSTANCE.addMedievalWeaponItem("steel_two_handed_messer", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.TWO_HANDED_MESSER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ENGLISH_POLEAXE = INSTANCE.addMedievalWeaponItem("steel_english_poleaxe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.ENGLISH_POLEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FRENCH_HALBERD = INSTANCE.addMedievalWeaponItem("steel_french_halberd", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.FRENCH_HALBERD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ITALIAN_POLEAXE = INSTANCE.addMedievalWeaponItem("steel_italian_poleaxe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.ITALIAN_POLEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SWISS_HALBERD = INSTANCE.addMedievalWeaponItem("steel_swiss_halberd", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SWISS_HALBERD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LANCE = INSTANCE.addMedievalWeaponItem("steel_lance", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.LANCE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BROADAXE = INSTANCE.addMedievalWeaponItem("steel_broadaxe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BROADAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_DANEAXE = INSTANCE.addMedievalWeaponItem("steel_daneaxe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.DANEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GALLOWGLASS_AXE = INSTANCE.addMedievalWeaponItem("steel_gallowglass_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.GALLOWGLASS_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_HAMMER_SPEAR = INSTANCE.addMedievalWeaponItem("steel_hammer_spear", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.HAMMER_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_TWO_HANDED_EVENING_STAR = INSTANCE.addMedievalWeaponItem("steel_two_handed_evening_star", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.TWO_HANDED_EVENING_STAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_CAVALRY_SABRE = INSTANCE.addMedievalWeaponItem("steel_cavalry_sabre", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.CAVALRY_SABRE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_CUTLASS = INSTANCE.addMedievalWeaponItem("steel_cutlass", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.CUTLASS);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FALCHION = INSTANCE.addMedievalWeaponItem("steel_falchion", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.FALCHION);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FEDER = INSTANCE.addMedievalWeaponItem("steel_feder", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.FEDER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GRAND_FALCHION = INSTANCE.addMedievalWeaponItem("steel_grand_falchion", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.GRAND_FALCHION);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_KING_SWORD = INSTANCE.addMedievalWeaponItem("steel_king_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.KING_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LONGSWORD = INSTANCE.addMedievalWeaponItem("steel_longsword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.LONGSWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LONG_SEAX = INSTANCE.addMedievalWeaponItem("steel_long_seax", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.LONG_SEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_MACIEJOWSKI_MESSER = INSTANCE.addMedievalWeaponItem("steel_maciejowski_messer", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.MACIEJOWSKI_MESSER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_MESSER_SWORD = INSTANCE.addMedievalWeaponItem("steel_messer_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.MESSER_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RAPIER = INSTANCE.addMedievalWeaponItem("steel_rapier", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.RAPIER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SCIMITAR = INSTANCE.addMedievalWeaponItem("steel_scimitar", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SCIMITAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SIDESWORD = INSTANCE.addMedievalWeaponItem("steel_sidesword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SIDESWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> TRAINING_SWORD = INSTANCE.addMedievalWeaponItem("training_sword", new Item.Properties(), ModItemTier.WOOD, AddonWeaponTypes.TRAINING_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BILLHOOK = INSTANCE.addMedievalWeaponItem("steel_billhook", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BILLHOOK);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BOAR_SPEAR = INSTANCE.addMedievalWeaponItem("steel_boar_spear", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BOAR_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FAUCHARD = INSTANCE.addMedievalWeaponItem("steel_fauchard", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.FAUCHARD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GLAIVE = INSTANCE.addMedievalWeaponItem("steel_glaive", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.GLAIVE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GOEDENDAG = INSTANCE.addMedievalWeaponItem("steel_goedendag", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.GOEDENDAG);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_MILITARY_FORK = INSTANCE.addMedievalWeaponItem("steel_military_fork", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.MILITARY_FORK);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_PARTISAN = INSTANCE.addMedievalWeaponItem("steel_partisan", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.PARTISAN);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SCYTHE = INSTANCE.addMedievalWeaponItem("steel_scythe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SCYTHE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SHORT_SPEAR = INSTANCE.addMedievalWeaponItem("steel_short_spear", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SHORT_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_VOULGE = INSTANCE.addMedievalWeaponItem("steel_voulge", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.VOULGE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_WELSH_GUISARME = INSTANCE.addMedievalWeaponItem("steel_welsh_guisarme", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.WELSH_GUISARME);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ARMING_SWORD_TYPE_XIII = INSTANCE.addMedievalWeaponItem("steel_arming_sword_type_xiii", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.ARMING_SWORD_TYPE_XIII);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ARMING_SWORD_TYPE_XIV = INSTANCE.addMedievalWeaponItem("steel_arming_sword_type_xiv", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.ARMING_SWORD_TYPE_XIV);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ARMING_SWORD_TYPE_XV = INSTANCE.addMedievalWeaponItem("steel_arming_sword_type_xv", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.ARMING_SWORD_TYPE_XV);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> RICH_SAXON_SWORD = INSTANCE.addMedievalWeaponItem("rich_saxon_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.RICH_SAXON_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SABRE = INSTANCE.addMedievalWeaponItem("steel_sabre", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SABRE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SAXON_SWORD = INSTANCE.addMedievalWeaponItem("steel_saxon_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SAXON_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SHORT_SEAX = INSTANCE.addMedievalWeaponItem("steel_short_seax", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SHORT_SEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SWORDBREAKER = INSTANCE.addMedievalWeaponItem("steel_swordbreaker", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SWORDBREAKER);


	// Armor
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_knight_chestplate", AddonArmorTypes.DARK_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("dark_knight_leggings", AddonArmorTypes.DARK_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("dark_knight_boots", AddonArmorTypes.DARK_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_HELMET = INSTANCE.addKnightItem("dark_knight_helmet", AddonArmorTypes.DARK_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_HELMET = INSTANCE.addJoustingItem("dark_jousting_helmet", AddonArmorTypes.DARK_STECHHELM, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_CHESTPLATE = INSTANCE.addJoustingItem("dark_jousting_chestplate", AddonArmorTypes.DARK_JOUSTING, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_LEGGINGS = INSTANCE.addJoustingItem("dark_jousting_leggings", AddonArmorTypes.DARK_JOUSTING, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_BOOTS = INSTANCE.addJoustingItem("dark_jousting_boots", AddonArmorTypes.DARK_JOUSTING, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_HELMET = INSTANCE.addMedievalArmorItem("dark_gothic_helmet", AddonArmorTypes.DARK_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_gothic_chestplate", AddonArmorTypes.DARK_GOTHIC, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("dark_gothic_leggings", AddonArmorTypes.DARK_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("dark_gothic_boots", AddonArmorTypes.DARK_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("dark_maximilian_helmet", AddonArmorTypes.DARK_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_maximilian_chestplate", AddonArmorTypes.DARK_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("dark_maximilian_leggings", AddonArmorTypes.DARK_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("dark_maximilian_boots", AddonArmorTypes.DARK_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_HELMET = INSTANCE.addMedievalArmorItem("dark_crusader_helmet", AddonArmorTypes.DARK_GREATHELM, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("dark_crusader_chestplate", AddonArmorTypes.DARK_CRUSADER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_LEGGINGS = INSTANCE.addMedievalArmorItem("dark_crusader_leggings", AddonArmorTypes.DARK_CRUSADER, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_BOOTS = INSTANCE.addDyeableMedievalArmorItem("dark_crusader_boots", AddonArmorTypes.DARK_CRUSADER, ArmorItem.Type.BOOTS, new Item.Properties(), -0x313e5a);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GRAND_BASCINET = INSTANCE.addMedievalArmorItem("dark_grand_bascinet", AddonArmorTypes.DARK_GRAND_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_kastenbrust_chestplate", AddonArmorTypes.DARK_KASTENBRUST, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("dark_kastenbrust_leggings", AddonArmorTypes.DARK_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("dark_kastenbrust_boots", AddonArmorTypes.DARK_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SAVOYARD_HELMET = INSTANCE.addMedievalArmorItem("savoyard_helmet", AddonArmorTypes.SAVOYARD_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MORION = INSTANCE.addMedievalArmorItem("morion", AddonArmorTypes.MORION, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PIKEMAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("pikeman_chestplate", AddonArmorTypes.PIKEMAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PIKEMAN_BOOTS = INSTANCE.addMedievalArmorItem("pikeman_boots", AddonArmorTypes.PIKEMAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MILANESE_ARMET = INSTANCE.addMedievalArmorItem("milanese_armet", AddonArmorTypes.MILANESE_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRITISH_ARMET = INSTANCE.addMedievalArmorItem("british_armet", AddonArmorTypes.BRITISH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> AVANT_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("avant_chestplate", AddonArmorTypes.AVANT, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0x213c8f);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> AVANT_LEGGINGS = INSTANCE.addMedievalArmorItem("avant_leggings", AddonArmorTypes.AVANT, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> AVANT_BOOTS = INSTANCE.addDyeableMedievalArmorItem("avant_boots", AddonArmorTypes.AVANT, ArmorItem.Type.BOOTS, new Item.Properties(), 0x213c8f);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VISORED_KETTLEHAT = INSTANCE.addMedievalArmorItem("visored_kettlehat", AddonArmorTypes.VISORED_KETTLEHAT, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CERVELLIERE = INSTANCE.addMedievalArmorItem("cervelliere", AddonArmorTypes.CERVELLIERE, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CLOSED_BARBUTE = INSTANCE.addMedievalArmorItem("closed_barbute", AddonArmorTypes.CLOSED_BARBUTE, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BICOQUE = INSTANCE.addMedievalArmorItem("bicoque", AddonArmorTypes.BICOQUE, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LINEN_COIF = INSTANCE.addDyeableMedievalArmorItem("linen_coif", AddonArmorTypes.LINEN, ArmorItem.Type.HELMET, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SALLET_WITHOUT_NECK_PROTECTION = INSTANCE.addMedievalArmorItem("sallet_without_neck_protection", AddonArmorTypes.SALLET_WITHOUT_NECK_PROTECTION, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BELLOWS_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("bellows_maximilian_helmet", AddonArmorTypes.BELLOWS_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> KULAH_KHUD = INSTANCE.addMedievalArmorItem("kulah_khud", AddonArmorTypes.KULAH_KHUD, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CUMAN_CAPTAIN_HELMET = INSTANCE.addMedievalArmorItem("cuman_captain_helmet", AddonArmorTypes.CUMAN_CAPTAIN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MIRROR_CHESTPLATE = INSTANCE.addMedievalArmorItem("mirror_chestplate", AddonArmorTypes.MIRROR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MIRROR_BOOTS = INSTANCE.addMedievalArmorItem("mirror_boots", AddonArmorTypes.MIRROR, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SARACEN_HELMET = INSTANCE.addDyeableMedievalArmorItem("saracen_helmet", AddonArmorTypes.SARACEN, ArmorItem.Type.HELMET, new Item.Properties(), 0xff0000);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SARACEN_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("saracen_chestplate", AddonArmorTypes.SARACEN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xff0000);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SARACEN_BOOTS = INSTANCE.addDyeableMedievalArmorItem("saracen_boots", AddonArmorTypes.SARACEN, ArmorItem.Type.BOOTS, new Item.Properties(), 0xff0000);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EARLY_GREATHELM = INSTANCE.addMedievalArmorItem("early_greathelm", AddonArmorTypes.EARLY_GREATHELM, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> XIII_CENTURY_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("xiii_century_knight_chestplate", AddonArmorTypes.XIII_CENTURY_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> XIII_CENTURY_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("xiii_century_knight_leggings", AddonArmorTypes.XIII_CENTURY_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> XIII_CENTURY_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("xiii_century_knight_boots", AddonArmorTypes.XIII_CENTURY_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> KLAPPVISOR_BASCINET = INSTANCE.addMedievalArmorItem("klappvisor_bascinet", AddonArmorTypes.KLAPPVISOR_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_BASCINET = INSTANCE.addMedievalArmorItem("late_bascinet", AddonArmorTypes.LATE_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LOBSTER_TAILED_HELMET = INSTANCE.addMedievalArmorItem("lobster_tailed_helmet", AddonArmorTypes.LOBSTER_TAILED_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHAPEL = INSTANCE.addDyeableMedievalArmorItem("chapel", AddonArmorTypes.CHAPEL, ArmorItem.Type.HELMET, new Item.Properties(), -0x415173);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHAINED_GAMBESON = INSTANCE.addDyeableMedievalArmorItem("chained_gambeson", AddonArmorTypes.CHAINED_GAMBESON, ArmorItem.Type.CHESTPLATE, new Item.Properties(), -0x415173);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHAINED_GAMBESON_BOOTS = INSTANCE.addDyeableMedievalArmorItem("chained_gambeson_boots", AddonArmorTypes.CHAINED_GAMBESON, ArmorItem.Type.BOOTS, new Item.Properties(), -0x415173);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TABLET_HELMET = INSTANCE.addMedievalArmorItem("tablet_helmet", AddonArmorTypes.TABLET_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_GREATHELM = INSTANCE.addMedievalArmorItem("late_greathelm", AddonArmorTypes.LATE_GREATHELM, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BURGUNDIAN_KETTLEHAT = INSTANCE.addMedievalArmorItem("burgundian_kettlehat", AddonArmorTypes.BURGUNDIAN_KETTLEHAT, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CLOSED_BURGONET = INSTANCE.addMedievalArmorItem("closed_burgonet", AddonArmorTypes.CLOSED_BURGONET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_CUIRASSIER_CHESTPLATE = INSTANCE.addMedievalArmorItem("heavy_cuirassier_chestplate", AddonArmorTypes.HEAVY_CUIRASSIER, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_CUIRASSIER_BOOTS = INSTANCE.addMedievalArmorItem("heavy_cuirassier_boots", AddonArmorTypes.HEAVY_CUIRASSIER, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_CUIRASSIER_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_heavy_cuirassier_chestplate", AddonArmorTypes.DARK_HEAVY_CUIRASSIER, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_CUIRASSIER_BOOTS = INSTANCE.addMedievalArmorItem("dark_heavy_cuirassier_boots", AddonArmorTypes.DARK_HEAVY_CUIRASSIER, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_BURGONET = INSTANCE.addMedievalArmorItem("light_burgonet", AddonArmorTypes.LIGHT_BURGONET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_BURGONET = INSTANCE.addMedievalArmorItem("late_burgonet", AddonArmorTypes.LATE_BURGONET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DEVILISH_GROTESQUE_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("devilish_grotesque_maximilian_helmet", AddonArmorTypes.DEVILISH_GROTESQUE_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FACIAL_GROTESQUE_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("facial_grotesque_maximilian_helmet", AddonArmorTypes.FACIAL_GROTESQUE_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("dark_gilded_greenwich_armet", AddonArmorTypes.DARK_GILDED_GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_gilded_greenwich_chestplate", AddonArmorTypes.DARK_GILDED_GREENWICH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_GREENWICH_BOOTS = INSTANCE.addMedievalArmorItem("dark_gilded_greenwich_boots", AddonArmorTypes.DARK_GILDED_GREENWICH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("dark_greenwich_armet", AddonArmorTypes.DARK_GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_greenwich_chestplate", AddonArmorTypes.DARK_GREENWICH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GREENWICH_BOOTS = INSTANCE.addMedievalArmorItem("dark_greenwich_boots", AddonArmorTypes.DARK_GREENWICH, ArmorItem.Type.LEGGINGS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_SALLET = INSTANCE.addMedievalArmorItem("late_sallet", AddonArmorTypes.LATE_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_LATE_SALLET = INSTANCE.addMedievalArmorItem("dark_late_sallet", AddonArmorTypes.DARK_LATE_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STEEL_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addMedievalArmorItem("steel_puff_and_slash_chestplate", AddonArmorTypes.STEEL_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> STEEL_PUFF_AND_SLASH_BOOTS = INSTANCE.addMedievalArmorItem("steel_puff_and_slash_boots", AddonArmorTypes.STEEL_PUFF_AND_SLASH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_STEEL_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_steel_puff_and_slash_chestplate", AddonArmorTypes.GILDED_STEEL_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_STEEL_PUFF_AND_SLASH_BOOTS = INSTANCE.addMedievalArmorItem("gilded_steel_puff_and_slash_boots", AddonArmorTypes.GILDED_STEEL_PUFF_AND_SLASH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STURMHAUBE = INSTANCE.addMedievalArmorItem("sturmhaube", AddonArmorTypes.STURMHAUBE, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_BELLOWS_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("silvered_dark_bellows_maximilian_helmet", AddonArmorTypes.SILVERED_DARK_BELLOWS_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("silvered_dark_maximilian_helmet", AddonArmorTypes.SILVERED_DARK_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("silvered_dark_maximilian_chestplate", AddonArmorTypes.SILVERED_DARK_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("silvered_dark_maximilian_boots", AddonArmorTypes.SILVERED_DARK_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GRAND_BASCINET = INSTANCE.addMedievalArmorItem("gilded_grand_bascinet", AddonArmorTypes.GILDED_GRAND_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CEREMONIAL_KASTENBRUST_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("ceremonial_kastenbrust_chestplate", AddonArmorTypes.CEREMONIAL_KASTENBRUST, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xff0000);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CEREMONIAL_KASTENBRUST_BOOTS = INSTANCE.addDyeableMedievalArmorItem("ceremonial_kastenbrust_boots", AddonArmorTypes.CEREMONIAL_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties(), 0xff0000);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_XIVCENTURYKNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_xivcenturyknight_chestplate", AddonArmorTypes.GILDED_XIV_CENTURY_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_XIVCENTURYKNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("gilded_xivcenturyknight_boots", AddonArmorTypes.GILDED_XIV_CENTURY_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLOWGLASS_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("gallowglass_chestplate", AddonArmorTypes.GALLOWGLASS, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xc4c38c);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLOWGLASS_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("gallowglass_leggings", AddonArmorTypes.GALLOWGLASS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xc4c38c);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLOWGLASS_BOOTS = INSTANCE.addMedievalArmorItem("gallowglass_boots", AddonArmorTypes.GALLOWGLASS, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ENGLISH_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("english_knight_chestplate", AddonArmorTypes.ENGLISH_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> ENGLISH_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("english_knight_boots", AddonArmorTypes.ENGLISH_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HALF_ARMOR = INSTANCE.addMedievalArmorItem("gilded_half_armor", AddonArmorTypes.GILDED_HALF_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_EXQUISITE_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("gilded_exquisite_maximilian_helmet", AddonArmorTypes.GILDED_EXQUISITE_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("gilded_maximilian_helmet", AddonArmorTypes.GILDED_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_maximilian_chestplate", AddonArmorTypes.GILDED_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("gilded_maximilian_boots", AddonArmorTypes.GILDED_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> COAT_OF_PLATES_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("coat_of_plates_chestplate", AddonArmorTypes.COAT_OF_PLATES, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0x8b4513);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> COAT_OF_PLATES_BOOTS = INSTANCE.addDyeableMedievalArmorItem("coat_of_plates_boots", AddonArmorTypes.COAT_OF_PLATES, ArmorItem.Type.BOOTS, new Item.Properties(), 0x8b4513);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_HALF_ARMOR = INSTANCE.addMedievalArmorItem("silvered_dark_half_armor", AddonArmorTypes.SILVERED_DARK_HALF_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_SALLET = INSTANCE.addMedievalArmorItem("gilded_dark_sallet", AddonArmorTypes.GILDED_DARK_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_dark_gothic_chestplate", AddonArmorTypes.GILDED_DARK_GOTHIC, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("gilded_dark_gothic_boots", AddonArmorTypes.GILDED_DARK_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_SALLET = INSTANCE.addMedievalArmorItem("gilded_sallet", AddonArmorTypes.GILDED_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_gothic_chestplate", AddonArmorTypes.GILDED_GOTHIC, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("gilded_gothic_boots", AddonArmorTypes.GILDED_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("gilded_greenwich_armet", AddonArmorTypes.GILDED_GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_greenwich_chestplate", AddonArmorTypes.GILDED_GREENWICH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GREENWICH_BOOTS = INSTANCE.addMedievalArmorItem("gilded_greenwich_boots", AddonArmorTypes.GILDED_GREENWICH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("greenwich_armet", AddonArmorTypes.GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("greenwich_chestplate", AddonArmorTypes.GREENWICH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREENWICH_BOOTS = INSTANCE.addMedievalArmorItem("greenwich_boots", AddonArmorTypes.GREENWICH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ORANGE_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("orange_puff_and_slash_chestplate", AddonArmorTypes.ORANGE_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> ORANGE_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("orange_puff_and_slash_leggings", AddonArmorTypes.ORANGE_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MAGENTA_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("magenta_puff_and_slash_chestplate", AddonArmorTypes.MAGENTA_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MAGENTA_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("magenta_puff_and_slash_leggings", AddonArmorTypes.MAGENTA_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_BLUE_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("light_blue_puff_and_slash_chestplate", AddonArmorTypes.LIGHT_BLUE_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_BLUE_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("light_blue_puff_and_slash_leggings", AddonArmorTypes.LIGHT_BLUE_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("yellow_puff_and_slash_chestplate", AddonArmorTypes.YELLOW_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("yellow_puff_and_slash_leggings", AddonArmorTypes.YELLOW_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIME_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("lime_puff_and_slash_chestplate", AddonArmorTypes.LIME_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIME_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("lime_puff_and_slash_leggings", AddonArmorTypes.LIME_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PINK_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("pink_puff_and_slash_chestplate", AddonArmorTypes.PINK_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PINK_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("pink_puff_and_slash_leggings", AddonArmorTypes.PINK_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GRAY_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("gray_puff_and_slash_chestplate", AddonArmorTypes.GRAY_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GRAY_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("gray_puff_and_slash_leggings", AddonArmorTypes.GRAY_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_GRAY_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("light_gray_puff_and_slash_chestplate", AddonArmorTypes.LIGHT_GRAY_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_GRAY_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("light_gray_puff_and_slash_leggings", AddonArmorTypes.LIGHT_GRAY_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CYAN_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("cyan_puff_and_slash_chestplate", AddonArmorTypes.CYAN_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CYAN_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("cyan_puff_and_slash_leggings", AddonArmorTypes.CYAN_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PURPLE_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("purple_puff_and_slash_chestplate", AddonArmorTypes.PURPLE_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PURPLE_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("purple_puff_and_slash_leggings", AddonArmorTypes.PURPLE_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLUE_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("blue_puff_and_slash_chestplate", AddonArmorTypes.BLUE_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLUE_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("blue_puff_and_slash_leggings", AddonArmorTypes.BLUE_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("brown_puff_and_slash_chestplate", AddonArmorTypes.BROWN_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("brown_puff_and_slash_leggings", AddonArmorTypes.BROWN_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("green_puff_and_slash_chestplate", AddonArmorTypes.GREEN_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("green_puff_and_slash_leggings", AddonArmorTypes.GREEN_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("red_puff_and_slash_chestplate", AddonArmorTypes.RED_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("red_puff_and_slash_leggings", AddonArmorTypes.RED_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("black_puff_and_slash_chestplate", AddonArmorTypes.BLACK_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("black_puff_and_slash_leggings", AddonArmorTypes.BLACK_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_PUFF_AND_SLASH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("white_puff_and_slash_chestplate", AddonArmorTypes.WHITE_PUFF_AND_SLASH, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_PUFF_AND_SLASH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("white_puff_and_slash_leggings", AddonArmorTypes.WHITE_PUFF_AND_SLASH, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xffffff);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PUFF_AND_SLASH_BOOTS = INSTANCE.addMedievalArmorItem("puff_and_slash_boots", AddonArmorTypes.PUFF_AND_SLASH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SCALE_HELMET = INSTANCE.addMedievalArmorItem("scale_helmet", AddonArmorTypes.SCALE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CONDOTTIERO_CAP = INSTANCE.addDyeableMedievalArmorItem("condottiero_cap", AddonArmorTypes.CONDOTTIERO_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xff0000);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SUGARLOAF_HELMET = INSTANCE.addMedievalArmorItem("sugarloaf_helmet", AddonArmorTypes.SUGARLOAF_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_SUGARLOAF_HELMET = INSTANCE.addMedievalArmorItem("gilded_sugarloaf_helmet", AddonArmorTypes.GILDED_SUGARLOAF_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PATRICIAN_TUHER_HELMET = INSTANCE.addMedievalArmorItem("patrician_tuher_helmet", AddonArmorTypes.PATRICIAN_TUHER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_KETTLEHAT = INSTANCE.addMedievalArmorItem("late_kettlehat", AddonArmorTypes.LATE_KETTLEHAT, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CLOSE_HELMET = INSTANCE.addMedievalArmorItem("close_helmet", AddonArmorTypes.CLOSE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EXQUISITE_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("exquisite_maximilian_helmet", AddonArmorTypes.EXQUISITE_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PROTO_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("proto_maximilian_chestplate", AddonArmorTypes.PROTO_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PROTO_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("proto_maximilian_boots", AddonArmorTypes.PROTO_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_PROTO_MAXIMILIAN_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("dark_proto_maximilian_chestplate", AddonArmorTypes.DARK_PROTO_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xff0000);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_PROTO_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("dark_proto_maximilian_boots", AddonArmorTypes.DARK_PROTO_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_BRIGANDINE_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("heavy_brigandine_chestplate", AddonArmorTypes.HEAVY_BRIGANDINE, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xa06540);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_BRIGANDINE_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("heavy_brigandine_leggings", AddonArmorTypes.HEAVY_BRIGANDINE, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xa06540);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_BRIGANDINE_BOOTS = INSTANCE.addMedievalArmorItem("heavy_brigandine_boots", AddonArmorTypes.HEAVY_BRIGANDINE, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HEAVY_BRIGANDINE_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("gilded_heavy_brigandine_chestplate", AddonArmorTypes.GILDED_HEAVY_BRIGANDINE, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xa06540);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HEAVY_BRIGANDINE_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("gilded_heavy_brigandine_leggings", AddonArmorTypes.GILDED_HEAVY_BRIGANDINE, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xa06540);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HEAVY_BRIGANDINE_BOOTS = INSTANCE.addMedievalArmorItem("gilded_heavy_brigandine_boots", AddonArmorTypes.GILDED_HEAVY_BRIGANDINE, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_BRIGANDINE_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("dark_heavy_brigandine_chestplate", AddonArmorTypes.DARK_HEAVY_BRIGANDINE, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0x3a2818);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_BRIGANDINE_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("dark_heavy_brigandine_leggings", AddonArmorTypes.DARK_HEAVY_BRIGANDINE, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0x3a2818);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_BRIGANDINE_BOOTS = INSTANCE.addMedievalArmorItem("dark_heavy_brigandine_boots", AddonArmorTypes.DARK_HEAVY_BRIGANDINE, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CABASSET = INSTANCE.addMedievalArmorItem("cabasset", AddonArmorTypes.CABASSET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_CABASSET = INSTANCE.addMedievalArmorItem("gilded_cabasset", AddonArmorTypes.GILDED_CABASSET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EARLY_CABASSET = INSTANCE.addMedievalArmorItem("early_cabasset", AddonArmorTypes.EARLY_CABASSET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_EARLY_CABASSET = INSTANCE.addMedievalArmorItem("dark_early_cabasset", AddonArmorTypes.DARK_EARLY_CABASSET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_EARLY_CABASSET = INSTANCE.addMedievalArmorItem("gilded_early_cabasset", AddonArmorTypes.GILDED_EARLY_CABASSET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STRAW_HAT = INSTANCE.addMedievalArmorItem("straw_hat", AddonArmorTypes.STRAW_HAT, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FANCY_HAT = INSTANCE.addDyeableMedievalArmorItem("fancy_hat", AddonArmorTypes.FANCY_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0x993333);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TUNIC = INSTANCE.addDyeableMedievalArmorItem("tunic", AddonArmorTypes.TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xBEAE8d);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> TUNIC_BOOTS = INSTANCE.addDyeableMedievalArmorItem("tunic_boots", AddonArmorTypes.TUNIC, ArmorItem.Type.BOOTS, new Item.Properties(), 0xBEAE8d);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EMBOSED_PARADE_BURGONET = INSTANCE.addMedievalArmorItem("embosed_parade_burgonet", AddonArmorTypes.EMBOSED_PARADE_BURGONET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EMBOSED_PARADE_CHESTPLATE = INSTANCE.addMedievalArmorItem("embosed_parade_chestplate", AddonArmorTypes.EMBOSED_PARADE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> EMBOSED_PARADE_BOOTS = INSTANCE.addMedievalArmorItem("embosed_parade_boots", AddonArmorTypes.EMBOSED_PARADE, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_PARADE_BURGONET = INSTANCE.addMedievalArmorItem("dark_gilded_parade_burgonet", AddonArmorTypes.DARK_GILDED_PARADE_BURGONET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_PARADE_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_gilded_parade_chestplate", AddonArmorTypes.DARK_GILDED_PARADE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_PARADE_BOOTS = INSTANCE.addMedievalArmorItem("dark_gilded_parade_boots", AddonArmorTypes.DARK_GILDED_PARADE, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DOUBLET = INSTANCE.addDyeableMedievalArmorItem("doublet", AddonArmorTypes.DOUBLET, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xffffff);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SHOES = INSTANCE.addMedievalArmorItem("shoes", AddonArmorTypes.DOUBLET, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ARTICULATED_CHESTPLATE = INSTANCE.addMedievalArmorItem("articulated_chestplate", AddonArmorTypes.ARTICULATED, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CUMAN_HELMET = INSTANCE.addMedievalArmorItem("cuman_helmet", AddonArmorTypes.CUMAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("darkblued_gothic_chestplate", AddonArmorTypes.DARKBLUED_GOTHIC, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("darkblued_gothic_leggings", AddonArmorTypes.DARKBLUED_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("darkblued_gothic_boots", AddonArmorTypes.DARKBLUED_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("darkblued_greenwich_armet", AddonArmorTypes.DARKBLUED_GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("darkblued_greenwich_chestplate", AddonArmorTypes.DARKBLUED_GREENWICH, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("darkblued_kastenbrust_chestplate", AddonArmorTypes.DARKBLUED_KASTENBRUST, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("darkblued_kastenbrust_leggings", AddonArmorTypes.DARKBLUED_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("darkblued_kastenbrust_boots", AddonArmorTypes.DARKBLUED_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_ARMET = INSTANCE.addKnightItem("darkblued_armet", AddonArmorTypes.DARKBLUED_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("darkblued_knight_chestplate", AddonArmorTypes.DARKBLUED_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("darkblued_knight_leggings", AddonArmorTypes.DARKBLUED_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("darkblued_knight_boots", AddonArmorTypes.DARKBLUED_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("darkblued_maximilian_helmet", AddonArmorTypes.DARKBLUED_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("darkblued_maximilian_chestplate", AddonArmorTypes.DARKBLUED_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("darkblued_maximilian_leggings", AddonArmorTypes.DARKBLUED_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("darkblued_maximilian_boots", AddonArmorTypes.DARKBLUED_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARKBLUED_SALLET = INSTANCE.addMedievalArmorItem("darkblued_sallet", AddonArmorTypes.DARKBLUED_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ENGRAVED_CLOSE_HELMET = INSTANCE.addMedievalArmorItem("engraved_close_helmet", AddonArmorTypes.ENGRAVED_CLOSE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ENGRAVED_CHESTPLATE = INSTANCE.addMedievalArmorItem("engraved_chestplate", AddonArmorTypes.ENGRAVED, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FOX_GROTESQUE_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("fox_grotesque_maximilian_helmet", AddonArmorTypes.FOX_GROTESQUE_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_ARMET = INSTANCE.addKnightItem("fully_gilded_armet", AddonArmorTypes.FULLY_GILDED_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_ARTICULATED_CHESTPLATE = INSTANCE.addMedievalArmorItem("fully_gilded_articulated_chestplate", AddonArmorTypes.FULLY_GILDED_ARTICULATED, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("fully_gilded_gothic_chestplate", AddonArmorTypes.FULLY_GILDED_GOTHIC, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("fully_gilded_gothic_leggings", AddonArmorTypes.FULLY_GILDED_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("fully_gilded_gothic_boots", AddonArmorTypes.FULLY_GILDED_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GRAND_BASCINET = INSTANCE.addMedievalArmorItem("fully_gilded_grand_bascinet", AddonArmorTypes.FULLY_GILDED_GRAND_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("fully_gilded_greenwich_armet", AddonArmorTypes.FULLY_GILDED_GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("fully_gilded_greenwich_chestplate", AddonArmorTypes.FULLY_GILDED_GREENWICH, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GREENWICH_BOOTS = INSTANCE.addMedievalArmorItem("fully_gilded_greenwich_boots", AddonArmorTypes.FULLY_GILDED_GREENWICH, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_GRILLED_HELMET = INSTANCE.addMedievalArmorItem("fully_gilded_grilled_helmet", AddonArmorTypes.FULLY_GILDED_GRILLED_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_JOUSTING_HELMET = INSTANCE.addJoustingItem("fully_gilded_jousting_helmet", AddonArmorTypes.FULLY_GILDED_JOUSTING_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_JOUSTING_CHESTPLATE = INSTANCE.addJoustingItem("fully_gilded_jousting_chestplate", AddonArmorTypes.FULLY_GILDED_JOUSTING, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_JOUSTING_LEGGINGS = INSTANCE.addJoustingItem("fully_gilded_jousting_leggings", AddonArmorTypes.FULLY_GILDED_JOUSTING, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_JOUSTING_BOOTS = INSTANCE.addJoustingItem("fully_gilded_jousting_boots", AddonArmorTypes.FULLY_GILDED_JOUSTING, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("fully_gilded_kastenbrust_chestplate", AddonArmorTypes.FULLY_GILDED_KASTENBRUST, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("fully_gilded_kastenbrust_leggings", AddonArmorTypes.FULLY_GILDED_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("fully_gilded_kastenbrust_boots", AddonArmorTypes.FULLY_GILDED_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("fully_gilded_knight_chestplate", AddonArmorTypes.FULLY_GILDED_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("fully_gilded_knight_leggings", AddonArmorTypes.FULLY_GILDED_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("fully_gilded_knight_boots", AddonArmorTypes.FULLY_GILDED_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("fully_gilded_maximilian_helmet", AddonArmorTypes.FULLY_GILDED_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("fully_gilded_maximilian_chestplate", AddonArmorTypes.FULLY_GILDED_MAXIMILIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("fully_gilded_maximilian_leggings", AddonArmorTypes.FULLY_GILDED_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("fully_gilded_maximilian_boots", AddonArmorTypes.FULLY_GILDED_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_MILANESE_ARMET = INSTANCE.addMedievalArmorItem("fully_gilded_milanese_armet", AddonArmorTypes.FULLY_GILDED_MILANESE_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FULLY_GILDED_SALLET = INSTANCE.addMedievalArmorItem("fully_gilded_sallet", AddonArmorTypes.FULLY_GILDED_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_CHAINMAIL_COIF = INSTANCE.addMedievalArmorItem("gilded_chainmail_coif", AddonArmorTypes.GILDED_CHAINMAIL, ArmorItem.Type.HELMET, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_CHAINMAIL_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_chainmail_chestplate", AddonArmorTypes.GILDED_CHAINMAIL, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_CHAINMAIL_LEGGINGS = INSTANCE.addMedievalArmorItem("gilded_chainmail_leggings", AddonArmorTypes.GILDED_CHAINMAIL, ArmorItem.Type.LEGGINGS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_CLOSE_HELMET = INSTANCE.addMedievalArmorItem("gilded_close_helmet", AddonArmorTypes.GILDED_CLOSE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARKBLUED_GREENWICH_ARMET = INSTANCE.addMedievalArmorItem("gilded_darkblued_greenwich_armet", AddonArmorTypes.GILDED_DARKBLUED_GREENWICH_ARMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARKBLUED_GREENWICH_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_darkblued_greenwich_chestplate", AddonArmorTypes.GILDED_DARKBLUED_GREENWICH_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARKBLUED_GREENWICH_BOOTS = INSTANCE.addMedievalArmorItem("gilded_darkblued_greenwich_boots", AddonArmorTypes.GILDED_DARKBLUED_GREENWICH_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_CLOSE_HELMET = INSTANCE.addMedievalArmorItem("gilded_dark_close_helmet", AddonArmorTypes.GILDED_DARK_CLOSE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_FOX_GROTESQUE_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("gilded_fox_grotesque_maximilian_helmet", AddonArmorTypes.GILDED_FOX_GROTESQUE_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GRILLED_HELMET = INSTANCE.addMedievalArmorItem("gilded_grilled_helmet", AddonArmorTypes.GILDED_GRILLED_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GRILLED_HELMET = INSTANCE.addMedievalArmorItem("grilled_helmet", AddonArmorTypes.GRILLED_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LION_HELMET = INSTANCE.addMedievalArmorItem("lion_helmet", AddonArmorTypes.LION_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MAMLUK_HELMET = INSTANCE.addMedievalArmorItem("mamluk_helmet", AddonArmorTypes.MAMLUK_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> MAXIMILIAN_BURGONET = INSTANCE.addMedievalArmorItem("maximilian_burgonet", AddonArmorTypes.MAXIMILIAN_BURGONET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> OPENED_SALLET = INSTANCE.addMedievalArmorItem("opened_sallet", AddonArmorTypes.OPENED_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SPLINT_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("splint_chestplate", AddonArmorTypes.SPLINT, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xa06540);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SPLINT_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("splint_leggings", AddonArmorTypes.SPLINT, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xa06540);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SPLINT_BOOTS = INSTANCE.addDyeableMedievalArmorItem("splint_boots", AddonArmorTypes.SPLINT, ArmorItem.Type.BOOTS, new Item.Properties(), 0xa06540);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TILTED_PUFF_AND_SLASH_HAT = INSTANCE.addDyeableMedievalArmorItem("tilted_puff_and_slash_hat", AddonArmorTypes.TILTED_PUFF_AND_SLASH_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0x900000);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ALLA_TEDESCA_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("alla_tedesca_chestplate", AddonArmorTypes.ALLA_TEDESCA, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0x900000);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> ALLA_TEDESCA_BOOTS = INSTANCE.addDyeableMedievalArmorItem("alla_tedesca_boots", AddonArmorTypes.ALLA_TEDESCA, ArmorItem.Type.BOOTS, new Item.Properties(), 0x900000);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PEASCOD_CHESTPLATE = INSTANCE.addMedievalArmorItem("peascod_chestplate", AddonArmorTypes.PEASCOD, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_PEASCOD_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_peascod_chestplate", AddonArmorTypes.GILDED_PEASCOD, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_PEASCOD_CHESTPLATE = INSTANCE.addMedievalArmorItem("dark_peascod_chestplate", AddonArmorTypes.DARK_PEASCOD, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_PEASCOD_CHESTPLATE = INSTANCE.addMedievalArmorItem("gilded_dark_peascod_chestplate", AddonArmorTypes.GILDED_DARK_PEASCOD, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TWO_EYE_SLITS_SALLET = INSTANCE.addMedievalArmorItem("two_eye_slits_sallet", AddonArmorTypes.TWO_EYE_SLITS_SALLET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SALLET_WITHOUT_VISOR = INSTANCE.addMedievalArmorItem("sallet_without_visor", AddonArmorTypes.SALLET_WITHOUT_VISOR, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GERMAN_BASCINET = INSTANCE.addMedievalArmorItem("german_bascinet", AddonArmorTypes.GERMAN_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_CUMAN_HELMET = INSTANCE.addMedievalArmorItem("light_cuman_helmet", AddonArmorTypes.LIGHT_CUMAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());


	// Horse armor
	public static final @Nullable RegistrySupplier<MedievalHorseArmorItem> DARK_BARDING = INSTANCE.items.register("dark_barding", () -> new MedievalHorseArmorItem(12, new ResourceLocation(EpicKnightsAddon.ID, "textures/entity/horse/armor/dark_barding.png"), new Item.Properties().stacksTo(1)));


	// Decoration
	public static final RegistrySupplier<ArmorDecorationItem> GOLDEN_PINCE_NEZ_DECORATION = INSTANCE.addArmorDecorationItem("golden_pince_nez_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "golden_pince_nez"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> STEEL_MUSTACHE_DECORATION = INSTANCE.addArmorDecorationItem("steel_mustache_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "steel_mustache"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> STEEL_SKIRT_DECORATION = INSTANCE.addArmorDecorationItem("steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "steel_skirt"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_STEEL_SKIRT_DECORATION = INSTANCE.addArmorDecorationItem("gilded_steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_steel_skirt"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_STEEL_SKIRT_DECORATION = INSTANCE.addArmorDecorationItem("dark_steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_steel_skirt"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_DARK_STEEL_SKIRT_DECORATION = INSTANCE.addArmorDecorationItem("gilded_dark_steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_dark_steel_skirt"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> HELMET_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "helmet_rondel"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_HELMET_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("gilded_helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_helmet_rondel"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_HELMET_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("dark_helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_helmet_rondel"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_DARK_HELMET_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("gilded_dark_helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_dark_helmet_rondel"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_HEAVY_SHOULDER_PAD_DECORATION = INSTANCE.addArmorDecorationItem("dark_heavy_shoulder_pad_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_heavy_shoulder_pad"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_SHOULDER_PADS_DECORATION = INSTANCE.addArmorDecorationItem("dark_shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_shoulder_pads"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_SHOULDER_PADS_DECORATION = INSTANCE.addArmorDecorationItem("gilded_shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_shoulder_pads"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("dark_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_rondel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("gilded_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_rondel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_DARK_RONDEL_DECORATION = INSTANCE.addArmorDecorationItem("gilded_dark_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_dark_rondel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> CHAINMAIL_HOOD_DECORATION = INSTANCE.addArmorDecorationItem("chainmail_hood_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "chainmail_hood"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> SHOULDER_PADS_DECORATION = INSTANCE.addArmorDecorationItem("shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "shoulder_pads"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> HEAVY_SHOULDER_PAD_DECORATION = INSTANCE.addArmorDecorationItem("heavy_shoulder_pad_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "heavy_shoulder_pad"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GOLDEN_BALL_DECORATION = INSTANCE.addArmorDecorationItem("golden_ball_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "golden_ball"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> GORGET_DECORATION = INSTANCE.addArmorDecorationItem("gorget_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gorget"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ROYAL_PLUME_DECORATION = INSTANCE.addDyeableArmorDecorationItem("royal_plume_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "royal_plume"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HORSE_TAIL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("horse_tail_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "horse_tail"), new Item.Properties(), ArmorItem.Type.HELMET, 0x993333));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LANDSKNECHT_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("landsknecht_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "landsknecht_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HANGING_CLOTH_DECORATION = INSTANCE.addDyeableArmorDecorationItem("hanging_cloth_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "hanging_cloth"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0x993333));
	public static final RegistrySupplier<DyeableArmorDecorationItem> UNDERARMOR_TUNIC_DECORATION = INSTANCE.addDyeableArmorDecorationItem("underarmor_tunic_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "underarmor_tunic"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0x993333));
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_ORANGE_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_orange_hat_decoration", AddonArmorTypes.LANDSKNECHT_ORANGE_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_MAGENTA_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_magenta_hat_decoration", AddonArmorTypes.LANDSKNECHT_MAGENTA_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_LIGHT_BLUE_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_light_blue_hat_decoration", AddonArmorTypes.LANDSKNECHT_LIGHT_BLUE_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_YELLOW_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_yellow_hat_decoration", AddonArmorTypes.LANDSKNECHT_YELLOW_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_LIME_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_lime_hat_decoration", AddonArmorTypes.LANDSKNECHT_LIME_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_PINK_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_pink_hat_decoration", AddonArmorTypes.LANDSKNECHT_PINK_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_GRAY_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_gray_hat_decoration", AddonArmorTypes.LANDSKNECHT_GRAY_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_LIGHT_GRAY_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_light_gray_hat_decoration", AddonArmorTypes.LANDSKNECHT_LIGHT_GRAY_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_CYAN_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_cyan_hat_decoration", AddonArmorTypes.LANDSKNECHT_CYAN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_PURPLE_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_purple_hat_decoration", AddonArmorTypes.LANDSKNECHT_PURPLE_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_BLUE_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_blue_hat_decoration", AddonArmorTypes.LANDSKNECHT_BLUE_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_BROWN_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_brown_hat_decoration", AddonArmorTypes.LANDSKNECHT_BROWN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_GREEN_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_green_hat_decoration", AddonArmorTypes.LANDSKNECHT_GREEN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_RED_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_red_hat_decoration", AddonArmorTypes.LANDSKNECHT_RED_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_BLACK_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_black_hat_decoration", AddonArmorTypes.LANDSKNECHT_BLACK_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_WHITE_HAT_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("landsknecht_white_hat_decoration", AddonArmorTypes.LANDSKNECHT_WHITE_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<ArmorDecorationItem> PLACKART_DECORATION = INSTANCE.addArmorDecorationItem("plackart_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "plackart"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_PLACKART_DECORATION = INSTANCE.addArmorDecorationItem("gilded_plackart_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_plackart"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_PLACKART_DECORATION = INSTANCE.addArmorDecorationItem("dark_plackart_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_plackart"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> ARTICULATED_SHOULDER_DEFENSES_DECORATION = INSTANCE.addArmorDecorationItem("articulated_shoulder_defenses_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "articulated_shoulder_defenses"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> DRAGON_SHOULDER_PADS_DECORATION = INSTANCE.addArmorDecorationItem("dragon_shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dragon_shoulder_pads"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GIORNEA_DECORATION = INSTANCE.addDyeableArmorDecorationItem("giornea_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "giornea"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0x993333));
	public static final RegistrySupplier<DyeableArmorDecorationItem> RAM_HORNS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("ram_horns_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "ram_horns"), new Item.Properties(), ArmorItem.Type.HELMET, 0xc9bc78));
	public static final RegistrySupplier<ArmorDecorationItem> GOOSE_DECORATION = INSTANCE.addArmorDecorationItem("goose_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "goose"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ORANGE_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("orange_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "orange_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> MAGENTA_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("magenta_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "magenta_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LIGHT_BLUE_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("light_blue_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "light_blue_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> YELLOW_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("yellow_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "yellow_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LIME_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("lime_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "lime_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> PINK_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("pink_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "pink_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GRAY_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("gray_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gray_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LIGHT_GRAY_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("light_gray_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "light_gray_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> CYAN_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("cyan_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "cyan_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> PURPLE_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("purple_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "purple_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BLUE_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("blue_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "blue_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BROWN_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("brown_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "brown_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GREEN_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("green_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "green_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> RED_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("red_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "red_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "black_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<DyeableArmorDecorationItem> WHITE_PUFF_AND_SLASH_SLEEVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("white_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "white_puff_and_slash_sleeves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_GORGET_DECORATION = INSTANCE.addArmorDecorationItem("dark_gorget_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_gorget"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_GORGET_DECORATION = INSTANCE.addArmorDecorationItem("gilded_gorget_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_gorget"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> SQUARE_BESAGEWS_DECORATION = INSTANCE.addArmorDecorationItem("square_besagews_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "square_besagews"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> CODPIECE_DECORATION = INSTANCE.addArmorDecorationItem("codpiece_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "codpiece"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<WearableArmorDecorationItem> GOLDEN_NECKLACE_DECORATION = INSTANCE.addWearableArmorDecorationItem("golden_necklace_decoration", AddonArmorTypes.GOLDEN_NECKLACE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> SILVER_NECKLACE_DECORATION = INSTANCE.addWearableArmorDecorationItem("silver_necklace_decoration", AddonArmorTypes.SILVER_NECKLACE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> SILVER_CROSS_NECKLACE_DECORATION = INSTANCE.addWearableArmorDecorationItem("silver_cross_necklace_decoration", AddonArmorTypes.SILVER_CROSS_NECKLACE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<WearableArmorDecorationItem> GOLDEN_CROSS_NECKLACE_DECORATION = INSTANCE.addWearableArmorDecorationItem("golden_cross_necklace_decoration", AddonArmorTypes.GOLDEN_CROSS_NECKLACE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
	public static final RegistrySupplier<ArmorDecorationItem> ARTICULATED_PAULDRONS_DECORATION = INSTANCE.addArmorDecorationItem("articulated_pauldrons_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "articulated_pauldrons"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_CROSS_MEDIEVAL_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_cross_medieval_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "black_cross_medieval_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<ArmorDecorationItem> CHAINMAIL_GLOVES_DECORATION = INSTANCE.addArmorDecorationItem("chainmail_gloves_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "chainmail_gloves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> COMPOSITE_GLOVES_DECORATION = INSTANCE.addArmorDecorationItem("composite_gloves_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "composite_gloves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_CHAINMAIL_GLOVES_DECORATION = INSTANCE.addArmorDecorationItem("gilded_chainmail_gloves_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_chainmail_gloves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_CHAINMAIL_HOOD_DECORATION = INSTANCE.addArmorDecorationItem("gilded_chainmail_hood_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_chainmail_hood"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_RIVITED_GAUNTLETS_DECORATION = INSTANCE.addArmorDecorationItem("gilded_rivited_gauntlets_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_rivited_gauntlets"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LEATHER_GLOVES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("leather_gloves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "leather_gloves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xa06540));
	public static final RegistrySupplier<DyeableArmorDecorationItem> MEDIEVAL_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("medieval_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "medieval_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<ArmorDecorationItem> PLATED_CHAINMAIL_GLOVES_DECORATION = INSTANCE.addArmorDecorationItem("plated_chainmail_gloves_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "plated_chainmail_gloves"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> PUFF_AND_SLASH_ROBE_DECORATION = INSTANCE.addDyeableArmorDecorationItem("puff_and_slash_robe_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "puff_and_slash_robe"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0x900000));
	public static final RegistrySupplier<DyeableArmorDecorationItem> RED_CROSS_MEDIEVAL_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("red_cross_medieval_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "red_cross_medieval_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
	public static final RegistrySupplier<ArmorDecorationItem> RIVITED_GAUNTLETS_DECORATION = INSTANCE.addArmorDecorationItem("rivited_gauntlets_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "rivited_gauntlets"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> WHITE_CROSS_MEDIEVAL_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("white_cross_medieval_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "white_cross_medieval_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0x303030));
	public static final RegistrySupplier<DyeableArmorDecorationItem> FRONTAL_FEATHER_DECORATION = INSTANCE.addDyeableArmorDecorationItem("frontal_feather_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "frontal_feather"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_CODPIECE_DECORATION = INSTANCE.addArmorDecorationItem("dark_codpiece_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_codpiece"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));


	// Shields
	public static final @Nullable RegistrySupplier<MedievalShieldItem> STEEL_DUELING_SHIELD = INSTANCE.addMedievalShieldItem("dueling_shield", "dueling_shield", new Item.Properties(), ModItemTier.STEEL, false, true, AddonShieldTypes.DUELING_SHIELD);


	// Materials
	public static final RegistrySupplier<Item> FULLY_GILDING_TEMPLATE = INSTANCE.addIngredientItem("fully_gilding_template", () -> new SmithingTemplateItem(
			Component.translatable(EpicKnightsAddon.ID + ".fully_gilding_template.applies_to"),
			Component.translatable(EpicKnightsAddon.ID + ".fully_gilding_template.ingredients"),
			Component.translatable(EpicKnightsAddon.ID + ".fully_gilding_template.upgrade_description"),
			Component.translatable(EpicKnightsAddon.ID + ".fully_gilding_template.base_slot_description"),
			Component.translatable(EpicKnightsAddon.ID + ".fully_gilding_template.additions_slot_description"),
			List.of(),
			List.of()));


	public AddonItems()
	{
		super(EpicKnightsAddon.ID);
	}
}

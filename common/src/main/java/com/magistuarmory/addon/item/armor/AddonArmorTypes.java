package com.magistuarmory.addon.item.armor;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.config.ArmorConfig;
import com.magistuarmory.item.armor.ArmorType;
import dev.architectury.platform.Platform;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class AddonArmorTypes
{
	public static final ArmorConfig ARMOR_CONFIG = EpicKnightsAddon.CONFIG.armor;

	public static final ArmorType DARK_KNIGHT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_knight"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_armet"), new ResourceLocation("magistuarmory:armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_STECHHELM = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_stechhelm"), new ResourceLocation("magistuarmory:stechhelm"), 2.0f, 1.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkStechhelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_JOUSTING = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_jousting"), new ResourceLocation("magistuarmory:default"), 2.0f, 1.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkJousting, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_SALLET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_sallet"), new ResourceLocation("magistuarmoryaddon:sallet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GOTHIC = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gothic"), new ResourceLocation("magistuarmory:default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGothic, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_maximilian_helmet"), new ResourceLocation("magistuarmory:maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_MAXIMILIAN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_maximilian"), new ResourceLocation("magistuarmory:default"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GREATHELM = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_greathelm"), new ResourceLocation("magistuarmoryaddon:greathelm"), 0.6f, 0.0f, new Integer[] { 150, 280, 295, 220 }, new Integer[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableDarkGreathelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_CRUSADER = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_crusader"), new ResourceLocation("magistuarmory:default"), 0.6f, 0.0f, new Integer[] { 150, 280, 295, 220 }, new Integer[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableDarkCrusader, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_KASTENBRUST = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_kastenbrust"), new ResourceLocation("magistuarmory:default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkKastenbrust, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GRAND_BASCINET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_grand_bascinet"), new ResourceLocation("magistuarmory:grand_bascinet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGrandBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType SAVOYARD_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "savoyard_helmet"), new ResourceLocation("magistuarmoryaddon:savoyard_helmet"), 1.25f, 0.0f, new Integer[] { 150, 0, 315, 225 }, new Integer[] { 2, 0, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSavoyardHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType MORION = new ArmorType(new ResourceLocation("magistuarmoryaddon", "morion"), new ResourceLocation("magistuarmoryaddon:morion"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 180 }, new Integer[] { 2, 0, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMorion, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType PIKEMAN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "pikeman"), new ResourceLocation("default"), 0.6f, 0.0f, new Integer[] { 170, 0, 365, 180 }, new Integer[] { 2, 0, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enablePikeman, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType MILANESE_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "milanese_armet"), new ResourceLocation("magistuarmoryaddon:milanese_armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMilaneseArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType BRITISH_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "british_armet"), new ResourceLocation("magistuarmoryaddon:british_armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBritishArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType AVANT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "avant"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableAvant, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType VISORED_KETTLEHAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "visored_kettlehat"), new ResourceLocation("magistuarmoryaddon:visored_kettlehat"), 0.6f, 0.0f, new Integer[] { 220, 290, 210, 260 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableVisoredKettlehat, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CERVELLIERE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "cervelliere"), new ResourceLocation("default"), 0.2f, 0.0f, new Integer[] { 180, 290, 315, 170 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCervelliere, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CLOSED_BARBUTE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "closed_barbute"), new ResourceLocation("default"), 1.0f, 0.5f, new Integer[] { 220, 290, 210, 260 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableClosedBarbute, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType BICOQUE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "bicoque"), new ResourceLocation("magistuarmoryaddon:bicoque"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBicoque, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LINEN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "linen"), new ResourceLocation("magistuarmoryaddon:underarmor"), 0.0f, 0.0f, new Integer[] { 150, 200, 250, 200 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLinen, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType SALLET_WITHOUT_NECK_PROTECTION = new ArmorType(new ResourceLocation("magistuarmoryaddon", "sallet_without_neck_protection"), new ResourceLocation("magistuarmoryaddon:sallet_without_neck_protection"), 0.7f, 0.0f, new Integer[] { 230, 315, 335, 245 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSalletWithoutNeckProtection, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType BELLOWS_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "bellows_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:bellows_maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBellowsMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType KULAH_KHUD = new ArmorType(new ResourceLocation("magistuarmoryaddon", "kulah_khud"), new ResourceLocation("magistuarmoryaddon:kulah_khud"), 0.6f, 0.0f, new Integer[] { 150, 315, 200, 170 }, new Integer[] { 2, 0, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKulahKhud, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CUMAN_CAPTAIN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "mirror"), new ResourceLocation("magistuarmoryaddon:kulah_khud"), 0.8f, 0.0f, new Integer[] { 150, 325, 200, 200 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCumanCaptainHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType MIRROR = new ArmorType(new ResourceLocation("magistuarmoryaddon", "mirror"), new ResourceLocation("default"), 0.8f, 0.0f, new Integer[] { 150, 200, 325, 200 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMirror, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType SARACEN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "saracen"), new ResourceLocation("default"), 0.2f, 0.0f, new Integer[] { 200, 200, 270, 190 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSaracen, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType EARLY_GREATHELM = new ArmorType(new ResourceLocation("magistuarmoryaddon", "early_greathelm"), new ResourceLocation("magistuarmoryaddon:early_greathelm"), 0.4f, 0.0f, new Integer[] { 150, 280, 295, 220 }, new Integer[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableEarlyGreathelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType XIII_CENTURY_KNIGHT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "xiii_century_knight"), new ResourceLocation("default"), 0.35f, 0.0f, new Integer[] { 200, 160, 270, 220 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableXiiiCenturyKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType KLAPPVISOR_BASCINET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "klappvisor_bascinet"), new ResourceLocation("magistuarmoryaddon:klappvisor_bascinet"), 1.25f, 0.0f, new Integer[] { 210, 300, 320, 250 }, new Integer[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKlappvisorBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LATE_BASCINET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "late_bascinet"), new ResourceLocation("magistuarmoryaddon:late_bascinet"), 1.25f, 0.0f, new Integer[] { 210, 300, 320, 250 }, new Integer[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLateBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LOBSTER_TAILED_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "lobster_tailed_helmet"), new ResourceLocation("magistuarmoryaddon:lobster_tailed_helmet"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 180 }, new Integer[] { 1, 0, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLobsterTailedHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CHAPEL = new ArmorType(new ResourceLocation("magistuarmoryaddon", "chapel"), new ResourceLocation("magistuarmoryaddon:chapel"), 0.3f, 0.0f, new Integer[] { 0, 0, 0, 220 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableChapel, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CHAINED_GAMBESON = new ArmorType(new ResourceLocation("magistuarmoryaddon", "chained_gambeson"), new ResourceLocation("default"), 0.2f, 0.0f, new Integer[] { 150, 0, 192, 132 }, new Integer[] { 2, 0, 3, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableChainedGambeson, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType TABLET_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "tablet_helmet"), new ResourceLocation("default"), 0.2f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableTabletHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LATE_GREATHELM = new ArmorType(new ResourceLocation("magistuarmoryaddon", "late_greathelm"), new ResourceLocation("magistuarmoryaddon:late_greathelm"), 1.25f, 1.0f, new Integer[] { 0, 0, 0, 300 }, new Integer[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableLateGreathelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType BURGUNDIAN_KETTLEHAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "burgundian_kettlehat"), new ResourceLocation("magistuarmoryaddon:burgundian_kettlehat"), 0.3f, 0.0f, new Integer[] { 0, 0, 0, 230 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableBurgundianKettlehat, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CLOSED_BURGONET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "closed_burgonet"), new ResourceLocation("magistuarmoryaddon:closed_burgonet"), 1.25f, 0.5f, new Integer[] { 0, 0, 0, 275 }, new Integer[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableClosedBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType HEAVY_CUIRASSIER = new ArmorType(new ResourceLocation("magistuarmoryaddon", "heavy_cuirassier"), new ResourceLocation("default"), 1.4f, 0.8f, new Integer[] { 253, 346, 368, 302 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableHeavyCuirassier, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_HEAVY_CUIRASSIER = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_heavy_cuirassier"), new ResourceLocation("default"), 1.4f, 0.8f, new Integer[] { 253, 346, 368, 302 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkHeavyCuirassier, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LIGHT_BURGONET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "light_burgonet"), new ResourceLocation("magistuarmoryaddon:late_burgonet"), 0.5f, 0.0f, new Integer[] { 0, 0, 0, 200 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLightBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LATE_BURGONET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "late_burgonet"), new ResourceLocation("magistuarmoryaddon:late_burgonet"), 0.6f, 0.0f, new Integer[] { 0, 0, 0, 250 }, new Integer[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLateBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DEVILISH_GROTESQUE_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "devilish_grotesque_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:devilish_grotesque_maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 0, 0, 0, 385 }, new Integer[] { 0, 0, 0, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDevilishGrotesqueMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType FACIAL_GROTESQUE_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "facial_grotesque_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:facial_grotesque_maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 0, 0, 0, 385 }, new Integer[] { 0, 0, 0, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableFacialGrotesqueMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GILDED_GREENWICH_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GILDED_GREENWICH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GREENWICH_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GREENWICH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LATE_SALLET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "late_sallet"), new ResourceLocation("magistuarmoryaddon:late_sallet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLateSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_LATE_SALLET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_late_sallet"), new ResourceLocation("magistuarmoryaddon:late_sallet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkLateSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType STEEL_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "steel_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:steel_puff_and_slash"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSteelPuffAndSlash, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_STEEL_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_steel_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:steel_puff_and_slash"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedSteelPuffAndSlash, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType STURMHAUBE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "sturmhaube"), new ResourceLocation("magistuarmoryaddon:sturmhaube"), 0.6f, 0.0f, new Integer[] { 0, 0, 0, 210 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSturmhaube, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType SILVERED_DARK_BELLOWS_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_bellows_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:bellows_maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkBellowsMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType SILVERED_DARK_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_maximilian_helmet"), new ResourceLocation("magistuarmory:maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType SILVERED_DARK_MAXIMILIAN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_maximilian"), new ResourceLocation("default"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_GRAND_BASCINET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_grand_bascinet"), new ResourceLocation("magistuarmory:grand_bascinet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGrandBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CEREMONIAL_KASTENBRUST = new ArmorType(new ResourceLocation("magistuarmoryaddon", "ceremonial_kastenbrust"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCeremonialKastenbrust, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_XIV_CENTURY_KNIGHT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_xivcenturyknight"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 210, 300, 320, 250 }, new Integer[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedXivCenturyKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GALLOWGLASS = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gallowglass"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 170, 235, 250, 205 }, new Integer[] { 1, 4, 5, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableGallowglass, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType ENGLISH_KNIGHT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "english_knight"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEnglishKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_HALF_ARMOR = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_half_armor"), new ResourceLocation("default"), 0.5f, 0.0f, new Integer[] { 180, 290, 315, 170 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedHalfArmor, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_EXQUISITE_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_exquisite_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:exquisite_armet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedExquisiteMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_maximilian_helmet"), new ResourceLocation("magistuarmory:maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_MAXIMILIAN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_maximilian"), new ResourceLocation("default"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType COAT_OF_PLATES = new ArmorType(new ResourceLocation("magistuarmoryaddon", "coat_of_plates"), new ResourceLocation("default"), 0.5f, 0.0f, new Integer[] { 200, 260, 290, 240 }, new Integer[] { 2, 4, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableCoatOfPlates, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType SILVERED_DARK_HALF_ARMOR = new ArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_half_armor"), new ResourceLocation("default"), 0.5f, 0.0f, new Integer[] { 180, 290, 315, 170 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkHalfArmor, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_DARK_SALLET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_dark_sallet"), new ResourceLocation("magistuarmoryaddon:sallet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedDarkSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_DARK_GOTHIC = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_dark_gothic"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedDarkGothic, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_SALLET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_sallet"), new ResourceLocation("magistuarmoryaddon:sallet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_GOTHIC = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_gothic"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGothic, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_GREENWICH_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_GREENWICH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GREENWICH_ARMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GREENWICH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LANDSKNECHT_ORANGE_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_orange_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtOrangeHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_MAGENTA_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_magenta_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtMagentaHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_LIGHT_BLUE_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_light_blue_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtLightBlueHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_YELLOW_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_yellow_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtYellowHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_LIME_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_lime_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtLimeHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_PINK_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_pink_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtPinkHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_GRAY_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_gray_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtGrayHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_LIGHT_GRAY_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_light_gray_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtLightGrayHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_CYAN_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_cyan_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtCyanHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_PURPLE_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_purple_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtPurpleHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_BLUE_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_blue_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtBlueHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_BROWN_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_brown_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtBrownHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_GREEN_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_green_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtGreenHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_RED_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_red_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtRedHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_BLACK_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_black_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtBlackHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LANDSKNECHT_WHITE_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_white_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtWhiteHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType ORANGE_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "orange_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableOrangePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType MAGENTA_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "magenta_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableMagentaPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LIGHT_BLUE_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "light_blue_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLightBluePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType YELLOW_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "yellow_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableYellowPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LIME_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "lime_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLimePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType PINK_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "pink_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePinkPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType GRAY_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gray_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGrayPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType LIGHT_GRAY_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "light_gray_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLightGrayPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType CYAN_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "cyan_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCyanPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType PURPLE_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "purple_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePurplePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType BLUE_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "blue_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBluePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType BROWN_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "brown_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBrownPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType GREEN_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "green_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGreenPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType RED_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "red_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableRedPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType BLACK_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "black_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBlackPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType WHITE_PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "white_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableWhitePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType PUFF_AND_SLASH = new ArmorType(new ResourceLocation("magistuarmoryaddon", "puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePuffAndSlash, () -> Ingredient.of(Items.LEATHER));

	public static final ArmorType SCALE_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "scale_helmet"), new ResourceLocation("default"), 0.2f, 0.0f, new Integer[] { 170, 290, 300, 160 }, new Integer[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableScaleHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CONDOTTIERO_CAP = new ArmorType(new ResourceLocation("magistuarmoryaddon", "condottiero_cap"), new ResourceLocation("magistuarmoryaddon:condottiero_cap"), 0.0f, 0.0f, new Integer[] { 120, 100, 140, 120 }, new Integer[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCondottieroCap, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType SUGARLOAF_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "sugarloaf_helmet"), new ResourceLocation("magistuarmoryaddon:greathelm"), 0.6f, 0.0f, new Integer[] { 150, 280, 295, 220 }, new Integer[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableSugarloafHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_SUGARLOAF_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_sugarloaf_helmet"), new ResourceLocation("magistuarmoryaddon:greathelm"), 0.6f, 0.0f, new Integer[] { 150, 280, 295, 220 }, new Integer[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableGildedSugarloafHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType PATRICIAN_TUHER_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "patrician_tuher_helmet"), new ResourceLocation("magistuarmoryaddon:patrician_tuher_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enablePatricianTuherHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType LATE_KETTLEHAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "late_kettlehat"), new ResourceLocation("magistuarmoryaddon:late_kettlehat"), 0.3f, 0.0f, new Integer[] { 0, 0, 0, 220 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableLateKettlehat, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CLOSE_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "close_helmet"), new ResourceLocation("magistuarmoryaddon:close_helmet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCloseHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType EXQUISITE_MAXIMILIAN_HELMET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "exquisite_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:exquisite_maximilian_helmet"), 1.8f, 0.5f, new Integer[] { 345, 500, 440, 385 }, new Integer[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableExquisiteMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType PROTO_MAXIMILIAN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "proto_maximilian"), new ResourceLocation("default"), 1.5f, 0.5f, new Integer[] { 276, 400, 352, 308 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableProtoMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_PROTO_MAXIMILIAN = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_proto_maximilian"), new ResourceLocation("default"), 1.5f, 0.5f, new Integer[] { 276, 400, 352, 308 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkProtoMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType HEAVY_BRIGANDINE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "heavy_brigandine"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableHeavyBrigandine, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_HEAVY_BRIGANDINE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_heavy_brigandine"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedHeavyBrigandine, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_HEAVY_BRIGANDINE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_heavy_brigandine"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 275 }, new Integer[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkHeavyBrigandine, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType CABASSET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "cabasset"), new ResourceLocation("magistuarmoryaddon:cabasset"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 200 }, new Integer[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_CABASSET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_cabasset"), new ResourceLocation("magistuarmoryaddon:cabasset"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 200 }, new Integer[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType EARLY_CABASSET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "early_cabasset"), new ResourceLocation("magistuarmoryaddon:early_cabasset"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 200 }, new Integer[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEarlyCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_EARLY_CABASSET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_early_cabasset"), new ResourceLocation("magistuarmoryaddon:early_cabasset"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 200 }, new Integer[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkEarlyCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType GILDED_EARLY_CABASSET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_early_cabasset"), new ResourceLocation("magistuarmoryaddon:early_cabasset"), 0.6f, 0.0f, new Integer[] { 150, 0, 315, 200 }, new Integer[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedEarlyCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType STRAW_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "straw_hat"), new ResourceLocation("magistuarmoryaddon:straw_hat"), 0.0f, 0.0f, new Integer[] { 90, 90, 120, 90 }, new Integer[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableStrawHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType FANCY_HAT = new ArmorType(new ResourceLocation("magistuarmoryaddon", "fancy_hat"), new ResourceLocation("magistuarmoryaddon:fancy_hat"), 0.0f, 0.0f, new Integer[] { 90, 90, 120, 100 }, new Integer[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableFancyHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType TUNIC = new ArmorType(new ResourceLocation("magistuarmoryaddon", "tunic"), new ResourceLocation("magistuarmoryaddon:tunic"), 0.0f, 0.0f, new Integer[] { 90, 90, 120, 100 }, new Integer[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableTunic, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType EMBOSED_PARADE_BURGONET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "embosed_parade_burgonet"), new ResourceLocation("magistuarmoryaddon:parade_burgonet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 260 }, new Integer[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEmbosedParadeBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType EMBOSED_PARADE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "embosed_parade"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 260 }, new Integer[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEmbosedParade, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GILDED_PARADE_BURGONET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_parade_burgonet"), new ResourceLocation("magistuarmoryaddon:parade_burgonet"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 260 }, new Integer[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedParadeBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final ArmorType DARK_GILDED_PARADE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_parade"), new ResourceLocation("default"), 1.25f, 0.5f, new Integer[] { 230, 315, 335, 260 }, new Integer[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedParade, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
	
	public static final ArmorType DOUBLET = new ArmorType(new ResourceLocation("magistuarmoryaddon", "doublet"), new ResourceLocation("default"), 0.0f, 0.0f, new Integer[] { 90, 90, 120, 100 }, new Integer[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableDoublet, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final ArmorType GOLDEN_NECKLACE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "golden_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new Integer[] { 100, 100, 100, 100 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/gold" : "c:gold_ingots");

	public static final ArmorType SILVER_NECKLACE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "silver_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new Integer[] { 100, 100, 100, 100 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/gold" : "c:gold_ingots");

	public static final ArmorType SILVER_CROSS_NECKLACE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "silver_cross_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new Integer[] { 100, 100, 100, 100 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/silver" : "c:silver_ingots");

	public static final ArmorType GOLDEN_CROSS_NECKLACE = new ArmorType(new ResourceLocation("magistuarmoryaddon", "golden_cross_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new Integer[] { 100, 100, 100, 100 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/silver" : "c:silver_ingots");

}

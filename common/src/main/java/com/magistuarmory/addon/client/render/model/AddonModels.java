package com.magistuarmory.addon.client.render.model;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.client.render.model.armor.*;
import com.magistuarmory.addon.client.render.model.decoration.*;
import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.decoration.RondelModel;
import com.magistuarmory.client.render.model.decoration.TopDecorationModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;

public class AddonModels extends ModModelsProvider
{
	public static AddonModels INSTANCE = new AddonModels(EpicKnightsAddon.ID);

	public static final LayerDefinition LANDSKNECHT_HAT = LandsknechtHatModel.createLayer();
	public static final LayerDefinition SHOULDER_PADS = ShoulderPadsModel.createLayer();
	public static final LayerDefinition HEAVY_SHOULDER_PAD = HeavyShoulderPadModel.createLayer();
	public static final LayerDefinition RONDEL = RondelModel.createLayer();
	public static final LayerDefinition SKIRT = SkirtModel.createLayer();
	public static final LayerDefinition HELMET_RONDEL = HelmetRondelModel.createLayer();

	public static final ModelLayerLocation MORION_LOCATION = INSTANCE.addArmorModel("morion", MorionModel::createLayer);
	public static final ModelLayerLocation BICOQUE_LOCATION = INSTANCE.addArmorModel("bicoque", BicoqueModel::createLayer);
	public static final ModelLayerLocation MILANESE_ARMET_LOCATION = INSTANCE.addArmorModel("milanese_armet", MilaneseArmetModel::createLayer);
	public static final ModelLayerLocation VISORED_KETTLEHAT_LOCATION = INSTANCE.addArmorModel("visored_kettlehat", VisoredKettlehatModel::createLayer);
	public static final ModelLayerLocation LANDSKNECHT_HAT_LOCATION = INSTANCE.addArmorModel("landsknecht_hat", LandsknechtHatModel::createLayer);
	public static final ModelLayerLocation PUFF_AND_SLASH_LOCATION = INSTANCE.addArmorModel("puff_and_slash", PuffAndSlashModel::createLayer);
	public static final ModelLayerLocation UNDERARMOR_LOCATION = INSTANCE.addArmorModel("underarmor", UnderarmorModel::createLayer);
	public static final ModelLayerLocation SALLET_WITHOUT_NECK_PROTECTION_LOCATION = INSTANCE.addArmorModel("sallet_without_neck_protection", SalletWithoutNeckProtectionModel::createLayer);
	public static final ModelLayerLocation BELLOWS_MAXIMILIAN_HELMET_LOCATION = INSTANCE.addArmorModel("bellows_maximilian_helmet", BellowsMaximilianHelmetModel::createLayer);
	public static final ModelLayerLocation SAVOYARD_HELMET_LOCATION = INSTANCE.addArmorModel("savoyard_helmet", SavoyardHelmetModel::createLayer);
	public static final ModelLayerLocation OPENED_SALLET_LOCATION = INSTANCE.addArmorModel("opened_sallet", OpenedSalletModel::createLayer);
	public static final ModelLayerLocation BRITISH_ARMET_LOCATION = INSTANCE.addArmorModel("british_armet", BritishArmetModel::createLayer);
	public static final ModelLayerLocation KULAH_KHUD_LOCATION = INSTANCE.addArmorModel("kulah_khud", KulahKhudModel::createLayer);
	public static final ModelLayerLocation SALLET_LOCATION = INSTANCE.addArmorModel("sallet", SalletModel::createLayer);
	public static final ModelLayerLocation KLAPPVISOR_BASCINET_LOCATION = INSTANCE.addArmorModel("klappvisor_bascinet", KlappvisorBascinetModel::createLayer);
	public static final ModelLayerLocation LATE_BASCINET_LOCATION = INSTANCE.addArmorModel("late_bascinet", LateBascinetModel::createLayer);
	public static final ModelLayerLocation EARLY_GREATHELM_LOCATION = INSTANCE.addArmorModel("early_greathelm", EarlyGreathelmModel::createLayer);
	public static final ModelLayerLocation LOBSTER_TAILED_HELMET_LOCATION = INSTANCE.addArmorModel("lobster_tailed_helmet", LobsterTailedHelmetModel::createLayer);

	public static final ModelLayerLocation CHAPEL_LOCATION = INSTANCE.addArmorModel("chapel", ChapelModel::createLayer);
	public static final ModelLayerLocation LATE_GREATHELM_LOCATION = INSTANCE.addArmorModel("late_greathelm", LateGreathelmModel::createLayer);
	public static final ModelLayerLocation BURGUNDIAN_KETTLEHAT_LAYER = INSTANCE.addArmorModel("burgundian_kettlehat", BurgundianKettlehatModel::createLayer);
	public static final ModelLayerLocation CLOSED_BURGONET_LAYER = INSTANCE.addArmorModel("closed_burgonet", ClosedBurgonetModel::createLayer);
	public static final ModelLayerLocation DEVILISH_GROTESQUE_MAXIMILIAN_HELMET_LAYER = INSTANCE.addArmorModel("devilish_grotesque_maximilian_helmet", DevilishGrotesqueMaximilianHelmetModel::createLayer);
	public static final ModelLayerLocation FACIAL_GROTESQUE_MAXIMILIAN_HELMET_LAYER = INSTANCE.addArmorModel("facial_grotesque_maximilian_helmet", FacialGrotesqueMaximilianHelmetModel::createLayer);
	public static final ModelLayerLocation GREENWICH_ARMET_LAYER = INSTANCE.addArmorModel("greenwich_armet", GreenwichArmetModel::createLayer);
	public static final ModelLayerLocation LATE_BURGONET_LAYER = INSTANCE.addArmorModel("late_burgonet", LateBurgonetModel::createLayer);
	public static final ModelLayerLocation LATE_SALLET_LAYER = INSTANCE.addArmorModel("late_sallet", LateSalletModel::createLayer);
	public static final ModelLayerLocation STEEL_PUFF_AND_SLASH_LAYER = INSTANCE.addArmorModel("steel_puff_and_slash", SteelPuffAndSlashModel::createLayer);
	public static final ModelLayerLocation STURMHAUBE_LAYER = INSTANCE.addArmorModel("sturmhaube", SturmhaubeModel::createLayer);
	public static final ModelLayerLocation EXQUISITE_ARMET_LAYER = INSTANCE.addArmorModel("exquisite_armet", ExquisiteArmetModel::createLayer);

	public static final ModelLayerLocation SHOULDER_PADS_LOCATION = INSTANCE.addDecorationModel("shoulder_pads", () -> SHOULDER_PADS);
	public static final ModelLayerLocation HEAVY_SHOULDER_PAD_LOCATION = INSTANCE.addDecorationModel("heavy_shoulder_pad", () -> HEAVY_SHOULDER_PAD);
	public static final ModelLayerLocation DARK_SHOULDER_PADS_LOCATION = INSTANCE.addDecorationModel("dark_shoulder_pads", () -> SHOULDER_PADS);
	public static final ModelLayerLocation GILDED_SHOULDER_PADS_LOCATION = INSTANCE.addDecorationModel("gilded_shoulder_pads", () -> SHOULDER_PADS);
	public static final ModelLayerLocation DARK_HEAVY_SHOULDER_PAD_LOCATION = INSTANCE.addDecorationModel("dark_heavy_shoulder_pad", () -> HEAVY_SHOULDER_PAD);
	public static final ModelLayerLocation DARK_RONDEL_LOCATION = INSTANCE.addDecorationModel("dark_rondel", () -> RONDEL);
	public static final ModelLayerLocation GILDED_RONDEL_LOCATION = INSTANCE.addDecorationModel("gilded_rondel", () -> RONDEL);
	public static final ModelLayerLocation GILDED_DARK_RONDEL_LOCATION = INSTANCE.addDecorationModel("gilded_dark_rondel", () -> RONDEL);
	public static final ModelLayerLocation ROYAL_PLUME_LOCATION = INSTANCE.addDecorationModel("royal_plume", RoyalPlumeModel::createLayer);
	public static final ModelLayerLocation GOLDEN_PINCE_NEZ_LOCATION = INSTANCE.addDecorationModel("golden_pince_nez", PinceNezModel::createLayer);
	public static final ModelLayerLocation STEEL_MUSTACHE_LOCATION = INSTANCE.addDecorationModel("steel_mustache", MustacheModel::createLayer);
	public static final ModelLayerLocation STEEL_SKIRT_LOCATION = INSTANCE.addDecorationModel("steel_skirt", () -> SKIRT);
	public static final ModelLayerLocation GILDED_STEEL_SKIRT_LOCATION = INSTANCE.addDecorationModel("gilded_steel_skirt", () -> SKIRT);
	public static final ModelLayerLocation DARK_STEEL_SKIRT_LOCATION = INSTANCE.addDecorationModel("dark_steel_skirt", () -> SKIRT);
	public static final ModelLayerLocation GILDED_DARK_STEEL_SKIRT_LOCATION = INSTANCE.addDecorationModel("gilded_dark_steel_skirt", () -> SKIRT);
	public static final ModelLayerLocation HELMET_RONDEL_LOCATION = INSTANCE.addDecorationModel("helmet_rondel", () -> HELMET_RONDEL);
	public static final ModelLayerLocation GILDED_HELMET_RONDEL_LOCATION = INSTANCE.addDecorationModel("gilded_helmet_rondel", () -> HELMET_RONDEL);
	public static final ModelLayerLocation DARK_HELMET_RONDEL_LOCATION = INSTANCE.addDecorationModel("dark_helmet_rondel", () -> HELMET_RONDEL);
	public static final ModelLayerLocation GILDED_DARK_HELMET_RONDEL_LOCATION = INSTANCE.addDecorationModel("gilded_dark_helmet_rondel", () -> HELMET_RONDEL);
	public static final ModelLayerLocation GOLDEN_NECKLACE_LOCATION = INSTANCE.addDecorationModel("golden_necklace", NecklaceModel::createLayer);
	public static final ModelLayerLocation CHAINMAIL_HOOD_LOCATION = INSTANCE.addDecorationModel("chainmail_hood", HoodModel::createLayer);
	public static final ModelLayerLocation GOLDEN_BALL_LOCATION = INSTANCE.addDecorationModel("golden_ball", TopDecorationModel::createLayer);
	public static final ModelLayerLocation GORGET_LOCATION = INSTANCE.addDecorationModel("gorget", GorgetModel::createLayer);
	public static final ModelLayerLocation HORSE_TAIL_LOCATION = INSTANCE.addDecorationModel("horse_tail", HorseTailDecorationModel::createLayer);
	public static final ModelLayerLocation LANDSKNECHT_FEATHERS_LOCATION = INSTANCE.addDecorationModel("landsknecht_feathers", LandsknechtFeathersModel::createLayer);
	public static final ModelLayerLocation HANGING_CLOTH_LOCATION = INSTANCE.addDecorationModel("hanging_cloth", HangingClothModel::createLayer);
	public static final ModelLayerLocation UNDERARMOR_TUNIC_LOCATION = INSTANCE.addDecorationModel("underarmor_tunic", UnderarmorTunicModel::createLayer);
	public static final ModelLayerLocation LANDSKNECHT_ORANGE_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_orange_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_MAGENTA_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_magenta_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_LIGHT_BLUE_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_light_blue_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_YELLOW_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_yellow_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_LIME_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_lime_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_PINK_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_pink_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_GRAY_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_gray_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_LIGHT_GRAY_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_light_gray_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_CYAN_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_cyan_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_PURPLE_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_purple_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_BLUE_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_blue_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_BROWN_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_brown_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_GREEN_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_green_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_RED_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_red_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_BLACK_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_black_hat", () -> LANDSKNECHT_HAT);
	public static final ModelLayerLocation LANDSKNECHT_WHITE_HAT_LOCATION = INSTANCE.addDecorationModel("landsknecht_white_hat", () -> LANDSKNECHT_HAT);

	public AddonModels(String modId)
	{
		super(modId);
	}
}

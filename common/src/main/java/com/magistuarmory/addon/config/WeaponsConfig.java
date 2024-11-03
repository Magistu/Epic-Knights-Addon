package com.magistuarmory.addon.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

@Config(name = "weapons")
public class WeaponsConfig implements ConfigData
{
    @ConfigEntry.Gui.CollapsibleObject
    public BarMaceConfig barMace;
    @ConfigEntry.Gui.CollapsibleObject
    public BattleaxeConfig battleaxe;
    @ConfigEntry.Gui.CollapsibleObject
    public CrowBeakConfig crowBeak;
    @ConfigEntry.Gui.CollapsibleObject
    public FranciscaAxeConfig franciscaAxe;
    @ConfigEntry.Gui.CollapsibleObject
    public RoundMaceConfig roundMace;
    @ConfigEntry.Gui.CollapsibleObject
    public WarAxeConfig warAxe;
    @ConfigEntry.Gui.CollapsibleObject
    public WarHammerConfig warHammer;
    @ConfigEntry.Gui.CollapsibleObject
    public BollockDaggerConfig bollockDagger;
    @ConfigEntry.Gui.CollapsibleObject
    public DaggerConfig dagger;
    @ConfigEntry.Gui.CollapsibleObject
    public ParryingDaggerConfig parryingDagger;
    @ConfigEntry.Gui.CollapsibleObject
    public RondelDaggerConfig rondelDagger;
    @ConfigEntry.Gui.CollapsibleObject
    public SickleConfig sickle;
    @ConfigEntry.Gui.CollapsibleObject
    public ExecutionersSwordConfig executionersSword;
    @ConfigEntry.Gui.CollapsibleObject
    public GermanGreatswordConfig germanGreatsword;
    @ConfigEntry.Gui.CollapsibleObject
    public TwoHandedMesserConfig twoHandedMesser;
    @ConfigEntry.Gui.CollapsibleObject
    public EnglishPoleaxeConfig englishPoleaxe;
    @ConfigEntry.Gui.CollapsibleObject
    public FrenchHalberdConfig frenchHalberd;
    @ConfigEntry.Gui.CollapsibleObject
    public ItalianPoleaxeConfig italianPoleaxe;
    @ConfigEntry.Gui.CollapsibleObject
    public SwissHalberdConfig swissHalberd;
    @ConfigEntry.Gui.CollapsibleObject
    public LanceConfig lance;
    @ConfigEntry.Gui.CollapsibleObject
    public BroadaxeConfig broadaxe;
    @ConfigEntry.Gui.CollapsibleObject
    public DaneaxeConfig daneaxe;
    @ConfigEntry.Gui.CollapsibleObject
    public GallowglassAxeConfig gallowglassAxe;
    @ConfigEntry.Gui.CollapsibleObject
    public HammerSpearConfig hammerSpear;
    @ConfigEntry.Gui.CollapsibleObject
    public TwoHandedEveningStarConfig twoHandedEveningStar;
    @ConfigEntry.Gui.CollapsibleObject
    public CavalrySabreConfig cavalrySabre;
    @ConfigEntry.Gui.CollapsibleObject
    public CutlassConfig cutlass;
    @ConfigEntry.Gui.CollapsibleObject
    public FalchionConfig falchion;
    @ConfigEntry.Gui.CollapsibleObject
    public FederConfig feder;
    @ConfigEntry.Gui.CollapsibleObject
    public GrandFalchionConfig grandFalchion;
    @ConfigEntry.Gui.CollapsibleObject
    public KingSwordConfig kingSword;
    @ConfigEntry.Gui.CollapsibleObject
    public LongswordConfig longsword;
    @ConfigEntry.Gui.CollapsibleObject
    public LongSeaxConfig longSeax;
    @ConfigEntry.Gui.CollapsibleObject
    public MaciejowskiMesserConfig maciejowskiMesser;
    @ConfigEntry.Gui.CollapsibleObject
    public MesserSwordConfig messerSword;
    @ConfigEntry.Gui.CollapsibleObject
    public RapierConfig rapier;
    @ConfigEntry.Gui.CollapsibleObject
    public ScimitarConfig scimitar;
    @ConfigEntry.Gui.CollapsibleObject
    public SideswordConfig sidesword;
    @ConfigEntry.Gui.CollapsibleObject
    public TrainingSwordConfig trainingSword;
    @ConfigEntry.Gui.CollapsibleObject
    public BillhookConfig billhook;
    @ConfigEntry.Gui.CollapsibleObject
    public BoarSpearConfig boarSpear;
    @ConfigEntry.Gui.CollapsibleObject
    public FauchardConfig fauchard;
    @ConfigEntry.Gui.CollapsibleObject
    public GlaiveConfig glaive;
    @ConfigEntry.Gui.CollapsibleObject
    public GoedendagConfig goedendag;
    @ConfigEntry.Gui.CollapsibleObject
    public MilitaryForkConfig militaryFork;
    @ConfigEntry.Gui.CollapsibleObject
    public PartisanConfig partisan;
    @ConfigEntry.Gui.CollapsibleObject
    public ScytheConfig scythe;
    @ConfigEntry.Gui.CollapsibleObject
    public ShortSpearConfig shortSpear;
    @ConfigEntry.Gui.CollapsibleObject
    public VoulgeConfig voulge;
    @ConfigEntry.Gui.CollapsibleObject
    public WelshGuisarmeConfig welshGuisarme;
    @ConfigEntry.Gui.CollapsibleObject
    public ArmingSwordTypeXiiiConfig armingSwordTypeXiii;
    @ConfigEntry.Gui.CollapsibleObject
    public ArmingSwordTypeXivConfig armingSwordTypeXiv;
    @ConfigEntry.Gui.CollapsibleObject
    public ArmingSwordTypeXvConfig armingSwordTypeXv;
    @ConfigEntry.Gui.CollapsibleObject
    public RichSaxonSwordConfig richSaxonSword;
    @ConfigEntry.Gui.CollapsibleObject
    public SabreConfig sabre;
    @ConfigEntry.Gui.CollapsibleObject
    public SaxonSwordConfig saxonSword;
    @ConfigEntry.Gui.CollapsibleObject
    public ShortSeaxConfig shortSeax;
    @ConfigEntry.Gui.CollapsibleObject
    public SwordbreakerConfig swordbreaker;

    public WeaponsConfig() {
        this.barMace = new BarMaceConfig();
        this.battleaxe = new BattleaxeConfig();
        this.crowBeak = new CrowBeakConfig();
        this.franciscaAxe = new FranciscaAxeConfig();
        this.roundMace = new RoundMaceConfig();
        this.warAxe = new WarAxeConfig();
        this.warHammer = new WarHammerConfig();
        this.bollockDagger = new BollockDaggerConfig();
        this.dagger = new DaggerConfig();
        this.parryingDagger = new ParryingDaggerConfig();
        this.rondelDagger = new RondelDaggerConfig();
        this.sickle = new SickleConfig();
        this.executionersSword = new ExecutionersSwordConfig();
        this.germanGreatsword = new GermanGreatswordConfig();
        this.twoHandedMesser = new TwoHandedMesserConfig();
        this.englishPoleaxe = new EnglishPoleaxeConfig();
        this.frenchHalberd = new FrenchHalberdConfig();
        this.italianPoleaxe = new ItalianPoleaxeConfig();
        this.swissHalberd = new SwissHalberdConfig();
        this.lance = new LanceConfig();
        this.broadaxe = new BroadaxeConfig();
        this.daneaxe = new DaneaxeConfig();
        this.gallowglassAxe = new GallowglassAxeConfig();
        this.hammerSpear = new HammerSpearConfig();
        this.twoHandedEveningStar = new TwoHandedEveningStarConfig();
        this.cavalrySabre = new CavalrySabreConfig();
        this.cutlass = new CutlassConfig();
        this.falchion = new FalchionConfig();
        this.feder = new FederConfig();
        this.grandFalchion = new GrandFalchionConfig();
        this.kingSword = new KingSwordConfig();
        this.longsword = new LongswordConfig();
        this.longSeax = new LongSeaxConfig();
        this.maciejowskiMesser = new MaciejowskiMesserConfig();
        this.messerSword = new MesserSwordConfig();
        this.rapier = new RapierConfig();
        this.scimitar = new ScimitarConfig();
        this.sidesword = new SideswordConfig();
        this.trainingSword = new TrainingSwordConfig();
        this.billhook = new BillhookConfig();
        this.boarSpear = new BoarSpearConfig();
        this.fauchard = new FauchardConfig();
        this.glaive = new GlaiveConfig();
        this.goedendag = new GoedendagConfig();
        this.militaryFork = new MilitaryForkConfig();
        this.partisan = new PartisanConfig();
        this.scythe = new ScytheConfig();
        this.shortSpear = new ShortSpearConfig();
        this.voulge = new VoulgeConfig();
        this.welshGuisarme = new WelshGuisarmeConfig();
        this.armingSwordTypeXiii = new ArmingSwordTypeXiiiConfig();
        this.armingSwordTypeXiv = new ArmingSwordTypeXivConfig();
        this.armingSwordTypeXv = new ArmingSwordTypeXvConfig();
        this.richSaxonSword = new RichSaxonSwordConfig();
        this.sabre = new SabreConfig();
        this.saxonSword = new SaxonSwordConfig();
        this.shortSeax = new ShortSeaxConfig();
        this.swordbreaker = new SwordbreakerConfig();
    }

    public static class BarMaceConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public BarMaceConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.55f;
            this.baseAttackSpeed = 1.18f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class BattleaxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public BattleaxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 5.30f;
            this.baseAttackSpeed = 1.05f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class CrowBeakConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public CrowBeakConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.20f;
            this.baseAttackSpeed = 1.26f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class FranciscaAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public FranciscaAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.30f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class RoundMaceConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RoundMaceConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.70f;
            this.baseAttackSpeed = 1.25f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class WarAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public WarAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 5.30f;
            this.baseAttackSpeed = 1.05f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class WarHammerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public WarHammerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.60f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class BollockDaggerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public BollockDaggerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.80f;
            this.baseAttackSpeed = 1.80f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class DaggerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public DaggerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.80f;
            this.baseAttackSpeed = 1.80f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class ParryingDaggerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ParryingDaggerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.50f;
            this.baseAttackSpeed = 1.97f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class RondelDaggerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RondelDaggerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.30f;
            this.baseAttackSpeed = 1.65f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SickleConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SickleConfig() {
            this.enabled = true;
            this.baseAttackDamage = 1.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class ExecutionersSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ExecutionersSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 6.00f;
            this.baseAttackSpeed = 1.12f;
            this.bonusAttackReach = 0.20f;
        }
    }
    public static class GermanGreatswordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GermanGreatswordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 5.90f;
            this.baseAttackSpeed = 1.15f;
            this.bonusAttackReach = 0.50f;
        }
    }
    public static class TwoHandedMesserConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public TwoHandedMesserConfig() {
            this.enabled = true;
            this.baseAttackDamage = 5.60f;
            this.baseAttackSpeed = 1.15f;
            this.bonusAttackReach = 0.50f;
        }
    }
    public static class EnglishPoleaxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public EnglishPoleaxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.60f;
            this.baseAttackSpeed = 0.85f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class FrenchHalberdConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public FrenchHalberdConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.15f;
            this.baseAttackSpeed = 0.90f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class ItalianPoleaxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ItalianPoleaxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.40f;
            this.baseAttackSpeed = 0.90f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class SwissHalberdConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SwissHalberdConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.35f;
            this.baseAttackSpeed = 0.92f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class LanceConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public LanceConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.00f;
            this.baseAttackSpeed = 1.00f;
            this.bonusAttackReach = 2.00f;
        }
    }
    public static class BroadaxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public BroadaxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 6.80f;
            this.baseAttackSpeed = 1.04f;
            this.bonusAttackReach = 0.80f;
        }
    }
    public static class DaneaxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public DaneaxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.20f;
            this.baseAttackSpeed = 0.94f;
            this.bonusAttackReach = 0.90f;
        }
    }
    public static class GallowglassAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GallowglassAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.20f;
            this.baseAttackSpeed = 0.94f;
            this.bonusAttackReach = 0.90f;
        }
    }
    public static class HammerSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public HammerSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.20f;
            this.baseAttackSpeed = 1.00f;
            this.bonusAttackReach = 0.80f;
        }
    }
    public static class TwoHandedEveningStarConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public TwoHandedEveningStarConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.20f;
            this.baseAttackSpeed = 1.00f;
            this.bonusAttackReach = 0.80f;
        }
    }
    public static class CavalrySabreConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public CavalrySabreConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.58f;
            this.baseAttackSpeed = 1.53f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class CutlassConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public CutlassConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.80f;
            this.baseAttackSpeed = 1.53f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class FalchionConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public FalchionConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.55f;
            this.baseAttackSpeed = 1.55f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class FederConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public FederConfig() {
            this.enabled = true;
            this.baseAttackDamage = 0.00f;
            this.baseAttackSpeed = 1.50f;
            this.bonusAttackReach = 0.20f;
        }
    }
    public static class GrandFalchionConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GrandFalchionConfig() {
            this.enabled = true;
            this.baseAttackDamage = 5.91f;
            this.baseAttackSpeed = 1.06f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class KingSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public KingSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.50f;
            this.baseAttackSpeed = 1.36f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class LongswordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public LongswordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.20f;
            this.baseAttackSpeed = 1.42f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class LongSeaxConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public LongSeaxConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.00f;
            this.baseAttackSpeed = 1.46f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class MaciejowskiMesserConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public MaciejowskiMesserConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.48f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class MesserSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public MesserSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.45f;
            this.baseAttackSpeed = 1.50f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class RapierConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RapierConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.40f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class ScimitarConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ScimitarConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.90f;
            this.baseAttackSpeed = 1.50f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SideswordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SideswordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.68f;
            this.baseAttackSpeed = 1.46f;
            this.bonusAttackReach = 0.10f;
        }
    }
    public static class TrainingSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public TrainingSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 0.00f;
            this.baseAttackSpeed = 1.40f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class BillhookConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public BillhookConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.53f;
            this.baseAttackSpeed = 1.35f;
            this.bonusAttackReach = 1.50f;
        }
    }
    public static class BoarSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public BoarSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.15f;
            this.bonusAttackReach = 1.50f;
        }
    }
    public static class FauchardConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public FauchardConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.15f;
            this.baseAttackSpeed = 1.10f;
            this.bonusAttackReach = 2.00f;
        }
    }
    public static class GlaiveConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GlaiveConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.10f;
            this.baseAttackSpeed = 1.15f;
            this.bonusAttackReach = 2.00f;
        }
    }
    public static class GoedendagConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public GoedendagConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.90f;
            this.baseAttackSpeed = 1.10f;
            this.bonusAttackReach = 1.00f;
        }
    }
    public static class MilitaryForkConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public MilitaryForkConfig() {
            this.enabled = true;
            this.baseAttackDamage = 2.90f;
            this.baseAttackSpeed = 1.12f;
            this.bonusAttackReach = 1.80f;
        }
    }
    public static class PartisanConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public PartisanConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.35f;
            this.baseAttackSpeed = 1.17f;
            this.bonusAttackReach = 1.90f;
        }
    }
    public static class ScytheConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ScytheConfig() {
            this.enabled = true;
            this.baseAttackDamage = 5.00f;
            this.baseAttackSpeed = 0.85f;
            this.bonusAttackReach = 1.20f;
        }
    }
    public static class ShortSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ShortSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 1.45f;
        }
    }
    public static class VoulgeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public VoulgeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.20f;
            this.baseAttackSpeed = 1.15f;
            this.bonusAttackReach = 1.60f;
        }
    }
    public static class WelshGuisarmeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public WelshGuisarmeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.07f;
            this.bonusAttackReach = 1.90f;
        }
    }
    public static class ArmingSwordTypeXiiiConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ArmingSwordTypeXiiiConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class ArmingSwordTypeXivConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ArmingSwordTypeXivConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class ArmingSwordTypeXvConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ArmingSwordTypeXvConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class RichSaxonSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public RichSaxonSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.38f;
            this.baseAttackSpeed = 1.65f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SabreConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SabreConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.61f;
            this.baseAttackSpeed = 1.58f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SaxonSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SaxonSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class ShortSeaxConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public ShortSeaxConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.25f;
            this.baseAttackSpeed = 1.68f;
            this.bonusAttackReach = 0.00f;
        }
    }
    public static class SwordbreakerConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;

        public SwordbreakerConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
}

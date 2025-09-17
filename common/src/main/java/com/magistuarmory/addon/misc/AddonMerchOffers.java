package com.magistuarmory.addon.misc;

import com.magistuarmory.addon.item.AddonItems;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;

import java.util.Optional;

public class AddonMerchOffers {
    public static VillagerTrades.ItemListing[] ARMORER_TRADES;
    public static VillagerTrades.ItemListing[] WANDERING_TRADER_TRADES;

    public static void init() {
        LifecycleEvent.SETUP.register(AddonMerchOffers::setup);
    }

    public static void setup() {
        ARMORER_TRADES = new VillagerTrades.ItemListing[] {
            new SimpleTrade(new ItemCost(Items.EMERALD, 1), Optional.empty(), new ItemStack(AddonItems.FULLY_GILDING_TEMPLATE.get()),
                    5, 0, 0.0f),
        };

        WANDERING_TRADER_TRADES = new VillagerTrades.ItemListing[] {
            new SimpleTrade(new ItemCost(Items.EMERALD, 1), Optional.empty(), new ItemStack(AddonItems.RAM_HORNS_DECORATION.get()),
                    5, 0, 0.0f),
            new SimpleTrade(new ItemCost(Items.EMERALD, 1), Optional.empty(), new ItemStack(AddonItems.GOOSE_DECORATION.get()),
                    5, 0, 0.0f)
        };

        TradeRegistry.registerVillagerTrade(VillagerProfession.ARMORER, 1, AddonMerchOffers.ARMORER_TRADES);
        TradeRegistry.registerTradeForWanderingTrader(false, AddonMerchOffers.WANDERING_TRADER_TRADES);
    }
}

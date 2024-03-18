package com.magistuarmory.addon.misc;

import com.magistuarmory.addon.item.AddonItems;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AddonMerchOffers
{
	public static VillagerTrades.ItemListing[] WANDERING_TRADER_TRADES;
	
	public static void init()
	{
		LifecycleEvent.SETUP.register(AddonMerchOffers::setup);
	}
	
	public static void setup()
	{
		WANDERING_TRADER_TRADES = new VillagerTrades.ItemListing[] {
			new SimpleTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(AddonItems.RAM_HORNS_DECORATION.get()), 5, 0, 1),
			new SimpleTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(AddonItems.GOOSE_DECORATION.get()), 5, 0, 1)
		};
		
		TradeRegistry.registerTradeForWanderingTrader(false, AddonMerchOffers.WANDERING_TRADER_TRADES);
	}
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class FlowersplusModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_WOOD_PLANK.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_LOG_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_WOOD_STRIPPED.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_TRAPDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_SAPLING.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_DOOR.get().asItem())
			event.setBurnTime(200);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_BUTTON.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FlowersplusModBlocks.LUPINE_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
	}
}

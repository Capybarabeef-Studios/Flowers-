
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.miljo.flowers.FlowersplusMod;

public class FlowersplusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FlowersplusMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FLOWERS_PLUS = REGISTRY.register("flowers_plus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.flowersplus.flowers_plus")).icon(() -> new ItemStack(FlowersplusModBlocks.AROMAFLORA_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FlowersplusModBlocks.AROMAFLORA_BLOCK.get().asItem());
				tabData.accept(FlowersplusModBlocks.GOLDEN_SHOWER.get().asItem());
				tabData.accept(FlowersplusModBlocks.BLUE_SAGE.get().asItem());
				tabData.accept(FlowersplusModBlocks.BUTTERFLY_BUSH.get().asItem());
				tabData.accept(FlowersplusModBlocks.FUSCHIA.get().asItem());
				tabData.accept(FlowersplusModBlocks.HORTENSIA.get().asItem());
				tabData.accept(FlowersplusModBlocks.LARKSPUR.get().asItem());
				tabData.accept(FlowersplusModBlocks.LAVANDER.get().asItem());
				tabData.accept(FlowersplusModBlocks.PURPLE_HIBISCUS.get().asItem());
				tabData.accept(FlowersplusModBlocks.ALPINE_POPPY.get().asItem());
				tabData.accept(FlowersplusModBlocks.AMARYLLIS.get().asItem());
				tabData.accept(FlowersplusModItems.NATUAL_GOLD.get());
				tabData.accept(FlowersplusModBlocks.BUTTERFLY_BUSH_RED.get().asItem());
				tabData.accept(FlowersplusModBlocks.BUTTERFLY_BUSH_BLUE.get().asItem());
				tabData.accept(FlowersplusModBlocks.BUTTERFLY_BUSH_MINT.get().asItem());
				tabData.accept(FlowersplusModBlocks.BUTTERFLY_BUSH_MAGENTA.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE.get().asItem());
				tabData.accept(FlowersplusModBlocks.MOUNTAIN_LAUREL.get().asItem());
				tabData.accept(FlowersplusModBlocks.FIRE_LILY.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_LOG.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_WOOD_PLANK.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_TRAPDOOR.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_MOSS.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_LEAVES.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_SAPLING.get().asItem());
				tabData.accept(FlowersplusModBlocks.CAT_TAIL.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_LOG_STRIPPED.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_WOOD.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_WOOD_STRIPPED.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_DOOR.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_STAIRS.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_SLAB.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_BUTTON.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_PRESSURE_PLATE.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_FENCE.get().asItem());
				tabData.accept(FlowersplusModBlocks.LUPINE_FENCE_GATE.get().asItem());
				tabData.accept(FlowersplusModBlocks.PINK_LARKSPUR.get().asItem());
				tabData.accept(FlowersplusModBlocks.LIGHT_BLUE_LARKSPUR.get().asItem());
				tabData.accept(FlowersplusModBlocks.SUNCREST_PETALS.get().asItem());
				tabData.accept(FlowersplusModBlocks.ANEMONE.get().asItem());
				tabData.accept(FlowersplusModBlocks.BLUE_BELL.get().asItem());
				tabData.accept(FlowersplusModBlocks.CRIMSON_FLUFF.get().asItem());
				tabData.accept(FlowersplusModBlocks.EMBERSPIRE_BLOOM.get().asItem());
				tabData.accept(FlowersplusModBlocks.DESERT_LILY.get().asItem());
				tabData.accept(FlowersplusModBlocks.HONEYFLARE.get().asItem());
				tabData.accept(FlowersplusModBlocks.SUNNYBUD.get().asItem());
				tabData.accept(FlowersplusModBlocks.PEACH_LARKSPUR.get().asItem());
				tabData.accept(FlowersplusModBlocks.PURPLE_LARKSPUR.get().asItem());
				tabData.accept(FlowersplusModBlocks.PURPLE_HYACINT.get().asItem());
				tabData.accept(FlowersplusModBlocks.YELLOW_HYACINT.get().asItem());
				tabData.accept(FlowersplusModBlocks.SUNCREST_IRIS.get().asItem());
				tabData.accept(FlowersplusModBlocks.TWILIGHT_IRIS.get().asItem());
			}).build());
}

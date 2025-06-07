
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import com.miljo.flowers.item.NatualGoldItem;
import com.miljo.flowers.FlowersplusMod;

public class FlowersplusModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FlowersplusMod.MODID);
	public static final DeferredItem<Item> AROMAFLORA_BLOCK = block(FlowersplusModBlocks.AROMAFLORA_BLOCK);
	public static final DeferredItem<Item> GOLDEN_SHOWER = doubleBlock(FlowersplusModBlocks.GOLDEN_SHOWER);
	public static final DeferredItem<Item> BLUE_SAGE = doubleBlock(FlowersplusModBlocks.BLUE_SAGE);
	public static final DeferredItem<Item> BUTTERFLY_BUSH = doubleBlock(FlowersplusModBlocks.BUTTERFLY_BUSH);
	public static final DeferredItem<Item> FUSCHIA = doubleBlock(FlowersplusModBlocks.FUSCHIA);
	public static final DeferredItem<Item> HORTENSIA = doubleBlock(FlowersplusModBlocks.HORTENSIA);
	public static final DeferredItem<Item> LARKSPUR = doubleBlock(FlowersplusModBlocks.LARKSPUR);
	public static final DeferredItem<Item> LAVANDER = block(FlowersplusModBlocks.LAVANDER);
	public static final DeferredItem<Item> PURPLE_HIBISCUS = doubleBlock(FlowersplusModBlocks.PURPLE_HIBISCUS);
	public static final DeferredItem<Item> ALPINE_POPPY = block(FlowersplusModBlocks.ALPINE_POPPY);
	public static final DeferredItem<Item> AMARYLLIS = block(FlowersplusModBlocks.AMARYLLIS);
	public static final DeferredItem<Item> NATUAL_GOLD = register("natual_gold", NatualGoldItem::new);
	public static final DeferredItem<Item> BUTTERFLY_BUSH_RED = doubleBlock(FlowersplusModBlocks.BUTTERFLY_BUSH_RED);
	public static final DeferredItem<Item> BUTTERFLY_BUSH_BLUE = doubleBlock(FlowersplusModBlocks.BUTTERFLY_BUSH_BLUE);
	public static final DeferredItem<Item> BUTTERFLY_BUSH_MINT = doubleBlock(FlowersplusModBlocks.BUTTERFLY_BUSH_MINT);
	public static final DeferredItem<Item> BUTTERFLY_BUSH_MAGENTA = doubleBlock(FlowersplusModBlocks.BUTTERFLY_BUSH_MAGENTA);
	public static final DeferredItem<Item> LUPINE = block(FlowersplusModBlocks.LUPINE);
	public static final DeferredItem<Item> MOUNTAIN_LAUREL = block(FlowersplusModBlocks.MOUNTAIN_LAUREL);
	public static final DeferredItem<Item> FIRE_LILY = block(FlowersplusModBlocks.FIRE_LILY);
	public static final DeferredItem<Item> LUPINE_LOG = block(FlowersplusModBlocks.LUPINE_LOG);
	public static final DeferredItem<Item> LUPINE_WOOD_PLANK = block(FlowersplusModBlocks.LUPINE_WOOD_PLANK);
	public static final DeferredItem<Item> LUPINE_TRAPDOOR = block(FlowersplusModBlocks.LUPINE_TRAPDOOR);
	public static final DeferredItem<Item> LUPINE_MOSS = block(FlowersplusModBlocks.LUPINE_MOSS);
	public static final DeferredItem<Item> LUPINE_LEAVES = block(FlowersplusModBlocks.LUPINE_LEAVES);
	public static final DeferredItem<Item> LUPINE_SAPLING = block(FlowersplusModBlocks.LUPINE_SAPLING);
	public static final DeferredItem<Item> CAT_TAIL = doubleBlock(FlowersplusModBlocks.CAT_TAIL);
	public static final DeferredItem<Item> LUPINE_LOG_STRIPPED = block(FlowersplusModBlocks.LUPINE_LOG_STRIPPED);
	public static final DeferredItem<Item> LUPINE_WOOD = block(FlowersplusModBlocks.LUPINE_WOOD);
	public static final DeferredItem<Item> LUPINE_WOOD_STRIPPED = block(FlowersplusModBlocks.LUPINE_WOOD_STRIPPED);
	public static final DeferredItem<Item> LUPINE_DOOR = doubleBlock(FlowersplusModBlocks.LUPINE_DOOR);
	public static final DeferredItem<Item> LUPINE_STAIRS = block(FlowersplusModBlocks.LUPINE_STAIRS);
	public static final DeferredItem<Item> LUPINE_SLAB = block(FlowersplusModBlocks.LUPINE_SLAB);
	public static final DeferredItem<Item> LUPINE_BUTTON = block(FlowersplusModBlocks.LUPINE_BUTTON);
	public static final DeferredItem<Item> LUPINE_PRESSURE_PLATE = block(FlowersplusModBlocks.LUPINE_PRESSURE_PLATE);
	public static final DeferredItem<Item> LUPINE_FENCE = block(FlowersplusModBlocks.LUPINE_FENCE);
	public static final DeferredItem<Item> LUPINE_FENCE_GATE = block(FlowersplusModBlocks.LUPINE_FENCE_GATE);
	public static final DeferredItem<Item> PINK_LARKSPUR = doubleBlock(FlowersplusModBlocks.PINK_LARKSPUR);
	public static final DeferredItem<Item> LIGHT_BLUE_LARKSPUR = doubleBlock(FlowersplusModBlocks.LIGHT_BLUE_LARKSPUR);
	public static final DeferredItem<Item> SUNCREST_PETALS = block(FlowersplusModBlocks.SUNCREST_PETALS);
	public static final DeferredItem<Item> ANEMONE = block(FlowersplusModBlocks.ANEMONE);
	public static final DeferredItem<Item> BLUE_BELL = block(FlowersplusModBlocks.BLUE_BELL);
	public static final DeferredItem<Item> CRIMSON_FLUFF = block(FlowersplusModBlocks.CRIMSON_FLUFF);
	public static final DeferredItem<Item> EMBERSPIRE_BLOOM = doubleBlock(FlowersplusModBlocks.EMBERSPIRE_BLOOM);
	public static final DeferredItem<Item> DESERT_LILY = block(FlowersplusModBlocks.DESERT_LILY);
	public static final DeferredItem<Item> HONEYFLARE = block(FlowersplusModBlocks.HONEYFLARE);
	public static final DeferredItem<Item> SUNNYBUD = block(FlowersplusModBlocks.SUNNYBUD);
	public static final DeferredItem<Item> PEACH_LARKSPUR = doubleBlock(FlowersplusModBlocks.PEACH_LARKSPUR);
	public static final DeferredItem<Item> PURPLE_LARKSPUR = doubleBlock(FlowersplusModBlocks.PURPLE_LARKSPUR);
	public static final DeferredItem<Item> PURPLE_HYACINT = block(FlowersplusModBlocks.PURPLE_HYACINT);
	public static final DeferredItem<Item> YELLOW_HYACINT = block(FlowersplusModBlocks.YELLOW_HYACINT);
	public static final DeferredItem<Item> SUNCREST_IRIS = block(FlowersplusModBlocks.SUNCREST_IRIS);
	public static final DeferredItem<Item> TWILIGHT_IRIS = block(FlowersplusModBlocks.TWILIGHT_IRIS);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new DoubleHighBlockItem(block.get(), properties), new Item.Properties());
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import com.miljo.flowers.block.YellowHyacintBlock;
import com.miljo.flowers.block.TwilightIrisBlock;
import com.miljo.flowers.block.SunnybudBlock;
import com.miljo.flowers.block.SuncrestPetalsBlock;
import com.miljo.flowers.block.SuncrestIrisBlock;
import com.miljo.flowers.block.PurpleLarkspurBlock;
import com.miljo.flowers.block.PurpleHyacintBlock;
import com.miljo.flowers.block.PurpleHibiscusBlock;
import com.miljo.flowers.block.PinkLarkspurBlock;
import com.miljo.flowers.block.PeachLarkspurBlock;
import com.miljo.flowers.block.MountainLaurelBlock;
import com.miljo.flowers.block.LupineWoodStrippedBlock;
import com.miljo.flowers.block.LupineWoodPlankBlock;
import com.miljo.flowers.block.LupineWoodBlock;
import com.miljo.flowers.block.LupineTrapdoorBlock;
import com.miljo.flowers.block.LupineStairsBlock;
import com.miljo.flowers.block.LupineSlabBlock;
import com.miljo.flowers.block.LupineSaplingBlock;
import com.miljo.flowers.block.LupinePressurePlateBlock;
import com.miljo.flowers.block.LupineMossBlock;
import com.miljo.flowers.block.LupineLogStrippedBlock;
import com.miljo.flowers.block.LupineLogBlock;
import com.miljo.flowers.block.LupineLeavesBlock;
import com.miljo.flowers.block.LupineFenceGateBlock;
import com.miljo.flowers.block.LupineFenceBlock;
import com.miljo.flowers.block.LupineDoorBlock;
import com.miljo.flowers.block.LupineButtonBlock;
import com.miljo.flowers.block.LupineBlock;
import com.miljo.flowers.block.LightBlueLarkspurBlock;
import com.miljo.flowers.block.LavanderBlock;
import com.miljo.flowers.block.LarkspurBlock;
import com.miljo.flowers.block.HortensiaBlock;
import com.miljo.flowers.block.HoneyflareBlock;
import com.miljo.flowers.block.GoldenShowerBlock;
import com.miljo.flowers.block.FuschiaBlock;
import com.miljo.flowers.block.FireLilyBlock;
import com.miljo.flowers.block.EmberspireBloomLarkspurBlock;
import com.miljo.flowers.block.DesertLilyBlock;
import com.miljo.flowers.block.CrimsonFluffBlock;
import com.miljo.flowers.block.CatTailBlock;
import com.miljo.flowers.block.ButterflyBushRedBlock;
import com.miljo.flowers.block.ButterflyBushMintBlock;
import com.miljo.flowers.block.ButterflyBushMagentaBlock;
import com.miljo.flowers.block.ButterflyBushBlueBlock;
import com.miljo.flowers.block.ButterflyBushBlock;
import com.miljo.flowers.block.BlueSageBlock;
import com.miljo.flowers.block.BlueBellBlock;
import com.miljo.flowers.block.AromafloraBlockBlock;
import com.miljo.flowers.block.AnemoneBlock;
import com.miljo.flowers.block.AmaryllisBlock;
import com.miljo.flowers.block.AlpinePoppyBlock;
import com.miljo.flowers.FlowersplusMod;

public class FlowersplusModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FlowersplusMod.MODID);
	public static final DeferredBlock<Block> AROMAFLORA_BLOCK = register("aromaflora_block", AromafloraBlockBlock::new);
	public static final DeferredBlock<Block> GOLDEN_SHOWER = register("golden_shower", GoldenShowerBlock::new);
	public static final DeferredBlock<Block> BLUE_SAGE = register("blue_sage", BlueSageBlock::new);
	public static final DeferredBlock<Block> BUTTERFLY_BUSH = register("butterfly_bush", ButterflyBushBlock::new);
	public static final DeferredBlock<Block> FUSCHIA = register("fuschia", FuschiaBlock::new);
	public static final DeferredBlock<Block> HORTENSIA = register("hortensia", HortensiaBlock::new);
	public static final DeferredBlock<Block> LARKSPUR = register("larkspur", LarkspurBlock::new);
	public static final DeferredBlock<Block> LAVANDER = register("lavander", LavanderBlock::new);
	public static final DeferredBlock<Block> PURPLE_HIBISCUS = register("purple_hibiscus", PurpleHibiscusBlock::new);
	public static final DeferredBlock<Block> ALPINE_POPPY = register("alpine_poppy", AlpinePoppyBlock::new);
	public static final DeferredBlock<Block> AMARYLLIS = register("amaryllis", AmaryllisBlock::new);
	public static final DeferredBlock<Block> BUTTERFLY_BUSH_RED = register("butterfly_bush_red", ButterflyBushRedBlock::new);
	public static final DeferredBlock<Block> BUTTERFLY_BUSH_BLUE = register("butterfly_bush_blue", ButterflyBushBlueBlock::new);
	public static final DeferredBlock<Block> BUTTERFLY_BUSH_MINT = register("butterfly_bush_mint", ButterflyBushMintBlock::new);
	public static final DeferredBlock<Block> BUTTERFLY_BUSH_MAGENTA = register("butterfly_bush_magenta", ButterflyBushMagentaBlock::new);
	public static final DeferredBlock<Block> LUPINE = register("lupine", LupineBlock::new);
	public static final DeferredBlock<Block> MOUNTAIN_LAUREL = register("mountain_laurel", MountainLaurelBlock::new);
	public static final DeferredBlock<Block> FIRE_LILY = register("fire_lily", FireLilyBlock::new);
	public static final DeferredBlock<Block> LUPINE_LOG = register("lupine_log", LupineLogBlock::new);
	public static final DeferredBlock<Block> LUPINE_WOOD_PLANK = register("lupine_wood_plank", LupineWoodPlankBlock::new);
	public static final DeferredBlock<Block> LUPINE_TRAPDOOR = register("lupine_trapdoor", LupineTrapdoorBlock::new);
	public static final DeferredBlock<Block> LUPINE_MOSS = register("lupine_moss", LupineMossBlock::new);
	public static final DeferredBlock<Block> LUPINE_LEAVES = register("lupine_leaves", LupineLeavesBlock::new);
	public static final DeferredBlock<Block> LUPINE_SAPLING = register("lupine_sapling", LupineSaplingBlock::new);
	public static final DeferredBlock<Block> CAT_TAIL = register("cat_tail", CatTailBlock::new);
	public static final DeferredBlock<Block> LUPINE_LOG_STRIPPED = register("lupine_log_stripped", LupineLogStrippedBlock::new);
	public static final DeferredBlock<Block> LUPINE_WOOD = register("lupine_wood", LupineWoodBlock::new);
	public static final DeferredBlock<Block> LUPINE_WOOD_STRIPPED = register("lupine_wood_stripped", LupineWoodStrippedBlock::new);
	public static final DeferredBlock<Block> LUPINE_DOOR = register("lupine_door", LupineDoorBlock::new);
	public static final DeferredBlock<Block> LUPINE_STAIRS = register("lupine_stairs", LupineStairsBlock::new);
	public static final DeferredBlock<Block> LUPINE_SLAB = register("lupine_slab", LupineSlabBlock::new);
	public static final DeferredBlock<Block> LUPINE_BUTTON = register("lupine_button", LupineButtonBlock::new);
	public static final DeferredBlock<Block> LUPINE_PRESSURE_PLATE = register("lupine_pressure_plate", LupinePressurePlateBlock::new);
	public static final DeferredBlock<Block> LUPINE_FENCE = register("lupine_fence", LupineFenceBlock::new);
	public static final DeferredBlock<Block> LUPINE_FENCE_GATE = register("lupine_fence_gate", LupineFenceGateBlock::new);
	public static final DeferredBlock<Block> PINK_LARKSPUR = register("pink_larkspur", PinkLarkspurBlock::new);
	public static final DeferredBlock<Block> LIGHT_BLUE_LARKSPUR = register("light_blue_larkspur", LightBlueLarkspurBlock::new);
	public static final DeferredBlock<Block> SUNCREST_PETALS = register("suncrest_petals", SuncrestPetalsBlock::new);
	public static final DeferredBlock<Block> ANEMONE = register("anemone", AnemoneBlock::new);
	public static final DeferredBlock<Block> BLUE_BELL = register("blue_bell", BlueBellBlock::new);
	public static final DeferredBlock<Block> CRIMSON_FLUFF = register("crimson_fluff", CrimsonFluffBlock::new);
	public static final DeferredBlock<Block> EMBERSPIRE_BLOOM = register("emberspire_bloom", EmberspireBloomLarkspurBlock::new);
	public static final DeferredBlock<Block> DESERT_LILY = register("desert_lily", DesertLilyBlock::new);
	public static final DeferredBlock<Block> HONEYFLARE = register("honeyflare", HoneyflareBlock::new);
	public static final DeferredBlock<Block> SUNNYBUD = register("sunnybud", SunnybudBlock::new);
	public static final DeferredBlock<Block> PEACH_LARKSPUR = register("peach_larkspur", PeachLarkspurBlock::new);
	public static final DeferredBlock<Block> PURPLE_LARKSPUR = register("purple_larkspur", PurpleLarkspurBlock::new);
	public static final DeferredBlock<Block> PURPLE_HYACINT = register("purple_hyacint", PurpleHyacintBlock::new);
	public static final DeferredBlock<Block> YELLOW_HYACINT = register("yellow_hyacint", YellowHyacintBlock::new);
	public static final DeferredBlock<Block> SUNCREST_IRIS = register("suncrest_iris", SuncrestIrisBlock::new);
	public static final DeferredBlock<Block> TWILIGHT_IRIS = register("twilight_iris", TwilightIrisBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
